package com.itan.dao;

import com.itan.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @author raojinan
 * @version 1.0
 * @date 2021/8/11 11:56
 */
//操作的对象和主键的类型
public interface CustomerDao extends JpaRepository<Customer,Integer>{
    //自定义原生sql
    @Query(value = "select * from customer where id =?",nativeQuery = true)
    Customer queryById(String id);
    //方法
    Customer findCustomerById(String id);

    @Query(value = "select * from customer where id = ?",nativeQuery = true)
    Customer findById(String uid);

}





