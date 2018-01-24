package controllers

import play.api.mvc._
import javax.inject.Inject
import scala.concurrent.Future
import play.api.libs.concurrent.Execution.Implicits._
import scala.concurrent.ExecutionContext
import models._
import services._

class LearnRequestController @Inject()(
  userAction:UserAction,
  cc:ControllerComponents,
  itemService:ItemService
) extends AbstractController(cc){

  def ItemAction(itemId: String) = new ActionRefiner[UserRequest, ItemRequest] {
  def executionContext = implicitly[ExecutionContext]
  def refine[A](input: UserRequest[A]) = Future.successful {
    itemService.findById(itemId)
      .map(new ItemRequest(_, input))
      .toRight(NotFound)
  }
}

  def showUserAuthentication = userAction.async{ request =>
    println(request.request)
    Future(Ok("ygh"))
  }

  def showRequestInfo = ItemAction{
    "2"
  }
}

class ItemRequest[A](val item: Item, request: UserRequest[A]) extends WrappedRequest[A](request) {
  def username = request.username
}
