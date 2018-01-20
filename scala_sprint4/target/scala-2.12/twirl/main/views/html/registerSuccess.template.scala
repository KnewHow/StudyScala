
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object registerSuccess extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.18*/("""

"""),format.raw/*3.1*/("""<h1 class="success-info">"""),_display_(/*3.27*/message),format.raw/*3.34*/("""</h1>
  <div>
    <p>please click following link to sign in</p>
    <a href="/login.html">Sign In</a>
  </div>
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Jan 20 11:15:01 CST 2018
                  SOURCE: /home/ygh/project/studyScala/workspace/scalaWorkspace/scala_sprint4/app/views/registerSuccess.scala.html
                  HASH: 0e4684b6e9ddd09a831e08914fd9dbdea148a6d5
                  MATRIX: 739->1|850->17|878->19|930->45|957->52
                  LINES: 21->1|26->1|28->3|28->3|28->3
                  -- GENERATED --
              */
          