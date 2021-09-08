package com.itan.domain;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.mapping.PrimaryKey;

import javax.persistence.*;

/**
 * @author raojinan
 * @version 1.0
 * @date 2021/8/30 22:53
 */
@Setter
@Getter
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sid")
    private int sid;

    @Column(name = "sname")
    private String name;

    @Column(name = "sex")
    private String sex;

    @Column(name = "age")
    private int age;

    @Column(name = "score")
    private double score;


    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
