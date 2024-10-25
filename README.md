#### jenkins 共享库
这个项目主要用于k8s中的jenkins构建

##### 依赖插件
- pipeline
- Kubernetes CLI
- Git Parameter

#### 创建configmap、volume、serviceAccount
```shell
kubectl create -n kube-ops     # 创建jenkins专用命名空间
kubectl apply -f resource/config/serviceAccount.yaml -f resource/config/configmap.yaml -f resource/config/volume.yaml
```
- configmap 主要是配置docker相关的配置
- volume 配置jenkins_home目录
- serviceAccount jenkins运行时候的账号

#### 配置gitlab、harbor、k8s认账使用的配置(Credentials)
- gitlab、harbr使用username/password类型
- k8s 需要使用Secret text, 里面写token，token通过 `kubectl  describe Secret -n kube-ops jenkins`获取

#### 然后配置jenkins
##### 添加kubernetes
![k8s.png](images/k8s.png)
![k8s2.png](images/k8s2.png)

##### 共享库配置
![gitlab.png](images/gitlab.png)
![gitlab2.png](images/gitlab2.png)

