import org.scalatest.{Matchers, FlatSpec}
import org.scalatest.prop.PropertyChecks

class Counter{
  private var c = 0;
  def reset{c = 0}
  def click{c += 1}
  def enter(n:Int){c = n}
  def count = c
}

abstract class Action{

}

case object Start extends Action

case object Click extends Action

case class Enter(n:Int) extends Action

class ShowTableMutableObjectsTest extends FlatSpec with PropertyChecks with Matchers{

  val stateTransitions =
  Table(
    ("action", "expectedCount"),
    (Start,    0),
    (Click,    1),
    (Click,    2),
    (Click,    3),
    (Enter(5), 5),
    (Click,    6),
    (Enter(1), 1),
    (Click,    2),
    (Click,    3)
  )

  "A couter" should "statisfy setting result" in{
    val counter = new Counter
    forAll (stateTransitions) {(action,expectedCount) =>
      action match{
        case Start => counter.reset
        case Click => counter.click
        case Enter(n) => counter.enter(n)
      }
      counter.count should equal (expectedCount)
    }
  }
}
