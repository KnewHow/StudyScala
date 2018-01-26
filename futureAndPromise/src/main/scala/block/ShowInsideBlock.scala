package block

import scala.concurrent.Future
// import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.ExecutionContext
import java.util.concurrent.Executors

object ShowInsideBlock extends App{
  implicit val ec = ExecutionContext.fromExecutor(
    Executors.newFixedThreadPool(4))

  val f = Future.successful{
    // blocking{
    //   blockingStuff()
    // }
    "inside block"
    java.lang.Thread.sleep(3000)
  }

  f map{
    case(u) => println(u)
  }

}
