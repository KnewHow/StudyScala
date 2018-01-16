
package services

import models._
import io.getquill._

class PersonService{
  lazy val ctx = new MysqlJdbcContext(SnakeCase, "ctx")
  import ctx._
  def getPersonList():Seq[Person]={
    val q =  quote{
      query[Person].map(p => p)
    }
    ctx.run(q)
  }
}
