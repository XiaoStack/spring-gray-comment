package com.example.springgraycomment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.springgraycomment.*")
@EnableDiscoveryClient
public class SpringGrayCommentApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringGrayCommentApplication.class, args);
    }
}
