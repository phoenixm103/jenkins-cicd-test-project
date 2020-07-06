FROM openjdk:8-jdk-alpine
EXPOSE 6090
WORKDIR /app 
COPY target/jenkins-cicd-test-project-0.0.1-SNAPSHOT.jar .
ENTRYPOINT [ "java", "-jar", "jenkins-cicd-test-project-0.0.1-SNAPSHOT.jar" ]
