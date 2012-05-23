import sbt._
import Keys._

object Builds extends Build {
  lazy val root = Project("root", file("."),
    settings = buildSettings) aggregate(app)
  lazy val app = Project("app", file("app"),
    settings = buildSettings ++ sbtassembly.Plugin.assemblySettings)
  
  lazy val buildSettings = Defaults.defaultSettings ++ Seq(
    version := "0.1-SNAPSHOT",
    organization := "com.example",
    scalaVersion := "2.9.1"
  )
}
