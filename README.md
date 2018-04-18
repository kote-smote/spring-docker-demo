## Usefull Commands

- ### `./mvnw package`
build project with maven

- ### `java -jar {jarFilePath}` 
run .jar file

- ### `./mvnw install dockerfile:build`
build a tagged docker image

- ### `mvn ackage dockerfile:build` 
build a tagged docker image (if you have maven installed) 

- ### `./mvnw dockerfile:push`
push docker image to dockerhub

- ### `docker images`
see all docker images

- ### `docker run -p 8080:8080 -t {imageName}`
start a container from the given image name, on host port 8080 and container port 8080 

- ### `docker ps` 
show all currently running containers

- ### `docker stop {containerId}` 
stop the container with the given containerId

- ### `docker rm {containerId}`
remove the container with the given containerId

- ### `docker container ls -l`
list all containers

- ### `docker start {containerId}` 
Start one or more stopped containers

- ### `docker logs {containerId}`
Fetch the logs of a container

## Usefull Links

### Spting sample project with basic docker config
https://github.com/spring-guides/gs-spring-boot-docker/tree/master/complete  
https://spring.io/guides/gs/spring-boot-docker/  

### Docker Compose
https://docs.docker.com/compose/overview/  
https://github.com/docker/compose  

### Todo
- [X] Done
- [ ] Undone
