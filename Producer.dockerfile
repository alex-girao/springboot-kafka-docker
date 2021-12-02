FROM openjdk:11-jre-slim

LABEL descripton="app_producer"
LABEL version="1.0.0"

EXPOSE 8090

COPY producer/target/*.jar producer.jar

ENTRYPOINT ["java","-jar","producer.jar"]
