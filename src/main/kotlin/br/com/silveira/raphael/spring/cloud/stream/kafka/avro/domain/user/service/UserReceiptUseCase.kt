package br.com.silveira.raphael.spring.cloud.stream.kafka.avro.domain.user.service

import br.com.silveira.raphael.spring.cloud.stream.kafka.avro.domain.user.entity.User

interface UserReceiptUseCase {

    infix fun receive(user: User)
}
