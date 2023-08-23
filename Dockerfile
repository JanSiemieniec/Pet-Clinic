#
# Build stage
#
FROM maven:3.6.0-jdk-11-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

#
# Package stage
#
FROM eclipse-temurin:17-jdk-alpine
COPY --from=build /home/app/target/PetClinicWeb-0.0.3.jar /usr/local/lib/PetClinicWeb.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/local/lib/PetClinicWeb.jar"]
