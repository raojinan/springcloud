package com.itan.dao;

import com.itan.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author raojinan
 * @version 1.0
 * @date 2021/8/30 23:04
 */
public interface StudentDao extends JpaRepository<Student, Integer> {
    Student save(Student s);

    @Override
    Optional<Student> findById(Integer integer);

    @Override
    void deleteById(Integer integer);
}
