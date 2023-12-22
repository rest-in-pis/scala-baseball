ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.12"

lazy val root = (project in file("."))
  .settings(
    name := "scala-baseball"
  )

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.2.17" % Test,
  "org.scalatest" %% "scalatest-funsuite" % "3.2.17" % Test,
  "org.scala-lang" % "scala-compiler" % "2.13.10"
)
