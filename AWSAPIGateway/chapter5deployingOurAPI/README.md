# AWS API Gateway

## module objectives.   
1 deploy an api   
2 test the api.  
3 install postman.   
4 generate client SDKs.   


//--------------traditional deployments.   
1 server.    
2 OS + dependencies(like node js).   
3 jenkins.  or  pull from github manually.   
4 app is ready.   


//--------------api gateway deployment.   
1 post-deployment settings.  
1) cache settings.  
faster

2) cloudwatch settings.   
logs.  

3) throttling settings.  
limit.   -- burst limit.    
rate.   

4) client certificate.   
specify custom SSL client



//--------------deploy APIs

from the resource page, click action -> deploy api

state -> new stage ->.  

after setting 
cache.  
cloudwatch.  
rate.  
etc.   

we get the api addr from aws console.   


//--------------use postman to test.  


//--------------use curl to test.   

curl url/stage/shoes

curl -XPOST url/stage/order -d '{"orderId":"testid123"}'

curl url/stage/order/testid123



//--------------generating a client SDK.   







//--------------review.   





