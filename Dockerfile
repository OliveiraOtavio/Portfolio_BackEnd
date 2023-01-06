
FROM amazoncorreto:19-alpine-jdk

MAINTAINER otavio_oliveira

COPY target/Portfolio_Otavio_Oiveira-0.0.1-SNAPSHOT.jar Portfolio_Otavio_Oiveira-0.0.1-SNAPSHOT.jar 

ENTRYPOINT ["java","-jar","/Portfolio_Otavio_Oiveira-0.0.1-SNAPSHOT.jar "]