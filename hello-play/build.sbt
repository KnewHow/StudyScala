// The simplest possible sbt build file is just one line:

// import io.getquill._
// import io.getquill.naming.SnakeCase
// import io.getquill.sources.sql.idiom.MySQLDialect

// lazy val db = source(new JdbcSourceConfig[MySQLDialect, SnakeCase]("db"))

scalaVersion := "2.12.3"

name := "hello-play"
version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

resolvers += Resolver.sonatypeRepo("snapshots")
libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test
libraryDependencies += "com.h2database" % "h2" % "1.4.196"

//Add mysql driver and quill frame
libraryDependencies ++= Seq(
  "mysql" % "mysql-connector-java" % "5.1.38",
  "io.getquill" %% "quill-jdbc" % "2.3.2"
)
