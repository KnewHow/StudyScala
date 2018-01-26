
package projections
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global


object ShowFailProjection extends App{
  val f = Future{
    4/0
  }

  for(msg <-f.failed) println("result"+msg)
}
