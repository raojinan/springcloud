package com.itan.controller;

import com.itan.pojo.Student;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author raojinan
 * @version 1.0
 * @date 2021/9/6 16:30
 * 服务消费者配置熔断器
 */
@RestController
@RequestMapping("/hystrix")
public class HystrixController {


    @Autowired
    RestTemplate restTemplate;

    /**
     * 局部熔断是在方法上添加降级处理调用
     *
     * @return
     */
    @HystrixCommand(fallbackMethod = "failBack")
    @GetMapping("/find")
    public Student find(Integer id) {
        //restTemplate 会根据url=http://服务名+/控制器地址（controller）+/方法地址 来获取ip地址和相应的方法
        String url = "http://good-provide" + "/provide/find";
        return restTemplate.getForObject(url, Student.class);
    }

    /**
     * 服务降级方法
     *
     * @return
     */
    public Student failBack(Integer id) {
        Student student = new Student();
        student.setName("服务降级,默认处理！");
        return student;
    }
}
