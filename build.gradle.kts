plugins {
    kotlin("jvm") version "1.4.21"
    id("com.github.johnrengelman.shadow") version "6.1.0"
}

group = "works.baehyeonwoo.musicplay0r"
version = "0.1"

repositories {
    maven("https://papermc.io/repo/repository/maven-public/")
    mavenCentral()
}

dependencies {
    implementation("com.destroystokyo.paper:paper-api:1.13.2-R0.1-SNAPSHOT")
    implementation(kotlin("stdlib:1.4.21"))
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "11"
    }
    processResources {
        filesMatching("**/*.yml") {
            expand(project.properties)
        }
    }
	create<Copy>("distJar") {
	from(shadowJar)
	into(".\\")
	}
}