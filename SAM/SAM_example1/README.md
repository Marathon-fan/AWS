# AWS SAM(Serverless Application Model )

## 1 install SAM(AWS Serverless Application Model )  and docker   

1) install SAM(mac version)      
(1) download SAM from the following addr and unpack it:   
https://github.com/awslabs/aws-sam-local/releases/download/v0.2.11/sam_0.2.11_darwin_386.tar.gz   
(2) $> sudo vi ~/.bash_profile   
then add SAM address to PATH  
(3) $> source ~/.bash_profile   

2) install docker   

## 2 write lambda function and SAM file(template.yaml)   

For the sake of demo, we can use dir/products.js, dir/template.yaml in this link:  
https://docs.aws.amazon.com/lambda/latest/dg/test-sam-local.html   

## 3 test the serverless function locally   
1) $> sam local start-api    

2) $> curl http://localhost:3000/products   

3) $> curl -XDELETE http://localhost:3000/products/1  


