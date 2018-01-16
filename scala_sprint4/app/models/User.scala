package models

import java.util.Date

/**
 *User model
 */
case class User(
  id:Int,
  username:String,
  password:String,
  email:String,
  avatar:String,
  city:String,
  gmt_create:Date,
  gmt_modified:Date
)
