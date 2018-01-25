
package tools

import scala.util.matching

import com.ibm.icu.text.Transliterator

object  Tools{
  lazy val pinyinTransliterator = Transliterator.getInstance("Han-Latin;NFD;[[:NonspacingMark:][:Space:]] Remove");

 def MD5(s: String):String = {
    val m = java.security.MessageDigest.getInstance("MD5")
    val b = s.getBytes("UTF-8")
    m.update(b, 0, b.length)
    new java.math.BigInteger(1, m.digest()).toString(16)
 }

  /**
   */
  def isUsername(s:String):Boolean={
    val usernamePattern = "^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,12}$".r
    return(usernamePattern.findFirstMatchIn(s)!=None)
  }

   def isPassword(s:String):Boolean={
    val passwordPattern = "^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,12}$".r
    return(passwordPattern.findFirstMatchIn(s)!=None)
   }

  def isEmail(s:String):Boolean={
    val emailPattern = "^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(.[a-zA-Z0-9_-])+".r
    return(emailPattern.findFirstMatchIn(s)!=None)
  }

  def transferChinese2Pinyin(s:String):String={
    pinyinTransliterator.transliterate(s);
  }

  def cityName2Pinyin(cname:String):String={
    val cnamePinyin = transferChinese2Pinyin(cname)
    cnamePinyin.substring(0,1).toUpperCase()+cnamePinyin.substring(1,cnamePinyin.length)
  }

  def kelvin2Centigrade(s:String):String={
    val b1 = BigDecimal(s)
    val b2 = BigDecimal("273.15")
    (b1-b2).toString
  }

  def giveType[T: Manifest](t: T): Manifest[T] = manifest[T]
}
