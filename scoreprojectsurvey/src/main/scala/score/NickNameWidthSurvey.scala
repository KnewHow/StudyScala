
import java.awt.image.BufferedImage
import java.awt.Font
import javax.swing.JComponent
import java.awt.FontMetrics
import javax.swing.JLabel
object NickNameWidthSurvey extends App{

  getFontWidth("袁国浩")
  // println("袁:"+getPixelValue("袁"))
  // println("y:"+getPixelValue("y"))
  // //val s = "âœ”â€®"
  // //println(s+getPixelValue(s))
  // println("😄  "+getPixelValue("😄"))
  // println("👌:"+getPixelValue("😄"))
  // println(""+getPixelValue(""))
  // println("$一直走拢不回头$.向💰 看:"+getPixelValue("$一直走拢不回头$.向💰 看"))
  // println("oοゞ亲藽宀貝ゞοo:"+getPixelValue("oοゞ亲藽宀貝ゞοo"))
  // println("。:"+getPixelValue("。"))
  // println(".:"+getPixelValue("."))
  // def getPixelValue(nickName:String):Int={
  //   val img = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB)
  //   val g2d = img.createGraphics()
  //   val fm = g2d.getFontMetrics()
  //   val length = fm.stringWidth(nickName)
  //   g2d.dispose()
  //   length
  // }

  def getFontWidth(s:String){
    val f = new Font("Arial", Font.BOLD, 12);
    val j = new JLabel();
    val fm = j.getFontMetrics(f);
    val width = fm.stringWidth(s);//字符串宽度
    println("width:"+width)
  }
}
