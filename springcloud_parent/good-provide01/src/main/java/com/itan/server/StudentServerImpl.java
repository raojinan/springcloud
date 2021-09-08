package com.itan.server;

import com.itan.domain.Student;
import com.itan.entity.StatusCode;
import com.itan.exception.MyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author raojinan
 * @version 1.0
 * @date 2021/9/5 22:21
 */
@Service
public class StudentServerImpl implements StudentServer {

    @Autowired
    private com.itan.dao.StudentDao02 StudentDao02;

    public Student findById(int id) {
        Optional<Student> optionalStudent = StudentDao02.findById(id);
        if (optionalStudent.isPresent()) {

            return optionalStudent.get();

        }

        throw new MyException(StatusCode.ERROR, "查询不到学生信息", "StudentDao02.findById");

    }
}
