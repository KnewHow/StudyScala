
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

object userHome extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[User,Weather,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user:User,weather:Weather):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.29*/("""

"""),format.raw/*3.1*/("""<html>
  <head>
    <title>User Home</title>
    <link rel="stylesheet" type="text/css" href="/css/userhome.css">
  </head>

  <body>
    <h1>Welcome to your Home:"""),_display_(/*10.31*/user/*10.35*/.username),format.raw/*10.44*/("""</h1>
      <div class="avatar">
        <img width="200px" height="200px" src=""""),_display_(/*12.49*/user/*12.53*/.avatar),format.raw/*12.60*/("""">
        <a href="/toChatPage.html" class="a-chat">Enter Chat page</a>
      </div>
      <div>
        <div class="weather">

          <div class="w-content">
            <label class="w-name">City:</label>
            <p class="w-result">"""),_display_(/*20.34*/weather/*20.41*/.name),format.raw/*20.46*/("""</p>
          </div>

          <div class="w-content">
            <label class="w-name">Weather:</label>
            <span  class="w-result">"""),_display_(/*25.38*/weather/*25.45*/.weather),format.raw/*25.53*/("""<span>
          </div>

          <div class="w-content">
            <label class="w-name">Average Temperature:</label>
            <p class="w-result">"""),_display_(/*30.34*/weather/*30.41*/.mainTemp),format.raw/*30.50*/(""" """),format.raw/*30.51*/("""C</p>
          </div>

          <div class="w-content">
            <label>Mxsinimum Temperature:</label>
            <p class="w-result">"""),_display_(/*35.34*/weather/*35.41*/.minTemp),format.raw/*35.49*/(""" """),format.raw/*35.50*/("""C</p>
          </div>

          <div class="w-content">
            <label>Maximual Temperature:</label>
            <p class="w-result">"""),_display_(/*40.34*/weather/*40.41*/.maxTemp),format.raw/*40.49*/(""" """),format.raw/*40.50*/("""C</p>
          </div>

          <div class="w-content">
            <label class="w-name">Pressure:</label>
            <p class="w-result">"""),_display_(/*45.34*/weather/*45.41*/.pressure),format.raw/*45.50*/(""" """),format.raw/*45.51*/("""Hpa</p>
          </div>

          <div class="w-content">
            <label class="w-name">Wind:</label>
            <p class="w-result">"""),_display_(/*50.34*/weather/*50.41*/.wind),format.raw/*50.46*/("""</p>
          </div>

        </div>

    </div>
  </body>
</html>
"""))
      }
    }
  }

  def render(user:User,weather:Weather): play.twirl.api.HtmlFormat.Appendable = apply(user,weather)

  def f:((User,Weather) => play.twirl.api.HtmlFormat.Appendable) = (user,weather) => apply(user,weather)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Jan 22 15:01:25 CST 2018
                  SOURCE: /Users/how/project/studyScala/workspace/scala_sprint4/app/views/userHome.scala.html
                  HASH: ef097448de8bc13701259f1cc28bd13201ee7358
                  MATRIX: 738->1|860->28|888->30|1079->194|1092->198|1122->207|1230->288|1243->292|1271->299|1542->543|1558->550|1584->555|1756->700|1772->707|1801->715|1983->870|1999->877|2029->886|2058->887|2226->1028|2242->1035|2271->1043|2300->1044|2467->1184|2483->1191|2512->1199|2541->1200|2711->1343|2727->1350|2757->1359|2786->1360|2954->1501|2970->1508|2996->1513
                  LINES: 21->1|26->1|28->3|35->10|35->10|35->10|37->12|37->12|37->12|45->20|45->20|45->20|50->25|50->25|50->25|55->30|55->30|55->30|55->30|60->35|60->35|60->35|60->35|65->40|65->40|65->40|65->40|70->45|70->45|70->45|70->45|75->50|75->50|75->50
                  -- GENERATED --
              */
          