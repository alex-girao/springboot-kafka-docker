FROM openjdk:11-jre-slim

LABEL descripton="app_consumer"
LABEL version="1.0.0"

EXPOSE 8091

COPY consumer/target/*.jar consumer.jar

ENTRYPOINT ["java","-jar","consumer.jar"]
