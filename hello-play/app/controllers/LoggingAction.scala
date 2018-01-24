package controllers

import play.api.mvc._
import play.api._
import javax.inject._
import scala.concurrent.Future
import play.api.libs.concurrent.Execution.Implicits._

class LoggingAction @Inject() (parser: BodyParsers.Default) extends ActionBuilderImpl(parser) {
  override def invokeBlock[A](request: Request[A], block: (Request[A]) => Future[Result]) = {
    Logger.info("Calling action")
    block(request)
  }

  override def composeAction[A](action: Action[A]) = new Logging(action)
}

case class Logging[A](action: Action[A]) extends Action[A] {

  def apply(request: Request[A]): Future[Result] = {
    Logger.info("Calling action")
    action(request)
  }

  override def parser = action.parser
  override def executionContext = action.executionContext
}
