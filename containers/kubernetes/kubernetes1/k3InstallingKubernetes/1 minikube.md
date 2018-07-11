

1 Minikube

2 Google Container Engine(GKE)

3 AWS Provider

4 Manual install

## Minikube

///////////////////////////
VM: minikube    



install minikube on mac
```
brew install kubectl   
kubectl version --client  

brew cask install minikube

brew install docker-machine-driver-xhyve
sudo chown root:wheel /usr/local/opt/docker-machine-driver-xhyve/bin/docker-machine-driver-xhyve
sudo chmod u+s /usr/local/opt/docker-machine-driver-xhyve/bin/docker-machine-driver-xhyve

minikube start --vm-driver=xhyve

kubectl config current-context

kubectl get nodes

minikube dashboard

minikube stop     // stop all the nodes

minikube delete   // delete the local kubernetes cluster
```


//////////

//////////

//////////

//////////

//////////

//////////

//////////



///////////////////////////

//////////

//////////

//////////

//////////

//////////

//////////

//////////