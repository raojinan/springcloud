package com.itan.server;


import com.itan.domain.Student;
import com.itan.entity.Result;

/**
 * @author raojinan
 * @version 1.0
 * @date 2021/9/6 9:18
 */
public interface StudentServer {
    public Student findById(int id);
}
