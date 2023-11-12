# Hazelcast

See git history every commit represent different architectural patterns in k8s

---
## Build & Run
```bash
minikube start && minikube addons enable metrics-server
```

```bash
skaffold dev
```

---
## Test your setup
```bash
curl --request PUT 'http://localhost:8080/cache/key1/valueA'
```
```bash
curl --request GET 'http://localhost:8080/cache/key1'
```
