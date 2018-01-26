import scala.concurrent.ExecutionContext.Implicits.global
import scala.util._
object Main extends App {
  val result = FutureDemo.getFuture
  // println(result)
  result onComplete{
    case Success(u) => println("success:"+u)
    case Failure(t) => println("filure:"+t.getMessage)
  }
}