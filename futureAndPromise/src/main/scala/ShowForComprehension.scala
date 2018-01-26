import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util._
object ShowForComprehension extends App{

  val tdService = new TradingService

  val cr = tdService.buyChina(24)
  val ur = tdService.buyUS(48)

  // val nr = for{
  //   c <- cr;
  //   u <- ur
  // } yield tdService.buy(32.00)

  // nr onComplete {

  // }

  val nr =  cr flatMap{ c =>
    ur flatMap{ u=>
      tdService.buy(23.00)
    }
  }
  nr map{
    case(u) => println(u)
  }
}
