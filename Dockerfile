FROM openjdk:17-jdk-slim
WORKDIR /jenkinslabapp
COPY target/jenkinslabapp.jar jenkinslabapp.jar
ENTRYPOINT ["java", "-jar", "jenkinslabapp.jar"]