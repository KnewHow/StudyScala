package exceptions

import scala.util._
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.runtime.NonLocalReturnControl
object ShowNonLocalReturnControl extends App{



  val f = produceFuture

  f onComplete{
    case Success(u) => println("success:"+u)
    case Failure(u) => println("failure:"+u)
  }


  def produceFuture:Future[String]={
    Future.successful(
      "nonLocalReturnControl"
    )
    throw new NonLocalReturnControl[String]("knewHow","jipaokeji")
  }

}
