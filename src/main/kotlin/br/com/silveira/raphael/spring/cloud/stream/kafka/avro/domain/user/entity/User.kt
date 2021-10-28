package br.com.silveira.raphael.spring.cloud.stream.kafka.avro.domain.user.entity

data class User(
    val name: String,
    val age: Int,
    val address: String,
    val site: String?
)
