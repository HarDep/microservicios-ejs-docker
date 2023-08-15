FROM openjdk:17
COPY target/microservicios-2-0.0.1-SNAPSHOT.war customer-service.war
ENTRYPOINT ["java","-jar","/customer-service.war"]