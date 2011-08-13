import sbt._
import Keys._

object Builds extends Build {
  lazy val root = Project("root", file(".")) aggregate(app)
  lazy val app = Project("app", file("app")) settings(sbtassembly.Plugin.assemblySettings: _*)
  
  override lazy val settings = super.settings ++ Seq(
    version := "0.1-SNAPSHOT",
    organization := "com.example",
    scalaVersion := "2.9.0-1"
  )    
}
