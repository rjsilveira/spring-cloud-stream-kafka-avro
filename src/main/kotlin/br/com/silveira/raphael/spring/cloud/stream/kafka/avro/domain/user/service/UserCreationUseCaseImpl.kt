package br.com.silveira.raphael.spring.cloud.stream.kafka.avro.domain.user.service

import br.com.silveira.raphael.spring.cloud.stream.kafka.avro.domain.user.entity.User
import br.com.silveira.raphael.spring.cloud.stream.kafka.avro.domain.user.gateway.UserCreationGateway
import mu.KLogger
import mu.KotlinLogging.logger

class UserCreationUseCaseImpl(
    private val logger: KLogger = logger {},
    private val gateway: UserCreationGateway
) : UserCreationUseCase {

    override infix fun create(user: User) {
        this.logger.info { "m=create, user=$user" }
        this.gateway save user
    }
}
