FROM openjdk:17
#COPY target/microservicios-2-0.0.1-SNAPSHOT.war vendor-service.war
#ENTRYPOINT ["java","-jar","/vendor-service.war"]
WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN chmod +x mvnw && ./mvnw dependency:resolve

COPY src ./src

CMD ["./mvnw", "spring-boot:run"]
