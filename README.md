# springboot-kafka-docker
Ecossistema funcional com Spring Boot, Kafka e Docker

## Executar o ecosssistema
#### build do producer
```bash
mvn -f producer/ clean install -DskipTests
```
ou dentro da pasta producer
```bash
./mvnw clean install -DskipTests

```
#### build do consumer
```bash
mvn -f consumer/ clean install -DskipTests
```
ou dentro da pasta consumer
```bash
./mvnw clean install -DskipTests

```
#### subir o ambiente
```bash
docker-compose -d --build
```

## URLs
#### acesso ao dashboard do Kafka
```bash
http://localhost:19000/
```
#### url teste do producer
```bash
http://localhost:8090/online
```
#### url teste do consumer
```bash
http://localhost:8091/online
```

## Exemplo de uso
#### Enviar mensagem para o tópico
POST /mensagem
```bash
http://localhost:8090/mensagem/
```
Request Body 
```bash
{
	"mensagem": "Mensagem 01"
}
```
