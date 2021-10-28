package br.com.silveira.raphael.spring.cloud.stream.kafka.avro.infrastructure.user.mapper

import br.com.silveira.raphael.spring.cloud.stream.kafka.avro.domain.user.entity.User
import br.com.silveira.raphael.spring.cloud.stream.kafka.avro.infrastructure.schema.UserCreationEvent
import br.com.silveira.raphael.spring.cloud.stream.kafka.avro.infrastructure.user.controller.request.UserCreationRequest
import org.springframework.stereotype.Component

@Component
class UserMapper {

    infix fun toDomain(request: UserCreationRequest) = User(request.name, request.age, request.address, request.site)

    infix fun toDomain(event: UserCreationEvent) = User(event.name, event.age, event.address, event.site)

    infix fun toEvent(user: User) = UserCreationEvent(user.name, user.age, user.address, user.site, null)
}
