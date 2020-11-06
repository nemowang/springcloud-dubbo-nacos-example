# springcloud-dubbo-nacos-example
 SpringCloud Alibaba Dubbo Nacos.<br> 
 Spring Cloud Alibaba融合Dubbo-Nacos示例
 
 
## 项目结构
* **api** 服务接口定义层(interface)。只定义接口，不实现具体业务。<br>
* **provider** 服务接口实现层。实现接口所要实现的业务逻辑，包含与sql、NoSql、消息队列等外部系统的交互。<br>
* **consumer** 服务消费层。接收HTTP请求获取请求报文(Controller)，调用api层定义的服务接口得到处理结果，并包装成返回报文返回出去。