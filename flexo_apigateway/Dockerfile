FROM openjdk:21-jdk
COPY target/kafka_producer-0.0.1-SNAPSHOT.jar /app/kafka_producer.jar
WORKDIR /app
EXPOSE 2020
CMD [ "java","-jar","kafka_producer.jar" ]