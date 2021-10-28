package br.com.silveira.raphael.spring.cloud.stream.kafka.avro.infrastructure.user.consumer

import br.com.silveira.raphael.spring.cloud.stream.kafka.avro.domain.user.service.UserCreationUseCase
import br.com.silveira.raphael.spring.cloud.stream.kafka.avro.infrastructure.schema.UserCreationEvent
import br.com.silveira.raphael.spring.cloud.stream.kafka.avro.infrastructure.user.mapper.UserMapper
import mu.KLogger
import mu.KotlinLogging.logger
import org.springframework.stereotype.Component
import java.util.function.Consumer

@Component("user-creation")
class UserCreationConsumer(
    private val mapper: UserMapper,
    private val logger: KLogger = logger {},
    private val service: UserCreationUseCase
) : Consumer<UserCreationEvent> {

    override fun accept(event: UserCreationEvent) {
        this.logger.info { "m=accept, event=$event" }
        val user = this.mapper toDomain event
        this.service create user
    }
}
