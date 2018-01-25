
import scala.collection.immutable.List

object ShowForDemo{

  def showCompreHensions(){
    val list = List(
      User("Yison",27),
      User("how",23),
      User("Jilen",28),
      User("Perfect",25)
    )
    val names =  for(user <- list if(user.age>20 && user.age<26)) yield user.name
    names.foreach(name => println(name))
  }

  def foo(n:Int,v:Int)={
    for(i <- 0 until n;
      j <- i until n if i+j==v
    )yield (i,j)
  }

  def showFoo(){
    foo(10,10).foreach{
      case(i,j) =>
        print(s"($i,$j) ")
    }
  }

  def showMap(){
     val list = List(
      User("Yison",27),
      User("how",23),
      User("Jilen",28),
      User("Perfect",25)
     )

    val names = for(user <- list) yield user.name

    val result =  names.map{
      name => name.toCharArray()
    }

    result.foreach{
      case c => c.foreach{
        case c1 => print(s"$c1 ")
      }
    }
  }

  def showFlatMap(){
     val list = List(
      User("Yison",27),
      User("how",23),
      User("Jilen",28),
      User("Perfect",25)
     )

    val names = for(user <- list) yield user.name

    val newUsers =  names.flatMap{
      case  name => scala.collection.IndexedSeq(User(name,100))
    }

    println

    newUsers.foreach{
      user => print(s"$user")
    }

  }

}

case class User(val name:String,val age:Int)
