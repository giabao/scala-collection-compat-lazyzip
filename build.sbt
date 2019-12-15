organization := "com.sandinh"
name := "scala-collection-compat-lazyzip"

version := "2.13.1-SNAPSHOT"

scalaVersion := "2.12.10"
crossScalaVersions := Seq("2.12.10", "2.13.1")

scalaSource in Compile := (CrossVersion.partialVersion(scalaVersion.value) match {
  case Some((2, 12)) => sourceDirectory.value / "main" / "scala"
  case _ => sourceDirectory.value / "main" / "scala-2.13"
})

val junitDep          = "junit"                          % "junit"                            % "4.12"
val junitInterfaceDep = "com.novocode"                   % "junit-interface"                  % "0.11"                            % "test"

libraryDependencies ++= Seq(
  junitDep % Test, junitInterfaceDep
)
fork in Test := true
javaOptions in Test += "-Xss1M"
scalacOptions in Test += "-feature"
testOptions += Tests.Argument(TestFrameworks.JUnit, "-a", "-v")
