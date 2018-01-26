import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util._
object ShowAndThen extends App{
  val tdService = new TradingService
  val allResults = scala.collection.mutable.Set[String]()

  /**
   * Node:
   * We know if a future has multiply callback method,
   * then these callback method will be called concurrently,which
   * we don't determine which method will be called after another.
   *
   * But if we want to execute some callback methods ordered,we can
   * user [andThen],which will call method by defined order
   *
   */
  tdService.buyUS(32.0).andThen{
    case Success(msg) =>
      allResults+= msg
  }andThen{
    case result =>
      println("result:"+result)
      for(msg <- allResults) println("reuslt:"+msg)
  }andThen{
    case result =>
      println("another result:"+result)
  }
}
