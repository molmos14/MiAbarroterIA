// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    id("com.chaquo.python") version "16.0.0" apply false
}

buildscript {
    repositories {
        google()
        mavenCentral()  // Ensure Maven Central is added
    }
    dependencies {
        classpath("com.chaquo.python:gradle:9.1.0")  // Chaquopy plugin dependency
    }
}
