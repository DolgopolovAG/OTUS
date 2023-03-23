FROM bellsoft/liberica-openjdk-alpine-musl:11
WORKDIR /tmp
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]