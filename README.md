# Microserviço Dummy

Projeto exemplo de um microserviço que expõe um único método via REST, o qual realiza uma pausa de cinco segundos, e depois retorna '1'. Roda um servidor jetty embedded na porta 9090.

## Build

    mvn package

## Run

    java -jar target/symposium-rest-service.jar

