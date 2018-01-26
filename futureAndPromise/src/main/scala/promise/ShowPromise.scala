package promise
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

object ShowPromise extends App{
  val proService = new ProducerAndConsumerService

  val p = proService.produce

  val c = proService.consumer

  // p map{ p1=>
  //   c map{
  //     case(r) => println("cusumer finsh")
  //   }

  // }
}
