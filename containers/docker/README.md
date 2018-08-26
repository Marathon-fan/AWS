
# how to use it

## docker commands


share data between host and docker
```sh
docker volume ls

DRIVER              VOLUME NAME
local               mariadb_data
local               suitecrm_data

# then use 
docker inspect suitecrm_data # or other volumn name
# then we see
"Mounts": [
            {
                "Type": "volume",
                "Name": "mariadb_data",
                "Source": "/var/lib/docker/volumes/mariadb_data/_data",
                "Destination": "/bitnami",
                "Driver": "local",
                "Mode": "rw",
                "RW": true,
                "Propagation": ""
            } 

# Remove a volume:
$ docker volume rm my-vol

```

How to edit file after I shell to a docker container?
```sh
If you don\'t want to add an editor just to make a few small changes (e.g., change tomcat config), you can just

docker cp <container>:/path/to/file.ext .

which copies it to your local machine (to your current directory). Then edit the file locally using your favorite editor, and then do a

docker cp file.ext <container>:/path/to/file.ext

to replace the old file.
```

debug
```sh
Got permission denied while trying to connect to the Docker daemon socket at unix:///var/run/docker.sock

sudo usermod -a -G docker $USER
```
After doing that, you should be able to run the command without any issues. Run 

```sh
docker run hello-world 
```
as a normal user in order to check if it works. Reboot if the issue still persists.



Logging out and logging back in is required because the group change will not have an effect unless your session is closed.
```

use volumes to presist data in local machine as it will mount host folder to vm
```
volumes

Mount host folders or named volumes. Named volumes need to be specified with the top-level volumes key.
```

show docker logs
```
docker logs [OPTIONS] CONTAINER

--follow , -f		 Follow log output
--since		         Show logs since timestamp (e.g. 2013-01-02T13:23:37) or relative (e.g. 42m for 42 minutes)
--tail	[number/all] Number of lines to show from the end of the logs
```

```

```sh
docker exec -it containerName/containerId bash
docker exec -it mysql1 mysql -uroot -p     # enter password and login to mysql shell
```

shared filesystems
```sh
VOLUME (shared filesystems)
-v=[]: Create a bind mount with: [host-dir:]container-dir[:rw|ro].
       If 'host-dir' is missing, then docker creates a new volume.
       If neither 'rw' or 'ro' is specified then the volume is mounted
       in read-write mode.
--volumes-from="": Mount all volumes from the given container(s)

example:


```


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

show all containers
```
docker ps -a
```

Remove all stopped containers
```
$ docker rm $(docker ps -a -q)
```


remove an image
```
docker rmi  imageID
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

