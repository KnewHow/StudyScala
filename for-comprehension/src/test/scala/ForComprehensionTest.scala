
import org.scalatest.{Matchers, FlatSpec}
import org.scalatest.prop.{PropertyChecks,GeneratorDrivenPropertyChecks}
import org.scalacheck.Gen

class ForComprehensionTest extends FlatSpec{
  "A for comprehension" should "statify" in{
    ShowForDemo.showCompreHensions()
    assert(true)
  }

  "Another for comprehension" should "statify" in{
    ShowForDemo.showFoo()
    assert(true)
  }

  "A map comprehension" should "statify" in{
    ShowForDemo.showMap
    assert(true)
  }

  "A flatMap" should "statisfy" in{
    ShowForDemo.showFlatMap
    assert(true)
  }
}
