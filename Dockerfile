FROM iamdhruvp/ubuntu_18.04.3_lts-openjdk_1.8.0_242
EXPOSE 8080
MAINTAINER jsbhatia12367@gmail.com
ADD target/docker-image.jar
ENTRYPOINT ["java","-jar","/docker-image.jar"]
