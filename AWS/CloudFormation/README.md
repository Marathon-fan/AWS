# AWS CloudFormation  

AWS CloudFormation provides a common language for you to describe and provision all the infrastructure resources in your cloud environment. CloudFormation allows you to use a simple text file to model and provision, in an automated and secure manner, all the resources needed for your applications across all regions and accounts. This file serves as the single source of truth for your cloud environment. 

AWS CloudFormation is available at no additional charge, and you pay only for the AWS resources needed to run your applications.

////////////////////////////////////////////
The main things you need to keep in mind when building a template are

1 A CloudFormation template is a JSON-formatted text file that describes your AWS infrastructure.  

Templates can include several major sections:        
– AWSTemplateFormatVersion        
– Description       
– Metadata     
– Parameters     
– Mappings     
– Conditions     
– Resources     
– Outputs     
The Resources section is the only section that is actually required.     
The first character in the CloudFormation template must be an open brace ({), and the last character must be a closed brace (}).     

