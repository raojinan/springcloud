package com.itan.controller;


import com.itan.domain.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static java.lang.Thread.sleep;

/**
 * @author raojinan
 * @version 1.0
 * @date 2021/9/5 22:18
 */
@RestController
@RequestMapping("/provide")
public class Provide02RibbonController {

    @GetMapping("/find")
    public Student find(@PathVariable(value = "id") int id) throws InterruptedException {
        //Thread.sleep(20000);
        Student student = new Student();
        student.setSex("男");
        student.setScore(88.0);
        student.setName("刘伯明木木木");
        student.setAge(88);
        student.setSid(88);
        return student;
    }
}
