# Lambda Proxy

Lambda responsável por fazer receber a chamada do API gateway e redirecionar para o serviço de pagamentos.



## Desenvolvimento local

* Docker
* Docker compose
* Java 11
* SDKMAN!

### Comandos:

Subir os containers com o Kafka: `docker-compose up -d`

Rodar a aplicação: `./gradlew :bootRun`

Fazer uma requisição:
```shell
curl --location --request POST 'http://localhost:8080/users' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "Teste",
    "age": 1,
    "address": "Rua 4, 1258",
    "site": "ofuxico.com"
}'
```

Listar schemas criados no schema-registry: 
```shell
curl --location --request GET 'http://localhost:8081/subjects'
```

Listar ultima versão de um schema:
```shell
curl --location --request GET 'http://localhost:8081/subjects/user.creation.topic-value/versions/latest'
```

Informações sobre o cluster, tópicos e consumer-groups:
http://localhost:9021
