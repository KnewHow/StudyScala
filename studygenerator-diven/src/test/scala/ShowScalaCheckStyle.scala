import org.scalatest.prop.Checkers
import org.scalatest.{Matchers, FlatSpec}
import org.scalatest.prop.PropertyChecks
import org.scalacheck.Arbitrary._
import org.scalacheck.Prop._

class ScalaCheckStyle extends FlatSpec with Checkers with Matchers with PropertyChecks{
  "Lists" should "statisfy following" in{
    // check((a: List[Int], b: List[Int]) => a.size + b.size == (a ::: b).size,minSuccessful(500), maxDiscarded(300))
    // check{(n:Int) =>
    //   n>1 ==> n/2 > 0
    // }

    // forAll {(n:Int) =>
    //   whenever (n>1) {n/2 should be > 0}
    // }
    def myMagicFunction(n: Int, m: Int) = n + m
    // check { (m: Int, n: Int) =>
    //   val res = myMagicFunction(n, m)
    //   (res >= m)    :| "result > #1" &&
    //   (res >= n)    :| "result > #2" &&
    //   (res < m + n) :| "result not sum"
    // }
    // forAll { (m: Int, n: Int) =>
    //   val res = myMagicFunction(n, m)
    //   res should be >= m
    //   res should be >= n
    //   res should be < m + n
    // }

    forAll { (m: Int, n: Int) =>
      val res = myMagicFunction(n, m)
      res should (be >= m and be >= n and be < m + n)
    }
  }
}
