package br.com.silveira.raphael.spring.cloud.stream.kafka.avro.infrastructure.user.controller.request

data class UserCreationRequest(
    val name: String,
    val age: Int,
    val address: String,
    val site: String?
)
