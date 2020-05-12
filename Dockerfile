FROM openjdk:8-alpine

RUN apk update
RUN apk add  maven
COPY pom.xml /usr/local/calculator_app/pom.xml
COPY src /usr/local/calculator_app/src
WORKDIR /usr/local/calculator_app
RUN mvn package
CMD ["java","-cp","target/docker-image.jar","com.mycompany.calculator_app.calculator"]
