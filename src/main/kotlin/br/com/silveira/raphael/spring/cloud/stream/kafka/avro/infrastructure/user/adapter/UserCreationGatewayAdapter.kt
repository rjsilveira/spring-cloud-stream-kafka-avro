package br.com.silveira.raphael.spring.cloud.stream.kafka.avro.infrastructure.user.adapter

import br.com.silveira.raphael.spring.cloud.stream.kafka.avro.domain.user.entity.User
import br.com.silveira.raphael.spring.cloud.stream.kafka.avro.domain.user.gateway.UserCreationGateway
import mu.KLogger
import mu.KotlinLogging.logger
import org.springframework.stereotype.Component

@Component
class UserCreationGatewayAdapter(private val logger: KLogger = logger {}) : UserCreationGateway {

    override infix fun save(user: User) {
        this.logger.info { "m=save, user=$user, msg=User created" }
    }
}
