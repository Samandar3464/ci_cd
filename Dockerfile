FROM openjdk:17-alpine
ADD /target/demo-0.0.1-SNAPSHOT.jar demo.jar
ENTRYPOINT ["java","-jar" , "demo.jar"]
EXPOSE 8080