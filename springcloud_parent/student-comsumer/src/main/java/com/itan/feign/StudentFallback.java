package com.itan.feign;

import com.itan.pojo.Student;
import org.springframework.stereotype.Component;

/**
 * @author raojinan
 * @version 1.0
 * @date 2021/9/7 15:38
 */
@Component
public class StudentFallback implements StudentFeign {
    @Override
    public Student find(int id) {

        Student student = new Student();
        student.setName("服务降级");
        return student;
    }
}
