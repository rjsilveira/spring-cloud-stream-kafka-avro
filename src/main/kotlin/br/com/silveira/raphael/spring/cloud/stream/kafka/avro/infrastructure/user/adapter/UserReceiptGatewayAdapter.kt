package br.com.silveira.raphael.spring.cloud.stream.kafka.avro.infrastructure.user.adapter

import br.com.silveira.raphael.spring.cloud.stream.kafka.avro.domain.user.entity.User
import br.com.silveira.raphael.spring.cloud.stream.kafka.avro.domain.user.gateway.UserReceiptGateway
import br.com.silveira.raphael.spring.cloud.stream.kafka.avro.infrastructure.user.mapper.UserMapper
import br.com.silveira.raphael.spring.cloud.stream.kafka.avro.infrastructure.user.producer.UserCreationProducer
import mu.KLogger
import mu.KotlinLogging.logger
import org.springframework.stereotype.Component

@Component
class UserReceiptGatewayAdapter(
    private val mapper: UserMapper,
    private val logger: KLogger = logger {},
    private val producer: UserCreationProducer
) : UserReceiptGateway {

    override infix fun producer(user: User) {
        this.logger.info { "m=producer, user=$user, msg=User produced" }
        val event = this.mapper toEvent user
        this.producer send event
    }
}
