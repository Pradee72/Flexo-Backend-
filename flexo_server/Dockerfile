FROM openjdk:21-jdk
COPY target/flexo_server-0.0.1-SNAPSHOT.jar /app/flexo.jar
WORKDIR /app
EXPOSE 4040
CMD [ "java","-jar","flexo.jar" ]