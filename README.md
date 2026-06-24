# Mini Spring Boot Project

This is a simple Spring Boot project with one controller that returns a string.

## Prerequisites

- JDK 17
- Maven

## Build and Run

1. Navigate to the project directory:
   ```
   cd mini
   ```

2. Build the project:
   ```
   mvn clean install
   ```

3. Run the application:
   ```
   mvn spring-boot:run
   ```

4. Access the endpoint:
   Open a browser and go to `http://localhost:8080/` to see the returned string.

## Project Structure

- `src/main/java/com/learn/kub/mini/MiniApplication.java`: Main application class
- `src/main/java/com/learn/kub/mini/HelloController.java`: REST controller returning a string
- `src/main/resources/application.properties`: Application configuration