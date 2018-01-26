import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util._
object ShowFallbacktoDemo extends App{
  val tdService = new TradingService
  val USResult = tdService.buyUS(32.0)
  val ChinaResult = tdService.buyChina(48.0)

  val anyResult = USResult fallbackTo ChinaResult

  anyResult onComplete{
    case Success(u) => println("success:"+u)
    case Failure(u) => println("failure:"+u)
  }

}
