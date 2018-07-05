# AWS CloudFormation  

1 -------------      
manage infrastructure manually   
1 good way to start   
2 perfect for proof-of-concept and prototyping   

automate infrastructure   
1 improve quality and efficiency   
2 major benefit of using AWS    



2 -------------      
AWS CloudFormation allows you to create, update, delete the cloud infrastructure automatically   

1) EC2 Instance   
2) VPC   
3) Security Group   
4) RDS    

3 --------------    
Use CloudFormation to create stacks  
1) management console   
2) command line interface  
 
create cloudformation templates    


////////////////////////////////////////////////////////////////////

Every part of AWS is controllable via an API   

1 ec2   
2 security group   
3 update RDS database configuration       
4 networking infrastructre    
5 add new IAM user ...  

////////////////////////////////////////////////////////////////////
tools to access AWS API   
1 command line interface(CLI)    
2 software development KIT(SDK)    




////////////////////////////////////////////////////////////////////

1 resovle dependencies   
1) RDS db needs to be created before EC2 instances are created     
2) security groups needs to be created before EC2 instance is created   

2 update infrastructure   
1) which steps are necessary to update existing infrastructure    
2) hard coded tranformation not very flexible    




////////////////////////////////////////////////////////////////////
Describing infrastruce in code     
1(blueprint) define target state   
2(tooling) transform current state into target state   

1 resovle dependencies automatically      
2 creates, updates or deletes infrastructure    
3 performs idempotent and predictable changes to infrastructure    



////////////////////////////////////////////////////////////////////
AWS cloudformation - describing AWS infrastructure in code    
supports 95% of services on AWS    
free to use   

1 JSON-template  
  Define all needed AWS resources and configure them   
2 cloudFormation    
  transform current state into target state   
3 Stack(cloudformation is creating all resources as described in the template)   
  instance of template running in an AWS region   



////////////////////////////////////////////////////////////////////
Features of CloudFormation    

1 create    
creating resources in the right order based on their dependencies(dependencies are automtatically resolved)   
2 update   
updating existing stacks by making changes to existing resources   
3 delete   
deleting all resources of a stack in the right order based on their dependencies   

template: written in JSON describin the target state of the infrastructure    


////////////////////////////////////////////////////////////////////
A stack in an instance of a template   
EC2, VPC, S3, DDB(dynamoDB), SG(security group), RDS, R53    

we can create multiple stacks with one template   

a template for development and production environment    

a template for multiple clients   



////////////////////////////////////////////////////////////////////
Demo    
1 simple wordpress environment   
1) EC2 instance running web server   
2) rds instance with mysql engine   
3) security gruops  

have a look at template defining target state  

create stack based on template   



////////////////////////////////////////////////////////////////////
tools-    
1 text editor for json    
2 ide integration    
  - eclipse   
  - visual studio   

3 aws cloudformation designer   
1) graphical tool for creating templates  
2) part of aws management console    


////////////////////////////////////////////////////////////////////

summary   
1 automating infrastructure   
1) lower costs   
2) improve quality   
3) improve flexibility   

2 describing infrastructure in code   
1) no scripting or programming needed  
2) perfect tool for the job   

3 aws cloudformation  
1) describing aws infrastructure in code   
2) highly integrated with AWS   






////////////////////////////////////////////////////////////////////

template  
```json
{
	"AWSTemplateFormatVersion": "xxx",
	"Description": "xxx",
	"Parameters": {
	     "VPC": {

	    },
	    "Subnets": {

	    }
     },
     "Mappings": {
     	"RegionMap": {
     		"eu-west-1":{"AMI": "ami-xxxxxx"}
     	}
     },
     "Resources": {
     	"EC2Instance": {
     		"Type":"xxx",
     		"Properties":{
     			"ImageId":{"xxx"},
     			"InstanceType":"t2.nano",
     			"NetworkInterfaces":[{
     				"xx":"xx",
     			}
     			],
     			"Tags":[{
     				"Key":"Name",
     				"Value":"simple demo"
     				}],
     			"UserData":{ "Fn::Base64": { "Fn:Join":["", [
     			   "#!/bin/bash -ex\n",
     			   "yum install -y php php-mysql mysql httpd\n",
     			   "...",
     			   "rm wp-cli.phar\n",
     			   "service httpd start\n"
     			]]

     			}

     			}	
     		}
     	}
     },
     "DBSubnetGroup": {
     	"Type": "AWS::RDS::DBSubnetGroup",
     	"Properties": {
     		"DBSubnetGroupDescription":"DB subnet group",
     		"SubnetIds":{"Ref":"Subnets"}
     	}
     },
     "Database": {
     	"Type":"AWS::RDS::DBInstance",
     	"Properties":{
     		"AllocatedStorage":"5",
     		"xxxx":"xxx"
     		...
     	}
     }
     "WebserverSecurityGroup":{
     	xxx
     },
     "DatabaseSecurityGroup":{
     	xxx
     } 
}
```


////////////////////////////////////////////////////////////////////





////////////////////////////////////////////////////////////////////





////////////////////////////////////////////////////////////////////






