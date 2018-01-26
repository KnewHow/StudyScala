import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
object ShowTradeFuture extends App{
  val tService = new TradingService
  val result= tService.isProfitable flatMap{
    case(u) =>
      println("u is:"+u)
      if(u){
        tService.buy(32)
      }else{
        Future.failed(new Exception("not profitable"))
      }
  } recover{
    case ex:Exception => "buy fail "+ex.getMessage
  }
  println("result:"+result)

  // result map{
  //   case (msg) =>
  //     println(msg)
  // }

  result map {

    case(msg) =>
      println("lala")
      println(msg)
  }

}
