package controllers

import play.api._
import javax.inject._
import play.api.mvc._

class HomeController @Inject()(
  cc:ControllerComponents
)extends AbstractController(cc){
  def index = Action{ implicit request:Request[AnyContent] =>
    Ok(views.html.index("Welcome to Play!"))
  }
}
