package com.itan.service.impl;

import com.itan.TransactionalApplication;
import com.itan.dao.StudentDao;
import com.itan.domain.Student;
import junit.framework.TestCase;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

/**
 * @author raojinan
 * @version 1.0
 * @date 2021/8/30 23:14
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {TransactionalApplication.class})
@Ignore
public class ServiceTransactionalImplTest extends TestCase {
    @Autowired
    StudentDao studentDao;
    @Test
    public void testSave() {
        Student student = new Student();
        student.setAge(1);
        student.setName("王菲");
        student.setScore(9.99);
        student.setSex("男");
        Student student1 = studentDao.save(student);
        studentDao.deleteById(2);

    }

    @Test
    public void testFindById() {
        Optional<Student> student = studentDao.findById(2);
        System.out.println(student);

    }

}