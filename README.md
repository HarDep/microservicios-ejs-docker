# microservicios-ejs-docker

## Running microservicios-ejs-docker locally
Microservicios-ejs-docker is a [Spring Boot](https://spring.io/guides/gs/spring-boot) microservice project, built using [Maven](https://spring.io/guides/gs/maven/) and [Docker](https://www.docker.com/). You can build a jar file and run it from the command line (it should work just as well with Java 17 or newer):

```
git clone https://github.com/HarDep/microservicios-ejs-docker.git
cd microservicios-ejs-docker
./mvnw package
java -jar target/*.jar
```

Another way to run the project without using java is using [Docker Compose](https://docs.docker.com/compose/):

```
git clone https://github.com/HarDep/microservicios-ejs-docker.git
cd microservicios-ejs-docker
docker-compose up
```
