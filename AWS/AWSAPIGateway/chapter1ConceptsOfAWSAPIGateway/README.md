# AWS API Gateway

## what is the aws api gateway - concepts and capabilities of the API gateway  

API Gateway -- Amazon API Gateway is a fully managed service that makes it easy for developers to create, publish, maintain, monitor, and secure APIs at any scale. 

EC2, lambda

reaons to choose the aws api gateway
1) servers  
2) security  
3) scaling  
4) monitoring  

security is managed for you.  


Reasons not to choose the aws api gateway
1) business constraints  
2) features  
3) pre-existing services  

our tools  
1) aws console  
2) postman  
3) faker.js  

IAM, AWS api gateway, lambda, cloudwatch    

postman

ACME shoes  
1 explosive growth  
2 customer service reps overwhelmed  
3 use technology to solve the problem  
4 set the stage for integrated e-commerce  

Module in Review  
1 managed service from AWS for building APIs  
2 rapid and scalable  
3 doesn't fit 100% of the time  
4 our toolset  
5    

## create RESTful APIs to call   
publicly available HTTP endpoints  
lambda functions  
AWS services   

What is a REST API to API gateway?   
1 a group of resources and methods  
2 can be versioned   
3 can be deployed to multiple stages  

 
 resources  
 1 typed object, part of our API's domain   
 2 may have data model and relationshops to other resources  
 3 can respond to different methods  


definiton of a stage  
https://myapi.com/dev/shoes  
https://myapi.com/beta/shoes   
https://myapi.com/v1/shoes  

lifecycle of an API  
1 API  
2 Staging API  
3 production v1  

1 API  
2 staging API  
3 production v2  

//--------------API Monitoring  
1 API calls, latency, Errors   
2 sotred in cloudwatch  
3 alarms via cloudwatch  
4 logs by version and method  
5 available near real-time  


//--------------Use of HTTPS   

  
//--------------Using AWS API Gateway with VPC    
All AWS APIs are publicly accessible  
cannot communicate with services inside a VPC unless a public endpoint is exposed  

add an elastic IP to the EC2 instance, and direct the API gateway to the ealstic IP allowing us to use that as a backend service  


//--------------throttling API calls  
1 throttle by burst and rate limits  
2 prevent overloading backedn services  


//--------------throttling API calls  



//--------------caching your API requests  
1 configured pre stage  
2 improve performance  
3 reduce traffic  
4 from 0.5GB to 237 GB
5 additional billing charges apply  


//--------------Billing  
$3.5 per million API requests

+ 

Data out charges:
$0.09/GB for the first 10TB  
$0.085/GB for the next 40TB  
$0.07/GB for the enxt 100TB  
$0.05/GB for the next 350TB

+ cache charges  
0.5G $0.020/hour  
1.6G $0.038/hour
6.1G $0.2/hour
...

//--------------MOdule summary  
1 concepts and capabilities  
 1) compatible backends  
 2) defined resources, methods, and stages  
 3) deployment lifecycle  

monitoring  
throttleing  
caching  
billing  



