package com.gmall.glmall.ware;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.gmall.glmall.ware.dao")
public class GlmallWare {
    public static void main(String[] args) {
        SpringApplication.run(GlmallWare.class,args);
    }
}