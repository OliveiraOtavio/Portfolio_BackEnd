FROM amazoncorretto:17-alpine-jdk
MAINTAINER otavio_oliveira
COPY target/Portfolio_Otavio_Oiveira-0.0.1-SNAPSHOT.jar app.jar 
ENTRYPOINT ["java","-jar","/app.jar"]
