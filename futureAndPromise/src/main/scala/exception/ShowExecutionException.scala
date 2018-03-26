package exceptions

import scala.util._
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.runtime.NonLocalReturnControl

object ShowExecutionException extends App{


  produceFuture onComplete{
    case Success(u) => println(u)
    case Failure(u) => println(u)
  }

   def produceFuture:Future[String]={
     Future{
       "lala"
       // throw new NonLocalReturnControl[String]("knewHow","jipaokeji")
       throw new Exception("lala")
    }
  }
}
