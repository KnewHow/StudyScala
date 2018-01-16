
import org.scalatest.{Matchers, FlatSpec}
import org.scalatest.prop.{PropertyChecks,GeneratorDrivenPropertyChecks}
import org.scalacheck.Gen
import tools._
class TestTool extends FlatSpec{
  "A MD5 method " should "executed right" in{
    Tools.MD5("hello")
    assert(true)
  }

  "A username [hell1]" should "not access username checke" in {
    assert(!Tools.isUsername("hello"))
  }

   "A username [12341234]" should "not access username checke" in {
    assert(!Tools.isUsername("hello"))
  }

  "A username qwer1234" should "access username check" in{
    assert(Tools.isUsername("q2341234"))
  }

   "A password [hell1]" should "not access username checke" in {
    assert(!Tools.isPassword("hello"))
  }

   "A password [12341234]" should "not access username checke" in {
    assert(!Tools.isPassword("hello"))
  }

  "A password qwer1234" should "access username check" in{
    assert(Tools.isPassword("q2341234"))
  }

  "A Email like [948170910@qq.com]" should "access check" in{
   assert(Tools.isEmail("948170910@qq.com"))
  }

  "A Email like [948170910qq.com]" should " not access check" in{
   assert(!Tools.isEmail("948170910qq.com"))
  }

  "A Chinese [袁国浩] translate into pinyin" should "equal yuanguohao" in {
    val s = "袁国浩"
    val deStr = "yuanguohao"
    assert(Tools.transferChinese2Pinyin(s).equals(deStr))
  }

  "A city name for example [杭州] translate pinyin" should "equal Hangzhou" in {
    val cname = "杭州"
    val pinyinName ="Hangzhou"
    assert(Tools.cityName2Pinyin(cname).equals(pinyinName))
  }
}
