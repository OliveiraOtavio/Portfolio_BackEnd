FROM alpine:3.16

ARG version=19.0.1.10.1

MAINTAINER otavio_oliveira

COPY target/Portfolio_Otavio_Oiveira-0.0.1-SNAPSHOT.jar Portfolio_Otavio_Oiveira-0.0.1-SNAPSHOT.jar 

ENTRYPOINT ["java","-jar","/Portfolio_Otavio_Oiveira-0.0.1-SNAPSHOT.jar "]