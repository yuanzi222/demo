package com.yuanzi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
//@EnableDiscoveryClient
//@EnableFeignClients
//@EnableCircuitBreaker
@RestController
public class MainApplication {
	
    public static void main(String[] args) {
    	SpringApplication.run(MainApplication.class, args);
    }
    
    @RequestMapping("/")
    public String index(){
    	return "hello world!";
    }
    
}
