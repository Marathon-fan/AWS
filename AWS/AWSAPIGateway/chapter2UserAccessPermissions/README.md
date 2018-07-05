# AWS API Gateway

## granting user access permissions 

//--------------about access policies 
access is denied unless a policy exists allowing access

are built using a combination of action-statements and resource-statements

```
{
	"Version": "2012-10-17",
	"Statement": [
	    {
	    	"Effect" : "Allow",
	    	"Action": [
	    	    "action-statement"
	    	
	    	],
	    	"Resource": [
	    	    "resource-statement"

	    	]
	    }

	]

}

```

action-statement:
GET, POST, PUT ...

resource-statement:
API gateway resources where region is an AWS target region and resource-path-specifier is the path to the target resources

```
   "Resource" : [
       "arn:aws:apigateway:region::resource-path-specifier"
   ]

```


//--------------controlling API access
1 manage API entities
controlling access to the API entity in the AWS console !!!

2 manage calling APIs:
controlling calls to the API via IAM authentication

//--------------action statements
```
 "Effect": "Allow",
 "Action": [
     "apigateway:*"
 ]

```

```
 "Effect": "Allow",
 "Action": [
     "apigateway:GET",
     "apigateway:POST"

 ]

```


//--------------Managing entities: resource statements
define access to the resources within an API such as stages, models, and resources

```
    arn:aws:apigateway:region::resource-path-specifier

```


```
    arn:aws:apigateway:region::/restapis/*

```


```
    arn:aws:apigateway:region::/restapis/api-id/*

```

```
    arn:aws:apigateway:region::/restapis/api-id/resources/resource-id/*

```


```
    arn:aws:apigateway:region::/restapis/api-id/resources/resource-id/methods/GET

```


//--------------managing access: calling APIs
1 allows securing access to APIs with IAM
2 requires API requests to be signed
3 only supports AWS signature version 4
4 requied code included with SDK



//--------------action statements

```
  ""

```



//--------------
```
    arn:aws:apigateway:region::api-id:/stage-name/resource-path-specifier

```

the following example specifies any resource path in any stage, for any API in any AWS region
```
    arn:aws:apigateway:*::*:*
```

the following example specifies any resource path in any stage, for any API in the region "us-east-1"
```
    arn:aws:apigateway:us-east-1::*:*
```


the following example specifies any resource path in the stage of test, for the API with an identifier api-id in the AWS region "us-east-1"
```
    arn:aws:apigateway:us-east-1::api-id:/test/*
```


//--------------policy statement
```
{
	"version": "2018-10-21",
	"Statement": [
	    {
	    	"Effect": "Allow",
	    	"Action": [
	    	    "apigateway:GET"

	    	],
	    	"Resource":[
	    	    “*"
	    	]

	    },
	    {
	    	"Effect": "Allow",
	    	"Action": [
	    	    "apigateway:*"

	    	],
	    	"Resource":[
	    	    "arn:aws:apigateway:us-west-2::/restapis/*/stages/dev"
	    	]

	    }
	]
}
```


//--------------Module Summary
1 capablities of access policies

1) flexible
2) access control  
3) combination of action-statements and resource statements

2 can be used for:
1) managing API entities
2) managing calling APIs

3 implementation scenarios

4 created a policy to be sued by Acme shoes developers





//--------------



//--------------

