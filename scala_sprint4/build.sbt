// The simplest possible sbt build file is just one line:

scalaVersion := "2.12.3"

name := "sprint_4"
organization := "ch.epfl.scala"
version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

resolvers += Resolver.sonatypeRepo("snapshots")
libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test
libraryDependencies += "com.h2database" % "h2" % "1.4.196"

//Add Web Server lib
libraryDependencies += ws
libraryDependencies += ehcache

//Add mysql driver and quill frame
libraryDependencies ++= Seq(
  "mysql" % "mysql-connector-java" % "5.1.38",
  "io.getquill" %% "quill-jdbc" % "2.3.2"
)

//test lib
libraryDependencies ++=Seq("org.typelevel" %% "cats" % "0.9.0","org.scalatest" %% "scalatest" % "3.0.4" % "test")

// https://mvnrepository.com/artifact/com.ibm.icu/icu4j
libraryDependencies += "com.ibm.icu" % "icu4j" % "60.2"
