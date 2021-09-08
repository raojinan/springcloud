package com.itan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author raojinan
 * @version 1.0
 * @date 2021/8/30 22:00
 */
@SpringBootApplication
@EnableEurekaClient
public class TransactionalApplication {
    public static void main(String[] args) {
        SpringApplication.run(TransactionalApplication.class,args);
    }
}
