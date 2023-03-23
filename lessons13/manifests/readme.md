---Установка istio
kubectl create namespace istio-system  

helm repo add istio https://istio-release.storage.googleapis.com/charts  
helm repo update  

helm install istio-base istio/base -n istio-system  
helm install istiod istio/istiod -n istio-system --wait  
kubectl apply -f https://raw.githubusercontent.com/istio/istio/release-1.13/samples/addons/kiali.yaml  
kubectl edit svc kiali -n istio-system (заменить в файле ClusterIP => NodePort)  
kubectl apply -f https://raw.githubusercontent.com/istio/istio/release-1.13/samples/addons/prometheus.yaml  
kubectl apply -f gateway.yml  -n istio-system  


---Установка 
kubectl create namespace my  
kubectl config set-context --current --namespace=my  

kubectl apply -f deployment-v1.yml  
kubectl apply -f deployment-v2.yml  
kubectl apply -f service-v1.yml  
kubectl apply -f service-v2.yml  
kubectl apply -f vs.yml  

kubectl label namespace my istio-injection=enabled --overwrite  