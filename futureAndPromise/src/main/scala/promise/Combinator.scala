package promise

import scala.util._
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Promise

object CombinatorShow extends App{


  val f1 =Future{
    "123"
    // throw new Exception("123")
  }
  val f2 =Future{
    "456"
     throw new Exception("123")
  }

  first(f1,f2) map{
    case u => println(u)
  }

  def first[T](f:Future[T],g:Future[T]):Future[T]={
    val p = Promise[T]
    f map{
      x => p.trySuccess(x)
    }

    g map {
      x => p.trySuccess(x)
    }

    p.future
  }

  def produceFuture(str:String):Future[String]={
    Future{
      str
    }
  }
}
