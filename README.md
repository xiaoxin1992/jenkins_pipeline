#### jenkins 共享库
这个项目主要用于k8s中的jenkins构建

##### 依赖插件
- pipeline
- Kubernetes CLI
- Git Parameter

#### 创建configmap、volume、serviceAccount
```shell
kubectl apply -f resource/config/serviceAccount.yaml -f resource/config/configmap.yaml -f resource/config/volume.yaml
```
- configmap 主要是配置docker相关的配置
- volume 配置jenkins_home目录
- serviceAccount jenkins运行时候的账号

#### 然后配置jenkins
##### 添加kubernetes
![k8s.png](images/k8s.png)
![k8s2.png](images/k8s2.png)

##### 共享库配置
![gitlab.png](images/gitlab.png)
![gitlab2.png](images/gitlab2.png)

