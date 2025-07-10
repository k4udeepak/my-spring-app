# Use an official Java runtime as base image
FROM openjdk:24-jdk-slim

# Set working directory
WORKDIR /app

# Copy the built JAR from host into the container
COPY build/libs/*.jar app.jar

# Expose port (change if needed)
EXPOSE 8080

# Run the JAR
ENTRYPOINT ["java", "-jar", "app.jar"]
