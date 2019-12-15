organization := "com.sandinh"
name := "lazyzip"

version := "2.13.1-SNAPSHOT"

scalaVersion := "2.12.10"

val junitDep          = "junit"                          % "junit"                            % "4.12"
val junitInterfaceDep = "com.novocode"                   % "junit-interface"                  % "0.11"                            % "test"

libraryDependencies ++= Seq(
  junitDep % Test, junitInterfaceDep
)
fork in Test := true
javaOptions in Test += "-Xss1M"
scalacOptions in Test += "-feature"
testOptions += Tests.Argument(TestFrameworks.JUnit, "-a", "-v")
