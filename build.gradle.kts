plugins {
    kotlin("jvm") version "1.5.10"
    id("com.github.johnrengelman.shadow") version "7.1.2"
}

group = "your.group"
version = "1.0"

repositories {
    mavenCentral()
}

tasks {
    jar {
        manifest.attributes["Main-Class"] = "your.group.MainKt"
    }

    compileKotlin {
        kotlinOptions.jvmTarget = "17"
    }
    /*
    compileJava {
        options.encoding = "utf-8"// Must have!
        options.release.set(17)
    }
    */

    processResources {
        filteringCharset = "utf-8"
    }
}