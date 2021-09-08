package com.itan.controller;

import com.itan.feign.StudentFeign;
import com.itan.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author raojinan
 * @version 1.0
 * @date 2021/9/7 10:54
 */
@RestController
@RequestMapping("/studentFeign")
public class StudentController {
    //注入服务提供者的远程接口feign
    @Autowired
    private StudentFeign studentFeign;
    @GetMapping("/find")
    public Student find(@PathVariable(value = "id")int id) {
        return studentFeign.find(id);
    }

}
