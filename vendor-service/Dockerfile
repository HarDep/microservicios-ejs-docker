FROM openjdk:17
COPY target/microservicios-2-0.0.1-SNAPSHOT.war vendor-service.war
ENTRYPOINT ["java","-jar","/vendor-service.war"]