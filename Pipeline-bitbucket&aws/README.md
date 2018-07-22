# bitbucketPipeline   

Bitbucket Pipelines is an integrated CI/CD service, built into Bitbucket. It allows you to automatically build, test and even deploy your code, based on a configuration file in your repository. Essentially, we create containers in the cloud for you. Inside these containers you can run commands (like you might on a local machine) but with all the advantages of a fresh system, custom configured for your needs.


```
build

test

deploy to staging

deploy to production
```

There is a lot you can configure in the bitbucket-pipelines.yml file, but at its most basic the required keywords are:
```
pipelines: contains all your pipeline definitions.

default: contains the steps that run on every push.

step: each step starts a new Docker container with a clone of your repository, then runs the contents of your script section. 

script: a list of commands that are executed in sequence.
```

```
Step 1: Choose a language template

Step 2: Configure your pipelines

Pipelines will now automatically trigger whenever you push changes to your repository running the default pipeline.

```

///////////////////////////////////////////////////////////////////////////////////     
///////////////////////////////////////////////////////////////////////////////////


a simple example
```
image: node:5.11.0              # use docker image

pipelines:
  default:
    - step:
        script:
          - npm  --version
          - npm install
          - npm test
          - ./deploy-to-s3.bash $AWS_SECRET_ACCESS_KEY $AWS_ACCESS_KEY_ID  

```

when usin pipeline, you can have the same environment in your local machine(using docker) as that in cloud   



a more complex example:   
```
image:
  name: xxxx/node-s3              # a default image for all the pipeline configurations
  username: $DOCKERHUB_USERNAME
  password: $DOCKERHUB_PASSWORD

pipelines:
  branches:
    feature/*:
     - step:
         image: node:5.11.0      # will not use the default docker image, but use this docker image 
         script:
           - npm install
           - npm test 
    master:
     - step:
         script:
           - npm install
           - npm test
           - ./deploy-to-s3.bash "staging-bucket" $AWS_SECRET_ACCESS_KEY $AWS_ACCESS_KEY_ID
    production:
     - step:
         script:
           - npm install
           - npm test
           - ./deploy-to-s3.bash "production-bucket" $AWS_SECRET_ACCESS_KEY $AWS_ACCESS_KEY_ID

```


## define environment variables   
In bitbucket pipeline UI, define the following variables    
```
variable name                           value                  
AWS_S3_BUCKET                           xxx-project
AWS_SECRET_ACCESS_KEY                   XXXXX
AWS_ACCESS_KEY_ID                       XXXXXXXXX

```

## bitbucket pipeline and aws   
```
https://bitbucket.org/awslabs/aws-codedeploy-bitbucket-pipelines-python/src/master/

https://bitbucket.org/awslabs/amazon-ecs-bitbucket-pipelines-python/src/master/

https://www.youtube.com/watch?v=UcSChlLRsvo

```

