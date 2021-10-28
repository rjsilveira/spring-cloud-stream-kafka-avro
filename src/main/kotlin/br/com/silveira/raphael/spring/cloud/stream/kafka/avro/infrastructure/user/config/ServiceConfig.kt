package br.com.silveira.raphael.spring.cloud.stream.kafka.avro.infrastructure.user.config

import br.com.silveira.raphael.spring.cloud.stream.kafka.avro.domain.user.gateway.UserCreationGateway
import br.com.silveira.raphael.spring.cloud.stream.kafka.avro.domain.user.gateway.UserReceiptGateway
import br.com.silveira.raphael.spring.cloud.stream.kafka.avro.domain.user.service.UserCreationUseCase
import br.com.silveira.raphael.spring.cloud.stream.kafka.avro.domain.user.service.UserCreationUseCaseImpl
import br.com.silveira.raphael.spring.cloud.stream.kafka.avro.domain.user.service.UserReceiptUseCase
import br.com.silveira.raphael.spring.cloud.stream.kafka.avro.domain.user.service.UserReceiptUseCaseImpl
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ServiceConfig {

    @Bean
    fun creation(gateway: UserCreationGateway): UserCreationUseCase = UserCreationUseCaseImpl(gateway = gateway)

    @Bean
    fun receipt(gateway: UserReceiptGateway): UserReceiptUseCase = UserReceiptUseCaseImpl(gateway = gateway)
}
