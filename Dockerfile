FROM eclipse-temurin:17-jdk

WORKDIR /app

# Copy the built JAR into the image
COPY target/*.jar app.jar


# Run the JAR
ENTRYPOINT ["java", "-jar", "app.jar"]
