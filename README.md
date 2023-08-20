# microservicios-ejs-docker

## Running microservicios-ejs-docker locally
Microservicios-ejs-docker is a [Spring Boot](https://spring.io/guides/gs/spring-boot) microservice project, built using [Maven](https://spring.io/guides/gs/maven/) and [Docker](https://www.docker.com/). You can build using [Docker Compose](https://docs.docker.com/compose/), and using a [docker volume](https://docs.docker.com/storage/volumes/) to keep the database:

```
git clone https://github.com/HarDep/microservicios-ejs-docker.git
cd microservicios-ejs-docker
docker volume create --name db_data_m2
docker-compose up
```
