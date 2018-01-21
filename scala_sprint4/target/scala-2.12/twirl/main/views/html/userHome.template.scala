
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
          """),_display_(/*17.12*/while(!weather.isCompleted)/*17.39*/{_display_(Seq[Any](format.raw/*17.40*/("""

          """)))}),format.raw/*19.12*/("""
          """),format.raw/*20.11*/("""<div class="w-content">
            <label class="w-name">City:</label>
            <p class="w-result">"""),_display_(/*22.34*/weather/*22.41*/.value.get.get.name),format.raw/*22.60*/("""</p>
          </div>

          <div class="w-content">
            <label class="w-name">Weather:</label>
            <span  class="w-result">"""),_display_(/*27.38*/weather/*27.45*/.value.get.get.weather),format.raw/*27.67*/("""<span>
          </div>

          <div class="w-content">
            <label class="w-name">Average Temperature:</label>
            <p class="w-result">"""),_display_(/*32.34*/weather/*32.41*/.value.get.get.mainTemp),format.raw/*32.64*/(""" """),format.raw/*32.65*/("""C</p>
          </div>

          <div class="w-content">
            <label>Mxsinimum Temperature:</label>
            <p class="w-result">"""),_display_(/*37.34*/weather/*37.41*/.value.get.get.minTemp),format.raw/*37.63*/(""" """),format.raw/*37.64*/("""C</p>
          </div>

          <div class="w-content">
            <label>Maximual Temperature:</label>
            <p class="w-result">"""),_display_(/*42.34*/weather/*42.41*/.value.get.get.maxTemp),format.raw/*42.63*/(""" """),format.raw/*42.64*/("""C</p>
          </div>

          <div class="w-content">
            <label class="w-name">Pressure:</label>
            <p class="w-result">"""),_display_(/*47.34*/weather/*47.41*/.value.get.get.pressure),format.raw/*47.64*/(""" """),format.raw/*47.65*/("""Hpa</p>
          </div>

          <div class="w-content">
            <label class="w-name">Wind:</label>
            <p class="w-result">"""),_display_(/*52.34*/weather/*52.41*/.value.get.get.wind),format.raw/*52.60*/("""</p>
          </div>

        </div>

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
                  DATE: Sun Jan 21 17:58:39 CST 2018
                  SOURCE: /home/ygh/project/studyScala/workspace/scalaWorkspace/scala_sprint4/app/views/userHome.scala.html
                  HASH: 9fcef8b31b3e0ecd0fa374b38bdcf3d8d4e79161
                  MATRIX: 770->1|924->60|952->62|1143->226|1156->230|1186->239|1294->320|1307->324|1335->331|1501->470|1537->497|1576->498|1620->511|1659->522|1791->627|1807->634|1847->653|2019->798|2035->805|2078->827|2260->982|2276->989|2320->1012|2349->1013|2517->1154|2533->1161|2576->1183|2605->1184|2772->1324|2788->1331|2831->1353|2860->1354|3030->1497|3046->1504|3090->1527|3119->1528|3287->1669|3303->1676|3343->1695
                  LINES: 21->1|26->1|28->3|35->10|35->10|35->10|37->12|37->12|37->12|42->17|42->17|42->17|44->19|45->20|47->22|47->22|47->22|52->27|52->27|52->27|57->32|57->32|57->32|57->32|62->37|62->37|62->37|62->37|67->42|67->42|67->42|67->42|72->47|72->47|72->47|72->47|77->52|77->52|77->52
                  -- GENERATED --
              */
          