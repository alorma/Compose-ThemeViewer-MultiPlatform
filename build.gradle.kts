plugins {
  // this is necessary to avoid the plugins to be loaded multiple times
  // in each subproject's classloader
  alias(libs.plugins.jetbrainsCompose) apply false
  alias(libs.plugins.androidApplication) apply false
  alias(libs.plugins.kotlinMultiplatform) apply false
}

buildscript {
  repositories {
    dependencies {
      classpath(libs.plugin.gradle.publish)
      classpath(libs.plugin.gradle.nexus.staging)
    }
  }
}
