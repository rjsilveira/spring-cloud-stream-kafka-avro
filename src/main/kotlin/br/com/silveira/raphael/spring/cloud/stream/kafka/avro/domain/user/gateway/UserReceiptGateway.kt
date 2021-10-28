package br.com.silveira.raphael.spring.cloud.stream.kafka.avro.domain.user.gateway

import br.com.silveira.raphael.spring.cloud.stream.kafka.avro.domain.user.entity.User

interface UserReceiptGateway {

    infix fun producer(user: User)
}
