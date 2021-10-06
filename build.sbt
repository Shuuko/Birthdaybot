val scala3Version = "3.0.0"
name := "Kuu"

version := "0.1.0"

scalaVersion := scala3Version

resolvers += "jitpack" at "https://jitpack.io"

libraryDependencies ++= Seq(
  "com.github.stylite" % "uta" % "33cb1a48a5"
)
