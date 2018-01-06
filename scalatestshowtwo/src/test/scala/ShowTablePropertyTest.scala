import org.scalatest.{Matchers, FlatSpec}
import org.scalatest.prop.PropertyChecks

class ShowPropetyTestDemo extends FlatSpec with  PropertyChecks with Matchers{
  val fractions =
  Table(
    ("n", "d"),  // First tuple defines column names
    (  1,   2),  // Subsequent tuples define the data
    ( -1,   2),
    (  1,  -2),
    ( -1,  -2),
    (  3,   1),
    ( -3,   1),
    ( -3,   0),
    (  3,  -1),
    (  3,  Integer.MIN_VALUE),
    (Integer.MIN_VALUE, 3),
    ( -3,  -1)
  )


  "A Fraction have numerator and denominator" should "statify some condition" in{
    forAll(fractions){(n:Int,d:Int) =>
      whenever(d!=0 && d!=Integer.MIN_VALUE && n!=Integer.MIN_VALUE){
        val f = new Fraction(n,d)
        if (n < 0 && d < 0 || n > 0 && d > 0)
          f.numer should be > 0
        else if (n != 0)
          f.numer should be < 0
        else
          f.numer should be === 0
        f.denom should be > 0
      }
    }
  }

}
