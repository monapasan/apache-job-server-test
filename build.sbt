name := "test"

version := "1.0"

scalaVersion := "2.10.4"
resolvers += "Ooyala Bintray" at "http://dl.bintray.com/ooyala/maven"

libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.0" % "test"
libraryDependencies += "org.specs2" %% "specs2-core" % "3.7.2" % "test"
libraryDependencies += "org.apache.spark" %% "spark-core" % "1.3.0" % "provided"
libraryDependencies += "spark.jobserver" %% "job-server-api" % "0.6.2" % "provided"
libraryDependencies += "com.typesafe" % "config" % "1.3.0"