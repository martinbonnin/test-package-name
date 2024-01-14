plugins {
  id("org.jetbrains.kotlin.jvm").version("1.9.20")
  id("com.apollographql.apollo3").version("4.0.0-beta.4")
}

dependencies {
  implementation("com.apollographql.apollo3:apollo-api")
  testImplementation(kotlin("test"))
}

apollo {
  service("api") {
    packageNamesFromFilePaths("")
  }
}