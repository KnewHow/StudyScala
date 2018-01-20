
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

object userHome extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[User,scala.concurrent.Future[models.Weather],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user:User,weather:scala.concurrent.Future[models.Weather]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.61*/("""

"""),format.raw/*3.1*/("""<html>
  <head>
    <title>User Home</title>
  </head>

  <body>
    <h1>Welcome to your Home:"""),_display_(/*9.31*/user/*9.35*/.username),format.raw/*9.44*/("""</h1>
      <div>
        <span>
          """),_display_(/*12.12*/while(!weather.isCompleted)/*12.39*/{_display_(Seq[Any](format.raw/*12.40*/("""

          """)))}),format.raw/*14.12*/("""
          """),_display_(/*15.12*/weather/*15.19*/.toString),format.raw/*15.28*/("""
        """),format.raw/*16.9*/("""</span>

    </div>
  </body>
</html>
"""))
      }
    }
  }

  def render(user:User,weather:scala.concurrent.Future[models.Weather]): play.twirl.api.HtmlFormat.Appendable = apply(user,weather)

  def f:((User,scala.concurrent.Future[models.Weather]) => play.twirl.api.HtmlFormat.Appendable) = (user,weather) => apply(user,weather)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Jan 20 23:36:37 CST 2018
                  SOURCE: /home/ygh/project/studyScala/workspace/scalaWorkspace/scala_sprint4/app/views/userHome.scala.html
                  HASH: 90834daa0fb81a13682f3a166e19c969fc2dd0bb
                  MATRIX: 770->1|924->60|952->62|1073->157|1085->161|1114->170|1185->214|1221->241|1260->242|1304->255|1343->267|1359->274|1389->283|1425->292
                  LINES: 21->1|26->1|28->3|34->9|34->9|34->9|37->12|37->12|37->12|39->14|40->15|40->15|40->15|41->16
                  -- GENERATED --
              */
          