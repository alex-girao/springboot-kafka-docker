FROM openjdk:11-jdk-slim

LABEL descripton="app_consumer"
LABEL version="1.0.0"

COPY consumer/ consumer/

RUN cd consumer && ./mvnw clean install -DskipTests

EXPOSE 8091

ENTRYPOINT ["java","-jar","/consumer/target/consumer-0.0.1-SNAPSHOT.jar"]
