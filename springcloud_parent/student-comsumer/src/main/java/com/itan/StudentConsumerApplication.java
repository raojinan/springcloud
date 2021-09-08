package com.itan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author raojinan
 * @version 1.0
 * @date 2021/9/7 10:41
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableEurekaClient
@EnableFeignClients  //开启feign
public class StudentConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentConsumerApplication.class, args);
    }
}
