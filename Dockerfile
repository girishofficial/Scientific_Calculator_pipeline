FROM maven:3.8.6-eclipse-temurin-17 AS build

WORKDIR /app

# Copy the pom.xml and download dependencies
COPY pom.xml .
RUN mvn dependency:go-offline

# Copy the source code
COPY src ./src

# Build the project and run tests
RUN mvn clean install

FROM eclipse-temurin:17-jdk

WORKDIR /app

# Copy the built jar from the build stage
COPY --from=build /app/target/Scientific_Calculator-1.0-SNAPSHOT.jar .

# Set entry point to run the calculator program
ENTRYPOINT ["java", "-jar", "Scientific_Calculator-1.0-SNAPSHOT.jar"]