package com.itan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author raojinan
 * @version 1.0
 * @date 2021/7/8 17:51
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)//不想连接数据库
@EnableEurekaServer //开启Eureka服务
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);

    }
}
