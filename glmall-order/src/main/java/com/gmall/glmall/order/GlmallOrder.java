package com.gmall.glmall.order;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.gmall.glmall.order.dao")
@EnableDiscoveryClient
public class GlmallOrder {
    public static void main(String[] args) {
        SpringApplication.run(GlmallOrder.class,args);
    }
}