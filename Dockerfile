FROM maven
EXPOSE 8080
MAINTAINER jsbhatia12367@gmail.com
COPY target/docker-image.jar
ENTRYPOINT ["java","-jar","/docker-image.jar"]
