### pox配置
```xml
<dependencies>
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter</artifactId>
</dependency>

<!--引入eureka-->
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
    <version>2.2.1.RELEASE</version>
</dependency>
</dependencies>


<!--eureka需要引入org.springframework.cloud-->
<dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>org.springframework.cloud</groupId>
                <artifactId>spring-cloud-dependencies</artifactId>
                <version>Hoxton.SR1</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
        </dependencies>
    </dependencyManagement>
```

### 配置说明
```properties
spring.application.name=spring-server-1
server.port=9013
eureka.server.port=8888
eureka.client.serviceUrl.defaultZone=http://localhost:${eureka.server.port}/eureka/
```

### 增加注解 @EnableEurekaServer