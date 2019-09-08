package com.zq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author ZQ
 * @create 2019-09-06
 */
@SpringBootApplication
public class RestTemplateApplication {
    public static void main(String[] args){
        SpringApplication.run(RestTemplateApplication.class,args);
    }
//    向ioc中注入
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
