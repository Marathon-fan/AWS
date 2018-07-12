

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

curl -LO https://storage.googleapis.com/minikube/releases/latest/docker-machine-driver-hyperkit \
&& chmod +x docker-machine-driver-hyperkit \
&& sudo mv docker-machine-driver-hyperkit /usr/local/bin/ \
&& sudo chown root:wheel /usr/local/bin/docker-machine-driver-hyperkit \
&& sudo chmod u+s /usr/local/bin/docker-machine-driver-hyperkit

sudo rm -rf $HOME/.minikube

minikube start --logtostderr --v=3 --vm-driver=hyperkit

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