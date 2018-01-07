import scala.util.Try
import scala.io.StdIn

class StdIO[A]{
  def map[B](f: A => B ):StdIO[B]={
    MapStdIO[A,B](this,f)
  }

  def flatMap[B](f:A => StdIO[B]):StdIO[B]={
    FlatMapStdIO[A,B](this,f)
  }
}

case class MapStdIO[A,B](io:StdIO[A],f:A => B) extends StdIO[B]

case class FlatMapStdIO[A,B](io:StdIO[A],f: A => StdIO[B] )extends StdIO[B]

case object ReadStdIO extends StdIO[String]

case class WriteStdIO(content:String) extends StdIO[Unit]

case class PureStdIO[A](a:A) extends StdIO[A]

object StdIO {
  def pure[A](a:A):StdIO[A] = {
    PureStdIO[A](a)
  }

  def read():StdIO[String] = {
    ReadStdIO
  }

  def write(content:String):StdIO[Unit] = {
    WriteStdIO(content)
  }

  def run[A](io:StdIO[A]):Try[A] = {

    def runMap[A,B](s:MapStdIO[A,B]):Try[B] = run(s.io).map(s.f)
    def runFlatMap[A,B](s:FlatMapStdIO[A,B]):Try[B] = run(s.io).flatMap{a =>
      run(s.f(a))
    }
    io match{
      case ReadStdIO => Try(StdIn.readLine())
      case WriteStdIO(content:String) => Try(println(content))
      case PureStdIO(a) => Try(a)
      case m:MapStdIO[_,A] => runMap(m)
      case m:FlatMapStdIO[_,A] => runFlatMap(m)
    }
  }

  def calcFlatMap(left:StdIO[String],op:StdIO[String],right:StdIO[String]):StdIO[Try[Int]]={
    left.flatMap{ l =>
      op.flatMap{ o =>
        right.map{ r =>
          o match{
            case "+" => Try(l.toInt + r.toInt)
            case "-" => Try(l.toInt - r.toInt)
            case "*" => Try(l.toInt * r.toInt)
            case "/" => Try(l.toInt / r.toInt)
          }
        }
      }
    }
  }

  def calForYield(left:StdIO[String],op:StdIO[String],right:StdIO[String]):StdIO[Try[Int]]={
    for(l <- left; o <- op; r <- right) yield {
      o match {
        case "+" => Try(l.toInt + r.toInt)
        case "-" => Try(l.toInt - r.toInt)
        case "*" => Try(l.toInt * r.toInt)
        case "/" => Try(l.toInt / r.toInt)
      }
    }
  }

  implicit class StdIOSynax[A](io:StdIO[A]){
    def run = StdIO.run[A](io)
  }
}
