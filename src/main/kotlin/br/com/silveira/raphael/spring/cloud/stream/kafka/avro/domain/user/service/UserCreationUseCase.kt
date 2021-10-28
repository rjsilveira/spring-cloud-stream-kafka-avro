package br.com.silveira.raphael.spring.cloud.stream.kafka.avro.domain.user.service

import br.com.silveira.raphael.spring.cloud.stream.kafka.avro.domain.user.entity.User

interface UserCreationUseCase {

    infix fun create(user: User)
}
