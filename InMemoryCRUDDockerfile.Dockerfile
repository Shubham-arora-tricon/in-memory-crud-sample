FROM openjdk:8-jre-alpine

MAINTAINER shubham.arora@triconinfotech

WORKDIR /InMemoryCRUD

COPY /target/*.jar /InMemoryCRUD/run.jar

ENTRYPOINT ["java", "-jar", "run.jar"]