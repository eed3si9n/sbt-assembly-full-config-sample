resolvers += "Scala Tools Nexus" at "http://nexus.scala-tools.org/content/repositories/snapshots/"

libraryDependencies <+= (sbtVersion) { sv => "com.eed3si9n" %% "sbt-assembly" % ("sbt" + sv + "_0.5") }
