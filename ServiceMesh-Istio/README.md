# Istio

Istio is an open source framework for that provides a service mesh for microservices. It provides 

- ![#f03c15](https://placehold.it/15/f03c15/000000?text=+) `request routing`
- ![#f03c15](https://placehold.it/15/f03c15/000000?text=+) `load balancing `
- ![#f03c15](https://placehold.it/15/f03c15/000000?text=+) `service-to-service authentication`
- ![#f03c15](https://placehold.it/15/f03c15/000000?text=+) `failture management`
- ![#f03c15](https://placehold.it/15/f03c15/000000?text=+) `fault injection`
- ![#f03c15](https://placehold.it/15/f03c15/000000?text=+) `circuit breaking`


///////////////////////////////////////
Agenda 

# Microservices, Kubernetes and Istio   
## Microservices   
## Kubernetes   
## Istio   
### Service Mesh   
### Mutual TLS(security)     
### Routing  
### Tracing/Metrics   
### Fault Injection   
## Lab - Get Kubenetes, Istio, Launch an App   
## Lab - Routing  


Microservices are small nuggets of function, and that sounds like it could be simple, but as complexity grows, successful operations require:
```
Visibility(Observability)
    Monitoring
    Metrics
    Tracing
Traffic management
Policy Enforcement
Security
Resilience and efficiency   
```
**A service mesh(an application network for services) can provide the above.**


Kubernetes Architecture  
![KubernetesArchitecture](./pics/KubernetesArchitecture.png)


///////////////////////////////////////

Istio does not require any change to your application code. Istio deploys a special sidecar proxy to each of your application's Pods. 


This proxy, based on the popular, open source Envoy,  intercepts communication between microservices and is configured and managed using Istio's control plane functionality.




