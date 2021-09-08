package com.itan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author raojinan
 * @version 1.0
 * @date 2021/9/5 17:27
 */
@SpringBootApplication
@EnableEurekaClient
public class GoodProvideApplication {
    public static void main(String[] args) {
        SpringApplication.run(GoodProvideApplication.class,args);
    }
}
