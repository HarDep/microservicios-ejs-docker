FROM openjdk:17
COPY ./target/microservicios-2-0.0.1-SNAPSHOT.war employee-service.war
ENTRYPOINT ["java","-jar","/employee-service.war"]
#WORKDIR /app

#COPY .mvn/ .mvn
#COPY mvnw pom.xml ./
#RUN ./mvnw dependency:resolve

#COPY src ./src

#CMD ["./mvnw", "spring-boot:run"]