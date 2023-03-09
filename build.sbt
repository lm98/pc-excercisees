ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.2.2"

lazy val root = (project in file("."))
  .settings(
    name := "pc-excercises",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.12" % Test,
      "org.scalacheck" %% "scalacheck" % "1.15.4" % Test
      //"com.github.wookietreiber" %% "scala-chart" % "0.4.2"
    )
  )
