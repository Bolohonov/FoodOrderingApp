FROM bellsoft/liberica-openjdk-alpine:17
COPY target/*.jar kafkaproducer.jar
ENTRYPOINT ["java","-jar","kafkaproducer.jar"]
