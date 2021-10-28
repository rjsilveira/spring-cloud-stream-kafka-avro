import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.31"
    kotlin("plugin.spring") version "1.5.31"
    id("org.springframework.boot") version "2.5.6"
    id("com.github.davidmc24.gradle.plugin.avro") version "1.2.1"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"

}

group = "br.com.silveira.raphael"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
    mavenCentral()
    maven(url = "https://packages.confluent.io/maven/")
}

extra["springCloudVersion"] = "2020.0.4"
extra["kotlinLoggingVersion"] = "2.0.11"
extra["avroSerializerVersion"] = "6.2.1"

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.springframework.cloud:spring-cloud-stream")
    implementation("org.springframework.cloud:spring-cloud-starter-stream-kafka")
    implementation("org.springframework.cloud:spring-cloud-schema-registry-client")
    implementation("io.confluent:kafka-avro-serializer:${property("avroSerializerVersion")}")
    implementation("io.github.microutils:kotlin-logging:${property("kotlinLoggingVersion")}")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

dependencyManagement {
    imports {
        mavenBom("org.springframework.cloud:spring-cloud-dependencies:${property("springCloudVersion")}")
    }
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "11"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
