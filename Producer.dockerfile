FROM openjdk:11-jdk-slim

LABEL descripton="app_producer"
LABEL version="1.0.0"

COPY producer/ producer/

RUN cd producer && ./mvnw clean install -DskipTests

EXPOSE 8090

ENTRYPOINT ["java","-jar","/producer/target/producer-0.0.1-SNAPSHOT.jar"]
