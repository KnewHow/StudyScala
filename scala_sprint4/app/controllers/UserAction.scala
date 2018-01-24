package controllers

import play.api.mvc._
import javax.inject.Inject
import scala.concurrent.Future
// import play.api.libs.concurrent.Execution.Implicits._
import scala.concurrent.ExecutionContext
import services._
import models._

class UserAction @Inject()(
  val parser: BodyParsers.Default,
  userService:UserSerice
)(implicit val executionContext: ExecutionContext) extends ActionBuilder[UserRequest, AnyContent] with ActionTransformer[Request, UserRequest] {
  def transform[A](request: Request[A]) = {
    request.session.get("userId").map{ id =>
      userService.queryUserById(id.toInt).map{
        case u =>  UserRequest(u, request)
        case None => UserRequest(None,request)
        // case None => Unauthorized("username or password error")
      }
    }.getOrElse {
      Future(UserRequest(None,request))
    }
  }
}

case class UserRequest[A](val user: Option[User], request: Request[A]) extends WrappedRequest[A](request){
}
