resolvers += Resolver.url(
  "gatling-sbt-plugins",
  url("http://dl.bintray.com/content/gatling/sbt-plugins/"))(Resolver.ivyStylePatterns)

addSbtPlugin("io.gatling" % "gatling-build-plugin" % "1.6.0")

addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "0.6.4")

addMavenResolverPlugin
