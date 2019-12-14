package com.qwx.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.qwx.**"})
//@MapperScan("com.witc.base.dao.**")
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.qwx.**.feign.**"})
public class BaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseApplication.class);
    }
}
