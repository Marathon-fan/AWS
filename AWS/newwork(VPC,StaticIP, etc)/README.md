# AWS

## VPC Peering.

http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/vpc-peering.html
```
A VPC peering connection is a networking connection between two VPCs that enables you to route traffic between them using private IPv4 addresses or IPv6 addresses. Instances in either VPC can communicate with each other as if they are within the same network. You can create a VPC peering connection between your own VPCs, or with a VPC in another AWS account. In both cases, the VPCs must be in the same region.
```

## Private IP
Private IP addresses allow you to communicate securely with other internal resources.

## private IP address and a public IP address static IP for lightsail      
Each Lightsail instance automatically gets a private IP address and a public IP address, which are reachable from the Internet. You can use the private IP to send data to other Lightsail instances and AWS resources in private, for free. **You can also substitute as static IP for the public IP of a Lightsail instance.**


Once an EC2 instance is launched, it's assigned a private IP address at boot time. **An instance's private IP address will never change during the lifetime of that instance.** As per AWS, when an instance is launched in EC2-Classic, it is automatically assigned a public IP address to the instance from the EC2-Classic public IPv4 address pool. This behavior cannot be modified. When an instance is launched in a VPC, you control whether it receives a public IP or not. **The public IP address can change under certain circumstances.**

Note: Public and private DNS names are constructed based upon an instance's public and private IP addresses. So, if an instance's public IP address changes, the public DNS name will also change accordingly.

## What is a static IP?

A static IP is a fixed, public IP that is dedicated to your Lightsail account. You can assign a static IP to an instance, replacing its public IP. If you decide to replace your instance with another one, you can reassign the static IP to the new instance. In this way, you don't have to reconfigure any external systems (like DNS records) to point to a new IP every time you want to replace your instance.


## Port 443 and Port 80

Port 443/HTTPS is the HTTP protocol over TLS/SSL.  Port 80/HTTP is the World Wide Web. 

