name := """ScalaPlayBookApp"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala,PlayEbean)

scalaVersion := "2.12.2"

libraryDependencies ++= Seq(guice,javaJdbc, evolutions)



// Test Database
libraryDependencies += "com.h2database" % "h2" % "1.4.196"

libraryDependencies += jdbc

libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.41"

// Testing libraries for dealing with CompletionStage...
libraryDependencies += "org.assertj" % "assertj-core" % "3.6.2" % Test
libraryDependencies += "org.awaitility" % "awaitility" % "2.0.0" % Test


// Make verbose tests
testOptions in Test := Seq(Tests.Argument(TestFrameworks.JUnit, "-a", "-v"))

