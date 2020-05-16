plugins {
    id("java-gradle-plugin")
    kotlin("jvm") version "1.3.72"
    `kotlin-dsl`
    id("com.gradle.plugin-publish") version "0.11.0"
}

gradlePlugin {
    plugins {
        create("auto-manifest") {
            id = "com.gradleup.auto.manifest"
            displayName = "AutoManifest Gradle Plugin"
            description = "Automatically creates AndroidManifest.xml so you don't have to"
            implementationClass = "com.gradleup.auto.manifest.AutoManifestPlugin"
        }
    }
}

pluginBundle {
    website = "https://github.com/GradleUp/auto-manifest/"
    vcsUrl = "https://github.com/GradleUp/auto-manifest.git"
    tags = listOf("android", "AndroidManifest", "GradleUp")
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("com.android.tools.build:gradle:3.6.3")

    testImplementation("junit:junit:4.13")
    testImplementation("com.google.truth:truth:1.0.1")
}
