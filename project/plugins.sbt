resolvers += Resolver.url("gatling",url("http://dl.bintray.com/content/gatling/sbt-plugins/"))(Resolver.ivyStylePatterns)

addSbtPlugin("io.gatling" % "gatling-build-plugin" % "2.2.1")
addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.3.10")
