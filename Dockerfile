FROM openjdk:17.0.2-jdk

WORKDIR /app

COPY target/com-learn-kub-mini-1.0.1.jar com-learn-kub-mini.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "com-learn-kub-mini.jar"]