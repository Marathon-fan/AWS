
# how to use it


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

