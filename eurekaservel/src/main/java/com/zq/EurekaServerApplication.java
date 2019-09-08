package com.zq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ZQ
 * @create 2019-09-06
 * 启动后 访问 http://localhost:8761/
 */
@SpringBootApplication
@EnableEurekaServer//声明 这是一个注册中心
public class EurekaServerApplication {
    public static void main(String[] args){
        SpringApplication.run(EurekaServerApplication.class,args);
    }
}
