
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
class TradingService{
  def isProfitable:Future[Boolean]={
    val r = scala.util.Random
    Future(r.nextInt(100) % 2 == 0)
  }

  def buy(amount:Double):Future[String]={
    Future("buy success:"+amount)
    throw new Exception("test exception")
  }

  def buyUS(amount:Double):Future[String]={
    Future.successful("Buy US success:"+amount)
    // throw
    // Future.failed(new Exception("test exception"))
  }

  def buyChina(amount:Double):Future[String]={
    Future.successful("Buy China success:"+amount)
    // throw new Exception("test exception")
    Future.failed(new Exception("test exception"))
  }
}
