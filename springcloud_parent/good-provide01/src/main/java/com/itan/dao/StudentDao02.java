package com.itan.dao;

import com.itan.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author raojinan
 * @version 1.0
 * @date 2021/9/6 10:12
 */
public interface StudentDao02  extends JpaRepository<Student, Integer> {

    @Override
    Optional<Student> findById(Integer integer);
}
