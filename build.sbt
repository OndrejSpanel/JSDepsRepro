enablePlugins(ScalaJSPlugin, JSDependenciesPlugin)

name := "JSDepsRepro"

version := "0.1"

scalaVersion := "2.12.12"

githubTokenSource := TokenSource.GitConfig("github.token")

resolvers += Resolver.githubPackages("OpenGrabeso", "packages")

libraryDependencies += "com.github.opengrabeso" %%% "threejs-facade" % "0.0.114-0.0.4"
