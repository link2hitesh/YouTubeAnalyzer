name := """play-java-forms-example"""

version := "2.8.x"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.1"

testOptions in Test := Seq(Tests.Argument(TestFrameworks.JUnit, "-a", "-v"))



// https://mvnrepository.com/artifact/com.google.guava/guava
libraryDependencies += "com.google.guava" % "guava" % "30.0-jre"

libraryDependencies ++= Seq(
  cacheApi
)


// https://mvnrepository.com/artifact/com.google.apis/google-api-services-youtube
libraryDependencies += "com.google.apis" % "google-api-services-youtube" % "v3-rev222-1.25.0"



// https://mvnrepository.com/artifact/com.google.api-client/google-api-client
libraryDependencies += "com.google.api-client" % "google-api-client" % "1.30.11"

// https://mvnrepository.com/artifact/com.google.http-client/google-http-client-jackson2
libraryDependencies += "com.google.http-client" % "google-http-client-jackson2" % "1.37.0"

// https://mvnrepository.com/artifact/com.google.apis/google-api-services-youtubeAnalytics
libraryDependencies += "com.google.apis" % "google-api-services-youtubeAnalytics" % "v2-rev272-1.25.0"

//YouTube reporting

// https://mvnrepository.com/artifact/com.google.apis/google-api-services-youtubereporting
libraryDependencies += "com.google.apis" % "google-api-services-youtubereporting" % "v1-rev748-1.25.0"

//oauth

// https://mvnrepository.com/artifact/com.google.oauth-client/google-oauth-client
libraryDependencies += "com.google.oauth-client" % "google-oauth-client" % "1.31.1"






//collections
// https://mvnrepository.com/artifact/com.google.collections/google-collections
//libraryDependencies += "com.google.collections" % "google-collections" % "1.0"


//Jackson mapper

// https://mvnrepository.com/artifact/org.codehaus.jackson/jackson-mapper-asl
libraryDependencies += "org.codehaus.jackson" % "jackson-mapper-asl" % "1.9.13"




// https://mvnrepository.com/artifact/com.google.auth/google-auth-library-oauth2-http
libraryDependencies += "com.google.auth" % "google-auth-library-oauth2-http" % "0.22.0"


// https://mvnrepository.com/artifact/com.google.oauth-client/google-oauth-client-jetty
libraryDependencies += "com.google.oauth-client" % "google-oauth-client-jetty" % "1.31.2"



// https://mvnrepository.com/artifact/com.google.oauth-client/google-oauth-client-java6
libraryDependencies += "com.google.oauth-client" % "google-oauth-client-java6" % "1.11.0-beta"




libraryDependencies += guice

// disabled until https://github.com/playframework/playframework/issues/9845 is solved
//scalacOptions ++= List("-encoding", "utf8", "-Xfatal-warnings", "-deprecation")
javacOptions ++= Seq(
  "-Xlint:unchecked",
  "-Xlint:deprecation"
  //"-Werror"
) 

libraryDependencies += "com.typesafe.akka" %% "akka-testkit" % "2.6.5" % Test


// Testing libraries for dealing with CompletionStage...
libraryDependencies += "org.assertj" % "assertj-core" % "3.8.0" % Test
libraryDependencies += "org.awaitility" % "awaitility" % "3.0.0" % Test

libraryDependencies += ws
