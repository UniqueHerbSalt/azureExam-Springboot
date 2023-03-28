FROM eclipse-temurin:17-jdk-alpine
MAINTAINER sungminlee@sindoh.com

COPY build/libs/azureExam-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]