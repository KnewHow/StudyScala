
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

object userHome extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user:User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.13*/("""

"""),format.raw/*3.1*/("""<html>
  <head>
    <title>User Home</title>
  </head>

  <body>
    <h1>Welcome to your Home:"""),_display_(/*9.31*/user/*9.35*/.username),format.raw/*9.44*/("""</h1>
    <div>
    </div>
  </body>
</html>
"""))
      }
    }
  }

  def render(user:User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Jan 16 08:01:06 CST 2018
                  SOURCE: /project/studyScala/workspace/scalaWorkspace/scala_sprint4/app/views/userHome.scala.html
                  HASH: f561ba92f9ec18a20db5d6c06a46fc6f3a10b5ea
                  MATRIX: 730->1|836->12|864->14|985->109|997->113|1026->122
                  LINES: 21->1|26->1|28->3|34->9|34->9|34->9
                  -- GENERATED --
              */
          