package services

import models.Weather
import tools._
import javax.inject._
import play.api.libs.ws._
import play.api._
import scala.concurrent.Future
import scala.concurrent.Await
import scala.concurrent.ExecutionContext
import scala.concurrent.duration._
import play.api.libs.json.Json
// import ExecutionContext.Implicits.global

class WeatherService @Inject() (
  config: Configuration,
  ws: WSClient,
  ec: ExecutionContext
){
  val weather_request_base_url=config.get[String]("weather.request.base.url")
  val weather_appid = config.get[String]("weather.request.appid")

  def getWeather(implicit ec: ExecutionContext,cityName:String):Future[Weather]={
    val request: WSRequest = ws.url(weather_request_base_url)
    val complexRequest: WSRequest =
      request
        .addQueryStringParameters("q" -> Tools.cityName2Pinyin(cityName))
        .addQueryStringParameters("appid" -> weather_appid)

    implicit val personReads = Json.reads[Weather]

    val futureResponse: Future[Weather] = complexRequest.get() map{
      response =>
      new Weather(
        (response.json \"name").get.toString,
        (response.json \"weather").get.toString,
        Tools.kelvin2Centigrade((response.json \ "main" \"temp").get.toString),
        Tools.kelvin2Centigrade((response.json \ "main" \"temp_min").get.toString),
        Tools.kelvin2Centigrade((response.json \ "main" \"temp_max").get.toString),
        (response.json \ "main" \"pressure").get.toString,
        (response.json  \"wind").get.toString
      )
    }
    println(request)
    println(futureResponse.value.toString)
    // println("future get"+futureResponse.get())
    println(futureResponse.isCompleted)
    // println(request.queryParameters())
    futureResponse
  }
}
