FROM maven:3.9.6-eclipse-temurin-17
WORKDIR /app
COPY . /app
WORKDIR /app/safewater-api
RUN mvn clean package -DskipTests
EXPOSE 8080
CMD ["java", "-jar", "target/safewater-api-0.0.1-SNAPSHOT.jar"]
USER 1000