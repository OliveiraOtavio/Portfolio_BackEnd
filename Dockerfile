
FROM amazoncorretto: 11-alpine-jdk 
MAINTAINER OTAVIO
COPY target/Portfolio_Otavio_Oiveira-0.0.1-SNAPSHOT.jar portfolio-otavio-oliveira.jar
ENTRYPOINT ["java", "-jar", "/portfolio-otavio-oliveira.jar"]