import javax.inject.Inject
import scala.concurrent.Future
import scala.concurrent.duration._

import play.api._
import play.api.mvc._
import play.api.libs.ws._
import play.api.http.HttpEntity

import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import akka.stream.scaladsl._
import akka.util.ByteString

class WeatherController @Inject()(
  cc:ControllerComponents,
  config: Configuration,
  ws: WSClient
) extends AbstractController(cc){

}
