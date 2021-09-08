package com.itan.service.impl;

import com.itan.domain.Student;

/**
 * @author raojinan
 * @version 1.0
 * @date 2021/8/31 17:13
 */
public interface ServiceTransactional {

    public Student save();

    public Student findById();

    public Student save2();
}
