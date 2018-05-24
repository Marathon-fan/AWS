AWS SAM(Serverless Application Model ) simple tutorial

John Zhou



Introduction: 
Lambda function will of course be a vital component of Lendi Production. This simple tutorial provides a fast bootstrap on how to start a local environment to test lambda function.

```
After installing local environment, it could be faster to test lambda function in local environment without deploying it into lambda.

1 install SAM(AWS Serverless Application Model ) and docker
install SAM(mac version)
(1) download SAM from the following addr and unpack it:
https://github.com/awslabs/aws-sam-local/releases/download/v0.2.11/sam_0.2.11_darwin_386.tar.gz
(2) $> sudo vi ~/.bash_profile
then add SAM address to PATH
(3) $> source ~/.bash_profile
```
```
install docker
```

```
2 write lambda function and SAM file(template.yaml)
For the sake of demo, we can use dir/products.js, dir/template.yaml in this link:
https://docs.aws.amazon.com/lambda/latest/dg/test-sam-local.html
```

```
3 test the serverless function locally
$> sam local start-api

$> curl http://localhost:3000/products

$> curl -XDELETE http://localhost:3000/products/1
```


call SAM locally
```
template.yaml is a sample file that can be used to call lambda locally with some modification 


1 install SAM(serverless application model)   as preivous described
2 $> sbt assembly    
3 $> sam local invoke DemoFunction -e sampleInput/test3.json

```


author: John.Zhou

version: 0.0.1

date: 19Apr2018

