# AWS API Gateway

## add 2nd resources.  


//--------------

```

var faker = require('faker');

exports.handler = function(event, context) {
	var order = {};
	order.id = event.orderId;
	order.name = getName();
	order.address = getShippingAddress();
	order.price = getPrice();
	context.succeed(order);  // return value
}

function getName(shoeType) {
	return faker.name.findName();

}

function getShippingAddress() {
	return faker.address.streetAddress() + " " + 
	    faker.address.streetName() + " " + 
	    faker.address.streetSuffix();
}

function getPrice() {
	return faker.commerce.price();	
}




```

 zip it

 $> zip -r acme *

then upload the file into s3



//--------------identify requirements for the ORder api

1 a new resource in the acme shoes api

2 post method

3 integration with lambda



//--------------adding URL parameters

mapping templates.   


Amazon API Gateway defines a set of variables and functions for working with models and mapping templates. This document describes those functions and provides examples for working with input payloads.


```
$context

$input
$input.json(x)
$input.params()
$input.path(x)

POST /things
{
    "pets":{
        "pet1":"dog",
        "pet2":"cat",
        "pet3":"koala"
    }

}


$util
$util.escapeJavaScript()
$util.base


```




//--------------

in integration request

add mapping template


Generate template:  


{"orderId":"$input.params('id')"}



//--------------summary

1 created getOrderStatus lambda function.  

2 added the order api resource.   

3. restful url with mapping templates.   

 




//--------------



//--------------



