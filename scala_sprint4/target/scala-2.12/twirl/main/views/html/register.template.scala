
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

object register extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Map[String, String],play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template takes a single argument, a String containing a
 * message to display.
 */
  def apply/*5.2*/(errors:Map[String,String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.29*/("""
"""),format.raw/*6.1*/("""<!DOCTYPE html>
<html>
  <head>
    <title>register page</title>
    <!-- <link rel="shortcut icon" href="pic/logo.ico" type="image/x-icon"> -->
    <link rel="stylesheet" type="text/css" href="/css/register.css">
  </head>
  <body>
    <h1>REGISTER</h1>
    <form method="POST" action="/user/doRegister.html" enctype="multipart/form-data">
      <div class="rigister-form">
        <div class="form-box">
          <label class="basic-name">Username:</label>
          <input class="basic-input" type="text" name="username" value=""""),_display_(/*19.74*/errors/*19.80*/.get("username")),format.raw/*19.96*/(""""/>
          <span class="error-msg">
              """),_display_(/*21.16*/errors/*21.22*/.get("usernameError")),format.raw/*21.43*/("""
          """),format.raw/*22.11*/("""</span>
        </div>
        <div class="form-box">
          <label class="basic-name">Password:</label>
          <input class="basic-input" type="password" name="password" value=""""),_display_(/*26.78*/errors/*26.84*/.get("password")),format.raw/*26.100*/(""""/>
          <span class="error-msg">
            """),_display_(/*28.14*/errors/*28.20*/.get("passwordError")),format.raw/*28.41*/("""
          """),format.raw/*29.11*/("""</span>
        </div>

        <div class="form-box">
          <label class="basic-name">Email:</label>
          <input class="basic-input" type="text" name="email" value=""""),_display_(/*34.71*/errors/*34.77*/.get("email")),format.raw/*34.90*/(""""/>
          <span class="error-msg">
            """),_display_(/*36.14*/errors/*36.20*/.get("emailError")),format.raw/*36.38*/("""
          """),format.raw/*37.11*/("""</span>
        </div>


        <div class="form-box">
          <label class="basic-name">City:</label>
          <input class="basic-input" type="text" name="city" value=""""),_display_(/*43.70*/errors/*43.76*/.get("city")),format.raw/*43.88*/(""""/>
        </div>

        <div class="form-box">
          <label class="basic-name">Avatar:</label>
          <input class="basic-input" type="file" name="avatar" value=""/>
        </div>

        <div class="form-box">
          <input class="basic-input" type="submit" value="doRegister"/>
        </div>
      </div>
      </div>
    </form>
  </body>
</html>
"""))
      }
    }
  }

  def render(errors:Map[String, String]): play.twirl.api.HtmlFormat.Appendable = apply(errors)

  def f:((Map[String, String]) => play.twirl.api.HtmlFormat.Appendable) = (errors) => apply(errors)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Jan 15 15:23:50 CST 2018
                  SOURCE: /project/studyScala/workspace/scalaWorkspace/scala_sprint4/app/views/register.scala.html
                  HASH: 83834a8bc08a03acdb4057f223957c463c952976
                  MATRIX: 834->95|956->122|983->123|1543->656|1558->662|1595->678|1676->732|1691->738|1733->759|1772->770|1984->955|1999->961|2037->977|2116->1029|2131->1035|2173->1056|2212->1067|2415->1243|2430->1249|2464->1262|2543->1314|2558->1320|2597->1338|2636->1349|2838->1524|2853->1530|2886->1542
                  LINES: 24->5|29->5|30->6|43->19|43->19|43->19|45->21|45->21|45->21|46->22|50->26|50->26|50->26|52->28|52->28|52->28|53->29|58->34|58->34|58->34|60->36|60->36|60->36|61->37|67->43|67->43|67->43
                  -- GENERATED --
              */
          