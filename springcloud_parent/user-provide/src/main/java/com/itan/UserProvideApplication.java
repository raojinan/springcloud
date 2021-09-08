package com.itan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author raojinan
 * @version 1.0
 * @date 2021/7/9 11:33
 */
@SpringBootApplication
@EnableEurekaClient
public class UserProvideApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserProvideApplication.class,args);
    }
}
