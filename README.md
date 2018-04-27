## Usefull Commands

- #### `./mvnw package`
build project with maven

- #### `java -jar {jarFilePath}` 
run .jar file

- #### `./mvnw install dockerfile:build`
build a tagged docker image

- #### `mvn ackage dockerfile:build` 
build a tagged docker image (if you have maven installed) 

- #### `./mvnw dockerfile:push`
push docker image to dockerhub

- #### `docker images`
see all docker images

- #### `docker run -p 8080:8080 -t {imageName}`
start a container from the given image name, on host port 8080 and container port 8080 

- #### `docker ps` 
show all currently running containers

- #### `docker stop {containerId}` 
stop the container with the given containerId

- #### `docker rm {containerId}`
remove the container with the given containerId

- #### `docker container ls -l`
list all containers

- #### `docker start {containerId}` 
Start one or more stopped containers

- #### `docker logs {containerId}`
Fetch the logs of a container

## Usefull Links

### Docker
Get started tutorial: https://docs.docker.com/get-started/

### Docker Compose
Overview: https://docs.docker.com/compose/overview/  
Github: https://github.com/docker/compose  

### Spring sample project with basic docker config
Github: https://github.com/spring-guides/gs-spring-boot-docker/tree/master/complete  
Guide: https://spring.io/guides/gs/spring-boot-docker/  

### Finki SOA Labs 2018
Intro to Docker: https://gitlab.com/soa-labs/2018-1  
Intro to Eureka: https://gitlab.com/soa-labs/2018-2  
Intro to Zuul: https://gitlab.com/soa-labs/2018-3  

### Traefik links (refactor!)
How to Use Traefik as a Reverse Proxy: https://www.digitalocean.com/community/tutorials/how-to-use-traefik-as-a-reverse-proxy-for-docker-containers-on-ubuntu-16-04
How To Install Docker Compose on Ubuntu 16.04: https://www.digitalocean.com/community/tutorials/how-to-install-docker-compose-on-ubuntu-16-04