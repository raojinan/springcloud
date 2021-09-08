package com.itan.controller;


import com.itan.domain.Student;
import com.itan.entity.Result;
import com.itan.entity.StatusCode;
import com.itan.server.StudentServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author raojinan
 * @version 1.0
 * @date 2021/9/5 22:18
 */
@RestController
@RequestMapping("/provide")
public class ProvideRibbonController {
    @Autowired
    private StudentServer studentServer;

    @GetMapping("/find/{id}")
    public Result find(@PathVariable(value = "id") int id) {
        return new Result(true, StatusCode.OK, "查询成功", studentServer.findById(id));
    }

}
