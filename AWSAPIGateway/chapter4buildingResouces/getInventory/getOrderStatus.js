
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


