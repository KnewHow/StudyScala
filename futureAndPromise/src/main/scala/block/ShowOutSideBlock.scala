package block
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Await
import scala.concurrent.duration.Duration
object ShowOutSideBlock extends App{

  val f = Future.successful{
    "lala"
  }
  Await.result(f,Duration(10000, "millis"))

  f map{
    case(u) => println(u)
  }
}
