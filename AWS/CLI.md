
## s3  
```sh

# list files  
aws s3 ls s3://<bucketName>
aws s3 ls s3://aes1-first-version

# download files from s3
aws s3 cp s3://<objectAddr> <localMachineAddr>
sudo aws s3 cp s3://aes1-first-version/aceedustation.war /aes1/tomcat/

# upload files to s3
aws s3 cp <localMachineAddr> s3://<objectAddr>
aws s3 cp /home/bitnami/test.txt s3://aes1-first-version 
```

