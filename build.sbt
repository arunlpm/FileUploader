name := "FileUploader"

version := "1.0"

scalaVersion := "2.11.5"


lazy val playVersion = "2.4.0"

val backendDeps = Seq (
  "com.typesafe.play" %% "play" % playVersion,
  "com.typesafe.play" %% "play-docs" % playVersion
)

lazy val root = (project in file(".")).enablePlugins(PlayScala)