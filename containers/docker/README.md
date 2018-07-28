
# how to use it

## docker commands

```
docker ps
```

To show all containers use the given command:
```
docker ps -a
```

Copy a file from host to container:
```
$ docker cp foo.txt 72ca2488b353:/foo.txt
```
Copy a file from Docker container to host:
```
$ docker cp 72ca2488b353:/foo.txt foo.txt
```

```
docker stop bea1edddf747
```


```
To start an existing container which is stopped

docker start <container-name/ID>
```

Docker inspect provides detailed information on constructs controlled by Docker.(like ip addr. etc)

```
docker inspect <container-name/ID>
```

Inspecting the network is an easy way to find out the container’s IP address.
```
$ docker network inspect bridge
```


Show all mapped ports
```
docker port <container-name/ID>
```

add new port to a running container
```
docker run -d -p 4000:4000 --name mytest mistytest

docker container stop mytest

docker container start mytest # same port

docker container stop mytest

docker container run -p 4001:4000 mytest # Now mapping container port 4000 to host port 4001
```



## 1 project outline    
section2: working with docker images  
section3: create containerized web applications  
section4: docker networking  
section5: create a continuous integration pipeline  
section6: deploy docker containers in production  
dockerproject1: ScalatraSlickScalaTestAngularMySQLDocker  

## 2 docker projects   
### dockerproject1: ScalatraSlickScalaTestAngularMySQLDocker  
use Scalatra(scala), Slick(scala), ScalaTest(sclala), Angular(Angular4, typescript), MySQL, and Docker(Dockerfile, dockercompose) to build a fullstack project with CRUD functionality for users and posts.   

### dockerproject2: dockerSpringBootKafkaZookeeper  
run producers/consumers(Kafka) inside docker. In this project, Kafka/Zookeeper and Spring boot app are dockerized.    
Essentially, each components are dockerized, then use docker-compose(version 3 can automatically convert and link hostnames inside docker-compose network). This is good for final deployment as we can deploy the whole program with a single command. Take the advantage of docker network!       


## 3 docker images
### image 1(debian with vim and git)  
```
$> docker pull marathonfan/debian:1.01
```

### image 2(distributed lookup service)  
```
$> docker pull marathonfan/dockerapp
```

### image 3(ScalatraSlickScalaTestAngularMySQLDocker-the backend version)  
```
$> docker pull marathonfan/scalatrabackend:0.1
```


## 4 docker examples  
### push a image into dockerhub  
```
$> docker images
$> docker tag image_id dockerhub_id/image_name:version_tag   
//"dockerhub_id/image_name" is called dockerhub repository name
$> docker images
$> docker login --username=xxx
   then enter password
$> docker push dockerhub_id/image_name:version_tag  

```

