FROM openjdk:21-jdk
COPY target/flexo_configuration-0.0.1-SNAPSHOT.jar /app/flexo.jar
WORKDIR /app
EXPOSE 7070
CMD [ "java","-jar","flexo.jar" ]