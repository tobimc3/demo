FROM eclipse-temurin:24-jdk

WORKDIR /app

# Copy the built JAR into the image
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

# Run the JAR
ENTRYPOINT ["java", "-jar", "app.jar"]
