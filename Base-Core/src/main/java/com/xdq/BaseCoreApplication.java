package com.xdq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Auther Dongqiang
 * @Date 2017/10/19 14:29
 */
@SpringBootApplication
@EnableDiscoveryClient
public class BaseCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseCoreApplication.class, args);
    }
}
