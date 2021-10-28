package br.com.silveira.raphael.spring.cloud.stream.kafka.avro.infrastructure.user.controller

import br.com.silveira.raphael.spring.cloud.stream.kafka.avro.domain.user.service.UserReceiptUseCase
import br.com.silveira.raphael.spring.cloud.stream.kafka.avro.infrastructure.user.controller.request.UserCreationRequest
import br.com.silveira.raphael.spring.cloud.stream.kafka.avro.infrastructure.user.mapper.UserMapper
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserController(private val service: UserReceiptUseCase, private val mapper: UserMapper) {

    @PostMapping
    fun create(@RequestBody request: UserCreationRequest) {
        val user = this.mapper toDomain request
        this.service receive user
    }
}
