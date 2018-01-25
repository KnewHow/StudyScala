

scalaVersion := "2.12.3"

name := "for-comprehensions"
organization := "ch.epfl.scala"
version := "1.0"


libraryDependencies += "org.typelevel" %% "cats" % "0.9.0"

//test lib
libraryDependencies ++=Seq("org.typelevel" %% "cats" % "0.9.0","org.scalatest" %% "scalatest" % "3.0.4" % "test")


