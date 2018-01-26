import scala.concurrent.Future
import scala.concurrent.forkjoin._

import scala.concurrent.ExecutionContext.Implicits.global

object FutureDemo {


  // Future{
  //   ForkJoinPool.managedBlock(
  //     new ManagedBlocker{
  //       var done = false
  //       def block():Boolean = {
  //         try{
  //            myLock.lock()
  //         }finally{
  //           done = true
  //         }
  //         true
  //       }
  //       def isReleasable:Boolean = done
  //     }

  //   )
  // }

  // def testForkJoinPool{
  //   for(i <- 32000){
  //     blocking{
  //       Thread.sleep(99999)
  //     }
  //   }
  // }

  def getFuture():Future[String]={
    val user = User("knewhow",29)
    // val user = None
    Future{
      user.name
      throw new RuntimeException("test exception")
    }
  }
}

case class User(val name:String,val age:Int)
