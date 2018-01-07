import org.scalatest.{Matchers, FlatSpec}
import org.scalatest.prop.{PropertyChecks,GeneratorDrivenPropertyChecks}
import org.scalacheck.Gen

class Fraction(n: Int, d: Int) {

  require(d != 0)
  require(d != Integer.MIN_VALUE)
  require(n != Integer.MIN_VALUE)

  val numer = if (d < 0) -1 * n else n
  val denom = d.abs

  override def toString = numer + " / " + denom
}

class ShowGeneratorDemoOne extends FlatSpec with PropertyChecks with Matchers with GeneratorDrivenPropertyChecks{
  // forAll("a","b"){(a:String,b:String) =>
  //   a.length+b.length should equal ((a+b).length+1)
  // }

  // val evenInts = for (n <- Gen.choose(-1000, 1000)) yield 2 * n
  // "all even number" should "mod 2 equal zero" in{
  //    forAll (evenInts) { (n:Int) => n % 2 should equal (0) }
  // }


  "All Fraction" should "statisfy following commnad" in{
    val validNumers =
      for (n <- Gen.choose(Integer.MIN_VALUE + 1, Integer.MAX_VALUE)) yield n
    val validDenoms =
      for (d <- validNumers if d != 0) yield d

    // forAll(validNumers,validNumers){(n:Int,d:Int) =>
    //   whenever (d != 0 && d != Integer.MIN_VALUE
    //     && n != Integer.MIN_VALUE) {

    //     val f = new Fraction(n, d)

    //     if (n < 0 && d < 0 || n > 0 && d > 0)
    //       f.numer should be > 0
    //     else if (n != 0)
    //       f.numer should be < 0
    //     else
    //       f.numer should be === 0

    //     f.denom should be > 0
    //   }
    // }
    forAll ((validNumers, "n"), (validDenoms, "d"),minSuccessful(500), maxDiscarded(300)) { (n: Int, d: Int) =>
      whenever (d != 0 && d != Integer.MIN_VALUE
        && n != Integer.MIN_VALUE) {

        val f = new Fraction(n, d)

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
