FROM openjdk:8
EXPOSE 8080
MAINTAINER jsbhatia12367@gmail.com
ADD target/docker-image.jar
ENTRYPOINT ["java","-jar","/docker-image.jar"]
