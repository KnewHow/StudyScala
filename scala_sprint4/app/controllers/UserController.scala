package controllers

import scala.concurrent.Future
import play.api._
import javax.inject._
import play.api.mvc._

import java.nio.file.Paths

import java.util.Date

import play.filters.csrf._

import java.util.UUID.randomUUID
import scala.concurrent.ExecutionContext
import play.api.libs.concurrent.CustomExecutionContext
import play.api.libs.concurrent.Execution.Implicits._

import play.api.data._
import play.api.data.Forms._
import play.api.data.validation.Constraints._

import akka.stream.scaladsl._



import services._
import models._
import tools._
import exceptions._

class UserController @Inject()(
  cc:ControllerComponents,
  userService:UserSerice,

  weatherService:WeatherService,
  config: Configuration,
  ec: ExecutionContext,
  userAction:UserAction
) extends AbstractController(cc){

  // trait MyExecutionContext extends ExecutionContext

  // class MyExecutionContextImpl @Inject()(system: ActorSystem)
  // extends CustomExecutionContext(system, "my.executor") with MyExecutionContext

  val uAction2 = Action.andThen(userAction2)

  val picturePath = config.get[String]("user.avatar.disk.path")

  val suffix = config.get[String]("user.avatar.suffix")

  val user_avatar_server_path =config.get[String]("user.avatar.server.path")

  val userForm = Form(
    mapping(
      "id" -> number,
      "username" -> text,
      "password" -> text,
      "email" -> text,
      "avatar" -> text,
      "city" -> text,
      "gmt_create" -> date,
      "gmt_modified" -> date
      )(User.apply)(User.unapply)
  )

  val loginForm = Form(
    mapping(
      "username" -> text,
      "password" -> text
    )(LoginUser.apply)(LoginUser.unapply)
  )

  val UserIdForm = Form(
    mapping(
      "id" -> number
    )(UserId.apply)(UserId.unapply)
  )

  def doRegister = Action.async(parse.multipartFormData){ implicit request =>

    val filename = randomUUID().toString+suffix
    val avatar_path = user_avatar_server_path+filename

    //upload user avatar
    request.body.file("avatar").map{ picture =>
      picture.ref.moveTo(Paths.get(picturePath+filename), replace = true)
    }


    val userinfo = request.body.dataParts
    val errors = checkRegisterParameter(userinfo)
    println(errors)
    if(errors._1){
      Future(Forbidden(errors._2))
    }else{
      val user = new User(
        1,
        userinfo.get("username").get.mkString,
        Tools.MD5(userinfo.get("password").get.mkString),
        userinfo.get("email").get.mkString,
        avatar_path,
        userinfo.get("city").get.mkString,
        new Date(),
        new Date()
      )
      val futureId =  userService.register(user)
      // Ok(views.html.registerSuccess("Congratulation! Register Success"))
      futureId map(
        id => Ok(views.html.registerSuccess("Congratulation! Register Success"))
      )

    }

  }

  def register = Action{implicit request:Request[AnyContent] =>
    Ok(views.html.register(scala.collection.immutable.Map[String,String]()))
  }


  def toLoginPage = Action{ implicit request:Request[AnyContent] =>
    Ok(views.html.login(scala.collection.immutable.Map[String,String]()))
  }

  def doLogin = Action.async(parse.form(loginForm)){ implicit request =>
    val userData = request.body
    val user =  userService.login(
      userData.username,
      userData.password
    )
    user.map{
      case Some(u) =>
        val id = u.id.toString
        Redirect("/userHome.html").withSession(
          request.session + ("userId" -> id))
      case None =>Unauthorized("username or password error")
    }
  }

  def userHome = userAction.async{ request =>

    val u = request.user
    val weatherFuture = weatherService.getWeather(u.city)
    weatherFuture.map(w => Ok(views.html.userHome(u,w)))
  }

  def toChatPage = Action{ implicit request:Request[AnyContent] =>
    Ok(views.html.chatPage())
  }

  def socket = WebSocket.accept[String, String] {
    request =>

  // Log events to the console
  val in = Sink.foreach[String](println)

  // Send a single 'Hello!' message and then leave the socket open
  val out = Source.single("Hello!").concat(Source.maybe)

  Flow.fromSinkAndSource(in, out)
}

  def accessToken (implicit request: Request[_]):Unit={
    val token = CSRF.getToken
    println("token= "+token)
  }

  def checkRegisterParameter(userinfo:scala.Predef.Map[String, Seq[String]]):(Boolean,String)={
    val username = userinfo.get("username").get.mkString
    val password =  userinfo.get("password").get.mkString
    val email = userinfo.get("email").get.mkString

    var isErr = false
    var errorMsg = ""

    if(!Tools.isUsername(username)){
      errorMsg += "username must is 6-12 number and alphabet,"
      isErr = true
    }
    if(!Tools.isPassword(password)){
      errorMsg += "password  must is 6-12 number and alphabet,"
      isErr = true
    }

    if(!Tools.isEmail(email)){
      errorMsg += "email  must be right format,"
      isErr = true
    }
    (isErr,errorMsg)
  }

  def checkFormParameters(userinfo:scala.Predef.Map[String, Seq[String]]):scala.collection.immutable.Map[String,String] ={

    val username = userinfo.get("username").get.mkString
    val password =  userinfo.get("password").get.mkString
    val email = userinfo.get("email").get.mkString
    val errors = new  scala.collection.mutable.HashMap[String,String]
    if(!Tools.isUsername(username)){
      errors.put("usernameError","username must is 6-12 number and alphabet")
    }
    if(!Tools.isPassword(password)){
      errors.put("passwordError","password  must is 6-12 number and alphabet")
    }

    if(!Tools.isEmail(email)){
      errors.put("emailError","email  must be right format")
    }

    //form data show
    if(!errors.isEmpty){
      errors.put("username",username)
      errors.put("password",password)
      errors.put("email",email)
      errors.put("city", userinfo.get("city").get.mkString)
    }

    new scala.collection.immutable.HashMap ++ errors
  }

  def userAction2 = new ActionRefiner[Request,UserRequest] {
    def executionContext = implicitly[ExecutionContext]
    def refine[A](input:Request[A]) =  {
      input.session.get("userId").map { id =>
        userService.queryUserById(id.toInt)
        .map{
          case Some(u) =>
            Right(UserRequest(u,input))
          case None =>
            Left(Forbidden("user is not exsit"))
        }
      }.getOrElse {
        Future(Left(Forbidden("please login in first")))
      }
    }
  }


}
