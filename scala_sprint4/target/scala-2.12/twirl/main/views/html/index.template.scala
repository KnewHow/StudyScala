
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template takes a single argument, a String containing a
 * message to display.
 */
  def apply/*5.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.19*/("""
"""),format.raw/*6.1*/("""<h1>Home Page</h1>
<div>
  <h2>
    <a href="/register.html">Register</a>
  </h2>

  <h2>
   <a href="/login.html">Login</a>
  </h2>

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
                  SOURCE: /home/ygh/project/studyScala/workspace/scalaWorkspace/scala_sprint4/app/views/index.scala.html
                  HASH: 5420719868443a30bb93a32a9a92ad96cbed7299
                  MATRIX: 818->95|930->112|957->113
                  LINES: 24->5|29->5|30->6
                  -- GENERATED --
              */
          