package br.com.silveira.raphael.spring.cloud.stream.kafka.avro.domain.user.service

import br.com.silveira.raphael.spring.cloud.stream.kafka.avro.domain.user.entity.User
import br.com.silveira.raphael.spring.cloud.stream.kafka.avro.domain.user.gateway.UserReceiptGateway
import mu.KLogger
import mu.KotlinLogging.logger

class UserReceiptUseCaseImpl(
    private val logger: KLogger = logger {},
    private val gateway: UserReceiptGateway
) : UserReceiptUseCase {

    override infix fun receive(user: User) {
        this.logger.info { "m=receive, user=$user" }
        this.gateway producer user
    }
}
