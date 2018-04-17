# AWS API Gateway

## creating an api key.   
1 purpose.   
monitoring and usage of API.  
 1) write to cloudwatch.   
 2) per method.  

not for authorization.   
API key is sent along in the http headers!!! anyone can use it and find it using network flow analysis

better option:   
1 signed API calls.  
2 OAuth.  


//-------------- setting up api key.   
1 create an api key in the api dashboard.   
2 specify api and stages of that api key.   
3 specify methods for the api key.   
4 provide IAM role that has the right to write to cloudwatch.   


//--------------creating and enabling  an api key 

create api key    

create a UsagePlan, then associate your API and Stage to the UsagePlan.

enable api keys per method


//--------------associating the API key with the AWS API gateway.  
enable the API key on the /order endpoints.  

in resources -> /order -> post -> method request-> API key required -> tick true

also, in 
    GEt/{id}, -> method request-> API key required -> tick true

then hit deploy API(so that api key applys)

then we use postman,

when we set header
"x-api-key":"ourAPIKey", then we get get access to  url/stage/order/ab956


//--------------enable cloudwatch logging

1 store api calls in CloudWatch logs.  
2 provides visibility of api keys in use.   
3 similar to aws lambda logging.  

creating the policy statement. 

```
{
 "Version": "2018-2-21",
 "Statement":[
 {
 	"Action":[
 	  "logs:*"
 	],
 	"Effect":"Allow",
 	"Resource":"arn:aws:logs:*:*:*"
 }

 ]
}

```

creating the role

```
{
 "Version": "2018-2-21",
 "Statement":[
 {
 	"Sid":"",
 	"Effect":"Allow",
 	"Principal":{
 		"Service":"apigateway.amazonaws.com"
 	},
 	"Action":"sts:AssumeRole"
 }

 ]
}

```


specifying the role.   

use this role:
AmazonAPIGatewayPushToCloudWatchLogs


then in api gateway -> setttings -> CloudWatch log role ARN -> paste the role ARN


//--------------   creating the IAM role for cloudwatch logs

use cloudwatch to log how api key is used


//--------------   creating the IAM policy and role

create the IAM policy  
create the IAM role.  
assign the role to API gateway.  








//--------------   





//--------------   






//--------------   





