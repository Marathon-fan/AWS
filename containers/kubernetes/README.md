# kubernetes



```
kubectl [command] [TYPE] [NAME] [flags]
```


Resource types are case-insensitive and you can specify the singular, plural, or abbreviated forms. For example, the following commands produce the same output:
```

  $ kubectl get pod pod1
  $ kubectl get pods pod1
  $ kubectl get po pod1
```


To group resources if they are all the same type: TYPE1 name1 name2 name<#>.
Example: 
```
$ kubectl get pod example-pod1 example-pod2
```


To specify resources with one or more files: -f file1 -f file2 -f file<#>
Example: 
```
$ kubectl get pod -f ./pod.yaml
```

```
Operations
The following table includes short descriptions and the general syntax for all of the kubectl operations:

Operation	Syntax	Description

annotate	kubectl annotate (-f FILENAME \| TYPE NAME \| TYPE/NAME) KEY_1=VAL_1 ... KEY_N=VAL_N [--overwrite] [--all] [--resource-version=version] [flags]	Add or update the annotations of one or more resources.

api-versions	kubectl api-versions [flags]	List the API versions that are available.

apply	kubectl apply -f FILENAME [flags]	Apply a configuration change to a resource from a file or stdin.

attach	kubectl attach POD -c CONTAINER [-i] [-t] [flags]	Attach to a running container either to view the output stream or interact with the container (stdin).

autoscale	kubectl autoscale (-f FILENAME \| TYPE NAME \| TYPE/NAME) [--min=MINPODS] --max=MAXPODS [--cpu-percent=CPU] [flags]	Automatically scale the set of pods that are managed by a replication controller.

cluster-info	kubectl cluster-info [flags]	Display endpoint information about the master and services in the cluster.

config	kubectl config SUBCOMMAND [flags]	Modifies kubeconfig files. See the individual subcommands for details.

create	kubectl create -f FILENAME [flags]	Create one or more resources from a file or stdin.

delete	kubectl delete (-f FILENAME \| TYPE [NAME \| /NAME \| -l label \| --all]) [flags]	Delete resources either from a file, stdin, or specifying label selectors, names, resource selectors, or resources.

describe	kubectl describe (-f FILENAME \| TYPE [NAME_PREFIX \| /NAME \| -l label]) [flags]	Display the detailed state of one or more resources.

edit	kubectl edit (-f FILENAME \| TYPE NAME \| TYPE/NAME) [flags]	Edit and update the definition of one or more resources on the server by using the default editor.

exec	kubectl exec POD [-c CONTAINER] [-i] [-t] [flags] [-- COMMAND [args...]]	Execute a command against a container in a pod,

explain	kubectl explain [--include-extended-apis=true] [--recursive=false] [flags]	Get documentation of various resources. For instance pods, nodes, services, etc.

expose	kubectl expose (-f FILENAME \| TYPE NAME \| TYPE/NAME) [--port=port] [--protocol=TCP\|UDP] [--target-port=number-or-name] [--name=name] [----external-ip=external-ip-of-service] [--type=type] [flags]	Expose a replication controller, service, or pod as a new Kubernetes service.

get	kubectl get (-f FILENAME \| TYPE [NAME \| /NAME \| -l label]) [--watch] [--sort-by=FIELD] [[-o \| --output]=OUTPUT_FORMAT] [flags]	List one or more resources.

label	kubectl label (-f FILENAME \| TYPE NAME \| TYPE/NAME) KEY_1=VAL_1 ... KEY_N=VAL_N [--overwrite] [--all] [--resource-version=version] [flags]	Add or update the labels of one or more resources.

logs	kubectl logs POD [-c CONTAINER] [--follow] [flags]	Print the logs for a container in a pod.

patch	kubectl patch (-f FILENAME \| TYPE NAME \| TYPE/NAME) --patch PATCH [flags]	Update one or more fields of a resource by using the strategic merge patch process.

port-forward	kubectl port-forward POD [LOCAL_PORT:]REMOTE_PORT [...[LOCAL_PORT_N:]REMOTE_PORT_N] [flags]	Forward one or more local ports to a pod.

proxy	kubectl proxy [--port=PORT] [--www=static-dir] [--www-prefix=prefix] [--api-prefix=prefix] [flags]	Run a proxy to the Kubernetes API server.

replace	kubectl replace -f FILENAME	Replace a resource from a file or stdin.

rolling-update	kubectl rolling-update OLD_CONTROLLER_NAME ([NEW_CONTROLLER_NAME] --image=NEW_CONTAINER_IMAGE \| -f NEW_CONTROLLER_SPEC) [flags]	Perform a rolling update by gradually replacing the specified replication controller and its pods.

run	kubectl run NAME --image=image [--env="key=value"] [--port=port] [--replicas=replicas] [--dry-run=bool] [--overrides=inline-json] [flags]	Run a specified image on the cluster.

scale	kubectl scale (-f FILENAME \| TYPE NAME \| TYPE/NAME) --replicas=COUNT [--resource-version=version] [--current-replicas=count] [flags]	Update the size of the specified replication controller.

stop	kubectl stop	Deprecated: Instead, see kubectl delete.

version	kubectl version [--client] [flags]	Display the Kubernetes version running on the client and server.
```


Resource types
The following table includes a list of all the supported resource types and their abbreviated aliases:
```

Resource type	Abbreviated alias
apiservices	
certificatesigningrequests	csr
clusters	
clusterrolebindings	
clusterroles	
componentstatuses	cs
configmaps	cm
controllerrevisions	
cronjobs	
customresourcedefinition	crd
daemonsets	ds
deployments	deploy
endpoints	ep
events	ev
horizontalpodautoscalers	hpa
ingresses	ing
jobs	
limitranges	limits
namespaces	ns
networkpolicies	netpol
nodes	no
persistentvolumeclaims	pvc
persistentvolumes	pv
poddisruptionbudget	pdb
podpreset	
pods	po
podsecuritypolicies	psp
podtemplates	
replicasets	rs
replicationcontrollers	rc
resourcequotas	quota
rolebindings	
roles	
secrets	
serviceaccounts	sa
services	svc
statefulsets	
storageclasses	
```

kubectl get - List one or more resources.
```

// List all pods in plain-text output format.
$ kubectl get pods

// List all pods in plain-text output format and includes additional information (such as node name).
$ kubectl get pods -o wide

// List the replication controller with the specified name in plain-text output format. Tip: You can shorten and replace the 'replicationcontroller' resource type with the alias 'rc'.
$ kubectl get replicationcontroller <rc-name>

// List all replication controllers and services together in plain-text output format.
$ kubectl get rc,services

// List all daemon sets, including uninitialized ones, in plain-text output format.
$ kubectl get ds --include-uninitialized

// List all pods running on node server01
$ kubectl get pods --field-selector=spec.nodeName=server01

// List all pods in plain-text output format, delegating the details of printing to the server
$ kubectl get pods --experimental-server-print
```


