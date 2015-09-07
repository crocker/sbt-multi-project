lazy val commonSettings = Seq(
  organization := "com.example",
  version := "0.0.1-SNAPSHOT",
  scalaVersion := "2.11.7",
  coverageEnabled := true,
  coverageMinimum := 70,
  coverageFailOnMinimum := false,
  coverageHighlighting := true
)



lazy val common = (project in file("common")).
  settings(commonSettings: _*).
  settings(
    name := "common",
    moduleName := "common"
  )

lazy val audit = (project in file("service/audit")).
  settings(commonSettings: _*).
  settings(
    // other settings
  )

lazy val notification = (project in file("service/notification")).
  settings(commonSettings: _*).
  settings(
    // other settings
  )

lazy val security = (project in file("service/security")).
  settings(commonSettings: _*).
  settings(
    // other settings
  )

lazy val root = (project in file("."))
  .aggregate(common, audit, notification, security)
  .settings(commonSettings: _*)
