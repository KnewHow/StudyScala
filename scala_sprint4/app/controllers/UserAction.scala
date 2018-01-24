
package controllers

import play.api.mvc._
import play.api._
import javax.inject.Inject
import scala.concurrent.Future
import scala.concurrent.ExecutionContext
import play.api.libs.concurrent.Execution.Implicits._
import services._
import models._
import exceptions._

class UserAction @Inject()(
  val parser: BodyParsers.Default,
  userService:UserSerice
) extends ActionBuilder[UserRequest, AnyContent] with ActionRefiner[Request, UserRequest] {
  def executionContext = implicitly[ExecutionContext]
    def refine[A](input:Request[A]) =  {
      input.session.get("userId").map { id =>
        userService.queryUserById(id.toInt)
        .map{
          case Some(u) =>
            Right(UserRequest(u,input))
          case None =>
            Left(Results.Forbidden("user is not exsit"))
        }
      }.getOrElse {
        Future(Left(Results.Forbidden("please login in first")))
      }
    }
}

case class UserRequest[A](val user:User, request: Request[A]) extends WrappedRequest[A](request){
}
