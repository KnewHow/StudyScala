package controllers
import play.api.mvc._
import play.api.mvc.request.RemoteConnection
import javax.inject.Inject
import scala.concurrent.Future

class MyController @Inject()(loggingAction: LoggingAction,
                             cc:ControllerComponents)
  extends AbstractController(cc) {
  def index = loggingAction {
    Ok("Hello World")
  }

  def submit = loggingAction(parse.text){request =>
    Ok("Get a request body is:"+request.body)
  }

  def index2 = Logging{
    Action{
      Ok("lalal")
    }
  }

  def showFodward = xForwardedFor{ //request =>
    Action{
      Redirect("/action/builder/showFodward.html")
    }
    // Action{
    //   request.session.get("connected").map { user =>
    //     Ok("Hello " + user)
    //   }.getOrElse {
    //     Unauthorized("Oops, you are not connected")
    //   }
    // }
  }

  def showHttps = onlyHttps{
    Action{
      Ok("https")
    }
  }

  def xForwardedFor[A](action: Action[A]) = Action.async(action.parser) { request =>
    val newRequest = request.headers.get("X-Forwarded-For") match {
      case None => request
      case Some(xff) =>
        val xffConnection = RemoteConnection(xff, request.connection.secure, None)
        request.withConnection(xffConnection)
    }
    action(newRequest)
  }

  def onlyHttps[A](action: Action[A]) = Action.async(action.parser) { request =>
    request.headers.get("X-Forwarded-Proto").collect {
      case "https" => action(request)
    } getOrElse {
      Future.successful(Forbidden("Only HTTPS requests allowed"))
    }
  }

}
