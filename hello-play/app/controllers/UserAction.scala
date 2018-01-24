package controllers

import play.api.mvc._
import javax.inject.Inject
import scala.concurrent.Future
// import play.api.libs.concurrent.Execution.Implicits._
import scala.concurrent.ExecutionContext



class UserAction @Inject()(val parser: BodyParsers.Default)(implicit val executionContext: ExecutionContext)
  extends ActionBuilder[UserRequest, AnyContent] with ActionTransformer[Request, UserRequest] {
  def transform[A](request: Request[A]) = Future.successful {
    new UserRequest(request.session.get("username"), request)
  }
}


case class UserRequest[A](val username: Option[String], request: Request[A]) extends WrappedRequest[A](request)
