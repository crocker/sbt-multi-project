# sbt-multi-project
[SBT](http://www.scala-sbt.org) multi-project template

### Description
This project uses a minimal amount of configuration for clarity. The only plugin that has been added is [sbt-scoverage](https://github.com/scoverage/sbt-scoverage) to demonstrate code coverage on a multi-module build.

### Structure
- /common: Code shared between modules
- /service: Root directory for microservices
  - audit: Example sub-project
  - notification: Example sub-project
  - security: Example sub-project
