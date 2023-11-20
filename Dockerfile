FROM maven:3.8.5-openjdk-17 AS built
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --from=built /target/TryAgain-0.0.1-SNAPSHOT.jar TryAgain.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "TryAgain.jar"]