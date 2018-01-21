package services

import javax.inject.Inject
import models._
import io.getquill._
import exceptions._
import tools._

class UserSerice{
  lazy val ctx = new MysqlJdbcContext(SnakeCase,"ctx")
  import ctx._
  def register(user:User):String={
    val q = quote {
      query[User].insert(lift(user)).returning(_.id)
    }
    val returnIds = ctx.run(q)
    "success"
  }

  def login(username:String,password:String):User={
    // def q(n: String) = quote(
    //   query[User].filter(_.username == lift(n))
    // )
    // val user = ctx.run(q(username))
   val result =  ctx.run { query[User].filter(_.username == lift(username))}
    if(result==null &&  result.size==0){
      throw new UserException("username don't exsit!")
    }
    if(result.size==1){
      val user = result.apply(0)
      if(!Tools.MD5(password).equals(user.password)){
        throw new UserException("username or password is not right")
      }else{
         result.apply(0)
      }
    }else{
       throw new UserException("multiply username exsit!")
    }

  }
}
