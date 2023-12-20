FROM bellsoft/liberica-openjdk-alpine:17
COPY target/*.jar kafkaconsumer.jar
ENTRYPOINT ["java","-jar","kafkaconsumer.jar"]
