# AWS API Gateway

## granting user access permissions 



//--------------Lambda Core Feature
1 runs your code on demand  
2 no servers  
3 starts within milliseconds  

node.js  
java 8  
python 2.7  

auto-managed for you:  
1 server  
2 os maintenance  
3 scaling  
4 provisioning  
5 deployment  


//--------------

```js
exports.handler = async (event, context) => {
    // TODO implement
    var input1 = (event.input1 === undefined ? 'Hello' : event.input1);
    var input2 = (event.input2 === undefined ? 'World' : event.input2);
    
    var response = input1 + ' ' + input2;
    context.done(null, {"response": response});
    
};


```

//--------------modeling our data

getInventory()
returns array of available inventory
inventory object {
	name, size, color, description
}


getOrderStatus
returns order shipping details
POST: 
orderId
RETURNS:
Customer name
Address
Shipping method
Price

//--------------Lambda Security Permissions
1 Execution Permissions
permissions that your lambda function needs to access other AWS resources

2 Invocation Permissions
permissions needed by the event source to communicate with your Lambda function

```AWS Basic Execution Policy
{
	"Version": "2018-10-29",
	"Statement":[
	  {
	  	"Effect": "Allow",
	  	"Action":[
	  	  "logs:CreateLogGroup",
	  	  "logs:CreateLogStreams",
	  	  "logs:PutLogEvents"
	  	],
	  	"Resource":"arn:aws:logs:*:*:*"
	  }

	]
}
```

```AWS Invocation Policy
{
	"Statement":
	  {
	  	"StatementId": "Id-1",
	  	"Action": "lambda:InvokeFunction",
	  	"Principal":"apigateway.amazonaws.com",
	  	"sourceArn":"arn:aws:execute-api:api_specific_resource_path",
	  	"SourceAccount":"account-id"
	  }	
}
```


//--------------building the getInventory Function

zip all the files and upload them to aws lambda

$> zip -r inventory * 

then upload the file to lambda

specify "filename.handlerName" so that lambda can find the handler

//--------------Module Review
1 compute serive
2 runs your code on demand
3 manages resources for you

mdodeling our fake data
1 getInventory
2 getOrderStatus

Lambda security
1 execution permissions
2 Invocation permissions



//--------------



//--------------



