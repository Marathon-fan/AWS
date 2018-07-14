

# kops - Kubernetes operations

///////////////////////////

## pre-requisite  

install the following on the local machine
```
1 kubectl, 

2 kops, 

3 AWS CLI  
```

2 IAM account in AWS with:   
```
1) AmazonEC2FullAccess   
2) AmazonRoute53FullAccess  
3) AmazonS3FullAccess  
4) IAMFullAccess    
5) AmazonVPCFullAccess   

$> aws configure
then input AWS Access Key Id and Secret Access Key

create a s3 bucket for the project
$> aws s3 mb s3://cluster1.clusterName.xx.com
$> aws s3 ls | grep k8s    // check if the bucket is there

$> export KOPS_STATE_STORE=s3://cluster1.clusterName.xx.com

if using linux, then use the following cmd to copy aws credentials to a directory
$> cp /home/ubuntu/.ssh/authorized_keys ~/.ssh/id_rsa.pub

now we create a cluster
$> kops create cluster \   
> --cloud=aws --zones=eu-west-1b \
> --dns-zone=clusterName.xx.com \
> --name=cluster1.clusterName.xx.com  --yes    // if we don't specify "yes" here, we will need to use another cmd to create the cluster   

the all the resources are created

$> kops validate cluster   // to list all the nodes   
$> kubectl get node        // may get the info as "kops validate cluster"

$> kops delete cluster --name=cluster1.clusterName.xx.com  --yes    // delete the cluster
```



Properly configured DNS  
(for the real world)  



//////////

//////////

//////////

//////////

//////////

//////////

//////////



///////////////////////////
https://github.com/kubernetes/kops

kops - Kubernetes Operations

The easiest way to get a production grade Kubernetes cluster up and running.
What is kops?
We like to think of it as kubectl for clusters.
kops helps you create, destroy, upgrade and maintain production-grade, highly available, Kubernetes clusters from the command line. AWS (Amazon Web Services) is currently officially supported, with GCE in beta support , and VMware vSphere in alpha, and other platforms planned.
//////////

//////////

//////////

//////////

//////////

//////////

//////////