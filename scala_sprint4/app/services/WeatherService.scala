package services

import models._
import tools._
import javax.inject._
import play.api.libs.ws._
import play.api._
import scala.concurrent.Future

class WeatherService @Inject() (
  config: Configuration,
  ws: WSClient
){
  val weather_request_base_url=config.get[String]("weather.request.base.url")
  val weather_appid = config.get[String]("weather.request.appid")
  def getWeather(cityName:String):Unit={
    val request: WSRequest = ws.url(weather_request_base_url)
    val complexRequest: WSRequest =
      request
        .addQueryStringParameters("p" -> Tools.cityName2Pinyin(cityName))
        .addQueryStringParameters("appid" -> weather_appid)

    val futureResponse: Future[WSResponse] = complexRequest.get()
    // futureResponse.map{
    //   response =>
    //   (response.json).as[String]
    // }
    // println(futureResponse.json)


    // // println("futureResponse:"+futureResponse.toString)

    // val holder : WSRequestHolder = WS.url(weather_request_base_u2rl)
    // val complexHolder : WSRequestHolder = holder
    //   .withQueryString("p" -> Tools.cityName2Pinyin(cityName))
    //   .withQueryString("appid" -> weather_appid)

    // val futureResponse : Future[Response] = complexHolder.get()
    // println(futureResponse)
  }
}
