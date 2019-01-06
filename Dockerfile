FROM openjdk:8u92-jre-alpine
VOLUME /tmp

ARG version
ADD *.jar boot-0.0.1-SNAPSHOT.jar
 EXPOSE 8080
 ENTRYPOINT ["java","-jar","boot-0.0.1-SNAPSHOT.jar"]