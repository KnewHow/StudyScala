
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
      </div>
      <div>
        <div class="weather">
          """),_display_(/*16.12*/while(!weather.isCompleted)/*16.39*/{_display_(Seq[Any](format.raw/*16.40*/("""

          """)))}),format.raw/*18.12*/("""
          """),format.raw/*19.11*/("""<div class="w-content">
            <label class="w-name">City:</label>
            <p class="w-result">"""),_display_(/*21.34*/weather/*21.41*/.value.get.get.name),format.raw/*21.60*/("""</p>
          </div>

          <div class="w-content">
            <label class="w-name">Weather:</label>
            <span  class="w-result">"""),_display_(/*26.38*/weather/*26.45*/.value.get.get.weather),format.raw/*26.67*/("""<span>
          </div>

          <div class="w-content">
            <label class="w-name">Average Temperature:</label>
            <p class="w-result">"""),_display_(/*31.34*/weather/*31.41*/.value.get.get.mainTemp),format.raw/*31.64*/(""" """),format.raw/*31.65*/("""C</p>
          </div>

          <div class="w-content">
            <label>Mxsinimum Temperature:</label>
            <p class="w-result">"""),_display_(/*36.34*/weather/*36.41*/.value.get.get.minTemp),format.raw/*36.63*/(""" """),format.raw/*36.64*/("""C</p>
          </div>

          <div class="w-content">
            <label>Maximual Temperature:</label>
            <p class="w-result">"""),_display_(/*41.34*/weather/*41.41*/.value.get.get.maxTemp),format.raw/*41.63*/(""" """),format.raw/*41.64*/("""C</p>
          </div>

          <div class="w-content">
            <label class="w-name">Pressure:</label>
            <p class="w-result">"""),_display_(/*46.34*/weather/*46.41*/.value.get.get.pressure),format.raw/*46.64*/(""" """),format.raw/*46.65*/("""Hpa</p>
          </div>

          <div class="w-content">
            <label class="w-name">Wind:</label>
            <p class="w-result">"""),_display_(/*51.34*/weather/*51.41*/.value.get.get.wind),format.raw/*51.60*/("""</p>
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
                  DATE: Sun Jan 21 09:26:42 CST 2018
                  SOURCE: /home/ygh/project/studyScala/workspace/scalaWorkspace/scala_sprint4/app/views/userHome.scala.html
                  HASH: d5ceb42bb8728481ddf9f79695d326953a737af6
                  MATRIX: 770->1|924->60|952->62|1143->226|1156->230|1186->239|1294->320|1307->324|1335->331|1431->400|1467->427|1506->428|1550->441|1589->452|1721->557|1737->564|1777->583|1949->728|1965->735|2008->757|2190->912|2206->919|2250->942|2279->943|2447->1084|2463->1091|2506->1113|2535->1114|2702->1254|2718->1261|2761->1283|2790->1284|2960->1427|2976->1434|3020->1457|3049->1458|3217->1599|3233->1606|3273->1625
                  LINES: 21->1|26->1|28->3|35->10|35->10|35->10|37->12|37->12|37->12|41->16|41->16|41->16|43->18|44->19|46->21|46->21|46->21|51->26|51->26|51->26|56->31|56->31|56->31|56->31|61->36|61->36|61->36|61->36|66->41|66->41|66->41|66->41|71->46|71->46|71->46|71->46|76->51|76->51|76->51
                  -- GENERATED --
              */
          