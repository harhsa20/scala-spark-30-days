ThisBuild / scalaVersion := "2.12.18"

name := "day-05-rdd-transformations"

version := "1.0"

libraryDependencies +=
  "org.apache.spark" %% "spark-core" % "3.5.3"

Compile / run / fork := true

Compile / run / javaOptions ++= Seq(
  "--add-exports=java.base/sun.nio.ch=ALL-UNNAMED"
)
