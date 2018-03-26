package services

import javax.inject.Inject
import scala.concurrent.Future
import models._
import io.getquill._
import exceptions._
import tools._
import play.api.libs.concurrent.Execution.Implicits._

class UserSerice{
  // lazy val ctx = new MysqlJdbcContext(SnakeCase,"ctx")
  lazy val ctx = new MysqlAsyncContext(SnakeCase, "ctx")
  import ctx._
  def register(user:User):Future[Int]={
    val q = quote {
      query[User].insert(lift(user)).returning(_.id)
    }
    ctx.run(q)


  }

  def login(username:String,password:String):Future[Option[User]]={

    val result =  ctx.run { query[User].filter(_.username == lift(username)).filter(_.password == lift(Tools.MD5(password)))}
    result map{ list =>
      list.headOption
    }
  }

  def queryUserById(id:Int):Future[Option[User]]={
    val result = ctx.run {query[User].filter(_.id == lift(id))}
    result map{ list =>
      list.headOption
    }
  }
}
