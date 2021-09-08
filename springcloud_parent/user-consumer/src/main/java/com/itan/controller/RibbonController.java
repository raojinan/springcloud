package com.itan.controller;


import com.itan.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author raojinan
 * @version 1.0
 * @date 2021/9/5 21:49
 * 负载均衡器
 */
@RestController
@RequestMapping("/ribbon")
public class RibbonController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/find")
    public Student find() {
        //restTemplate 会根据url=http://服务名+/控制器地址（controller）+/方法地址 来获取ip地址和相应的方法
        String url = "http://good-provide" + "/provide/find";
        return restTemplate.getForObject(url, Student.class);

    }

}
