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

## Links

[![Hazelcast IMDG Architectural Patterns in Kubernetes](https://img.youtube.com/vi/MryTRkm4U3w/0.jpg)](https://www.youtube.com/watch?v=MryTRkm4U3w)

- [Demo YouTube](https://www.youtube.com/watch?v=MryTRkm4U3w)
- [Demo Code Samples](https://github.com/bitxon/demo-hazelcast-imdg)
