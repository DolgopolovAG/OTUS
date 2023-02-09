kubectl create namespace my
kubectl config set-context --current --namespace=my

kubectl apply -f postgres-pv.yml 
kubectl apply -f postgres-pvc.yml

helm repo add ingress-nginx https://kubernetes.github.io/ingress-nginx
helm repo add bitnami https://charts.bitnami.com/bitnami 
helm repo update
helm install psql bitnami/postgresql -n my --set persistence.existingClaim=postgres-pvc --set volumePermissions.enabled=true --set auth.username=user_pg --set auth.password=pass_pg --set auth.database=user_db 

kubectl apply -f secret.yml 
kubectl apply -f config-map.yml 
kubectl apply -f deployment.yml 
kubectl apply -f service.yml 
kubectl apply -f ingress.yml 

