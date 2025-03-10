# Build the application
FROM maven:3.8.6-jdk-17 AS build
WORKDIR /app
# Copy the Maven project files
COPY pom.xml .
COPY src ./src
# Build the application(skip the test part)
RUN mvn clean package -DskipTests
#Run the application
FROM openjdk:17-jdk-alpine
WORKDIR /app
# Copy the JAR file from the build stage
COPY --from=build /app/target/AddAPI-0.0.1-SNAPSHOT.jar app.jar
# Expose the port the application will run on
EXPOSE 8081
# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]