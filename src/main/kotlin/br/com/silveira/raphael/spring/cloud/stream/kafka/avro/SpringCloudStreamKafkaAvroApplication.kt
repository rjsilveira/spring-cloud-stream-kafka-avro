package br.com.silveira.raphael.spring.cloud.stream.kafka.avro

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringCloudStreamKafkaAvroApplication

fun main(args: Array<String>) {
    runApplication<SpringCloudStreamKafkaAvroApplication>(*args)
}
