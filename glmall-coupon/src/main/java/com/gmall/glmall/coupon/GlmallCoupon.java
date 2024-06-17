package com.gmall.glmall.coupon;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.gmall.glmall.coupon.dao")
@EnableDiscoveryClient
public class GlmallCoupon {
    public static void main(String[] args) {
        SpringApplication.run(GlmallCoupon.class,args);
    }
}