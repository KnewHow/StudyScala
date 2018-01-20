package controllers

import play.api._
import javax.inject._
import play.api.mvc._

import java.nio.file.Paths

import java.util.Date

import play.filters.csrf._

import java.util.UUID.randomUUID
import scala.concurrent.ExecutionContext

import services._
import models._
import tools._
import exceptions._

class UserController @Inject()(
  cc:ControllerComponents,
  userService:UserSerice,
  weatherService:WeatherService,
  config: Configuration,
  ec: ExecutionContext
) extends AbstractController(cc){

  val picturePath = config.get[String]("user.avatar.disk.path")

  val suffix = config.get[String]("user.avatar.suffix")

  val user_avatar_server_path =config.get[String]("user.avatar.server.path") ;
  def doRegister = Action(parse.multipartFormData){ implicit request =>

    val filename = randomUUID().toString+suffix
    val avatar_path = user_avatar_server_path+filename

    //upload user avatar
    request.body.file("avatar").map{ picture =>
      picture.ref.moveTo(Paths.get(picturePath+filename), replace = true)
    }
    val userinfo = request.body.dataParts
    val map = checkFormParameters(userinfo)
    if(map.size!=0){
      Ok(views.html.register(map))
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
      userService.register(user)
      Ok(views.html.registerSuccess("Congratulation! Register Success"))
    }

  }

  def register = Action{implicit request:Request[AnyContent] =>
    Ok(views.html.register(scala.collection.immutable.Map[String,String]()))
  }


  def toLoginPage = Action{ implicit request:Request[AnyContent] =>
    Ok(views.html.login(scala.collection.immutable.Map[String,String]()))
  }

  def doLogin = Action{ implicit request:Request[AnyContent] =>
    val formData = request.body.asFormUrlEncoded
    try{
      val user =  userService.login(formData.get("username").mkString,
        formData.get("password").mkString)
      val weather = weatherService.getWeather(ec,user.city)
      println("weather is:"+weather.isCompleted)
      Ok(views.html.userHome(user,weather))
    }catch{
      case ex:UserException =>
        Ok(views.html.login(scala.collection.immutable.Map[String,String](
          ("msg",ex.getMessage()),
          ("username",formData.get("username").mkString),
          ("password",formData.get("password").mkString)
        )))
    }


  }

  def accessToken (implicit request: Request[_]):Unit={
    val token = CSRF.getToken
    println("token= "+token)
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
}
