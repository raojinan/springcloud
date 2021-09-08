package com.itan.controller;

import com.itan.domain.Student;
import com.itan.service.impl.ServiceTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author raojinan
 * @version 1.0
 * @date 2021/8/31 17:04
 */
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private ServiceTransactional serviceTransactional;

    @GetMapping("/save")
    public void save() {
        try {
            Student save = serviceTransactional.save();
        } catch (Exception e) {
            System.out.println("回滚了saveController");
        }
    }

    @GetMapping("/save2")
    public void save2() {
        try {
            Student save = serviceTransactional.save2();
        } catch (Exception e) {
            System.out.println("回滚了save2");
        }
    }



}
