package com.qwx.front;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages={"com.qwx.**.feign"})
public class FrontApplication {

    public static void main(String[] args) {
        SpringApplication.run(FrontApplication.class);
    }
}
