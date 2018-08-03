name := """base"""

version := "1.0"

scalaVersion := "2.11.7"

// Change this to another test framework if you prefer
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test"

// Uncomment to use Akka
//libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.11"

lazy val root = project.in(file("."))
  .dependsOn(app1, app2)
  .aggregate(app1, app2)


// app1 is configured in its own build.sbt file
lazy val app1 = project
lazy val app2 = project