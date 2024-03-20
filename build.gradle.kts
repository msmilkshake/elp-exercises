plugins {
    kotlin("jvm") version "1.9.21"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation(kotlin("test"))
    implementation(kotlin("script-runtime"))
    implementation("org.antlr:antlr4:4.13.1")
    implementation("com.github.javaparser:javaparser-symbol-solver-core:3.25.1")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(11)
}