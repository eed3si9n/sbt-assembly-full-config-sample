import sbt._
import Keys._

object Builds extends Build {
  lazy val buildSettings = Defaults.defaultSettings ++ Seq(
    version := "0.1-SNAPSHOT",
    organization := "com.example",
    scalaVersion := "2.10.1"
  )
  lazy val rootSettings = buildSettings ++ Seq(
    name := "foo"
    )
  lazy val librarySettings = buildSettings ++ Seq(
    name := "foo-library"
    )
  lazy val appSettings = buildSettings ++
    sbtassembly.Plugin.assemblySettings ++ Seq(
    name := "foo-app"
    )
  lazy val root = Project("root", file("."), settings = rootSettings) aggregate(app)
  lazy val library = Project("library", file("library"), settings = librarySettings)
  lazy val app = Project("app", file("app"), settings = appSettings) dependsOn(library)
}
