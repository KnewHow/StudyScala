package promise
import scala.concurrent.Promise
import scala.util._
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

class ProducerAndConsumerService{
  val p = Promise[String]()
  val f = p.future

  val produce = Future{
    val r = produceSomething
    /**
     * The promise will tell consumer the producer produce successful
     * then the consumer can do onComplete
     */
    p.success(r)
    /**
     * The consumer don't care whether the method has been completed
     *
     */
    continueDoingSomethingUnrelated
  }

  val consumer = Future{
    startDoingSomething
    f onComplete{
      case Success(u) => println("consumer success:"+u)
    }
  }

  def produceSomething:String={
    "This is a new produce"
  }

  def continueDoingSomethingUnrelated{
    for(i <- 0  to 9999999){
    }
    println("contine do something")
  }

  def startDoingSomething(){

  }
}
