FROM openjdk:11.0.14.1-jre
WORKDIR /tmp
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]