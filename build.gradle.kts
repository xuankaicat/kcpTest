buildscript {
    extra["kotlin_plugin_id"] = "com.bnorm.template.kotlin-ir-plugin"
}

plugins {
    kotlin("jvm") version "1.6.10" apply false
    id("org.jetbrains.dokka") version "1.6.10" apply false
    id("com.gradle.plugin-publish") version "0.16.0" apply false
    id("com.github.gmazzo.buildconfig") version "3.0.3" apply false
    id("com.google.devtools.ksp") version "1.6.10-1.0.4" apply false
}

allprojects {
    group = "com.bnorm.template"
    version = "0.1.0-SNAPSHOT"
}

subprojects {
    repositories {
        mavenCentral()
        google()
        maven("https://dl.bintray.com/kotlin/kotlin-eap")
    }
}
