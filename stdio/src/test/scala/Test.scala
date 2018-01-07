import org.scalatest.prop.Checkers
import org.scalatest.{Matchers, FlatSpec}
import org.scalatest.prop.PropertyChecks

class TestStdIO extends FlatSpec with Matchers with PropertyChecks with Checkers{
  "A StdIO calcalulate" should "statisfy + - * /" in{
    forAll{(m:Int,n:Int) =>
      val left = PureStdIO[String](m+"")
      val right = PureStdIO[String](n+"")
      val add = PureStdIO("+")
      val subtract = PureStdIO("-")
      val multiply = PureStdIO("*")
      val division = PureStdIO("/")
      (StdIO.calcFlatMap(left,add,right).run.get.get) should equal (m+n)
      (StdIO.calcFlatMap(left,subtract,right).run.get.get) should equal (m-n)
      (StdIO.calcFlatMap(left,multiply,right).run.get.get) should equal (m*n)
      whenever(n!=0){
        (StdIO.calcFlatMap(left,division,right).run.get.get) should equal (m/n)
      }


    }
  }
}
