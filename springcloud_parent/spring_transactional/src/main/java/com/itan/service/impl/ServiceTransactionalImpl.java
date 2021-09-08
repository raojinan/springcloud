package com.itan.service.impl;

import com.itan.dao.StudentDao;
import com.itan.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * @author raojinan
 * @version 1.0
 * @date 2021/8/30 21:59
 */
@Service
public class ServiceTransactionalImpl implements ServiceTransactional {
    @Autowired
    private StudentDao studentDao;

    //直接开启事务
    //事务的传播行为，默认值为 Propagation.REQUIRED 如果当前存在事务，则加入该事务，如果当前不存在事务，则创建一个新的事务
    @Transactional(propagation = Propagation.REQUIRED)
    public Student save() {
        Student student = new Student();
        student.setAge(1);
        student.setName("胡歌5");
        student.setScore(9.99);
        student.setSex("男");
        Student student1 = null;
        try {
            student1 = studentDao.save(student);
            studentDao.deleteById(7);//
            Student student2 = this.save2();
            System.out.println(student2);
        } catch (Exception e) {
            System.out.println("回滚了save1");
        }
        return student1;
    }

    @Override
    public Student findById() {
        return null;
    }

    @Transactional
    public Student save2() {
        Student student = new Student();
        student.setAge(18);
        student.setName("刘诗诗1");
        student.setScore(10.11);
        student.setSex("女");
        Student student1 = null;
        try {
            student1 = studentDao.save(student);
            studentDao.deleteById(7);
        } catch (Exception e) {
            System.out.println("回滚了save2");
        }
        return student1;
    }


}
