# AWS API Gateway

## add 2nd resources.  
1 creating the API  
2 adding a resource.  
3 integrating with lambda.  
4 testing our api.  



//--------------creating the api   
1 enter name and description.    
2 target audience via workflow.   
3 creating the resource.   
1) resource name becomes endpoint.  
2) can created nested resources.  
3) path parameters with brackets.   

4 creating the method
1) define the method verb.  
2) choose the integration type.   


//--------------create an API
1) create the api through aws console board.   
2) crteate resources.  
1) resource.    
2) method.   


//--------------enableing cors on a method.   
1 method response settings   
 define the headers allowed

add three headers
```
Access-Control-Allow-Headers	  
Access-Control-Allow-Methods	  
Access-Control-Allow-Origin
```
2 integration response settings   
 define the values permitted for each header.   


Response header	Mapping value 	
```
Access-Control-Allow-Headers	'Content-Type,X-Amz-Data,Authorization'	
Access-Control-Allow-Methods	'GET,POST'	
Access-Control-Allow-Origin.  	'*'
```

You provide the session token value in the x-amz-security-token header when you send requests to Amazon S3.



//--------------




//--------------



//--------------




//--------------



//--------------




//--------------



//--------------



