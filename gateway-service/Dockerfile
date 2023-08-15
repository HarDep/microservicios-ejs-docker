FROM openjdk:17
COPY target/microservicios-2-0.0.1-SNAPSHOT.war gateway-service.war
ENTRYPOINT ["java","-jar","/gateway-service.war"]