package exceptions

import scala.util._
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.runtime.NonLocalReturnControl

object ShowExecutionException extends App{

   def produceFuture:Future[String]={
    Future.successful(
      "nonLocalReturnControl"
    )
    throw new NonLocalReturnControl[String]("knewHow","jipaokeji")
  }
}
