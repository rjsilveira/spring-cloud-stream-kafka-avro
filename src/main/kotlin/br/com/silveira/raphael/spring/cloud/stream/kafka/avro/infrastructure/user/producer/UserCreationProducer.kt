package br.com.silveira.raphael.spring.cloud.stream.kafka.avro.infrastructure.user.producer

import br.com.silveira.raphael.spring.cloud.stream.kafka.avro.infrastructure.schema.UserCreationEvent
import org.springframework.cloud.stream.function.StreamBridge
import org.springframework.messaging.support.MessageBuilder.withPayload
import org.springframework.stereotype.Component

@Component
class UserCreationProducer(private val bridge: StreamBridge) {

    infix fun send(event: UserCreationEvent) {
        val message = withPayload(event).build()
        this.bridge.send("user-creation-out-0", message)
    }
}
