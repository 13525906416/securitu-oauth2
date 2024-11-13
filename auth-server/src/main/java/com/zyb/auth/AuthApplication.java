package com.zyb.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName AuthApplication 认证服务器
 * @Author zhaoyb
 * @Date 2024-10-21
 * @Version 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class AuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(AuthApplication.class, args);
    }
}
