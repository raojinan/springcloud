package com.itan.dao;

import com.itan.UserProvideApplication;
import com.itan.domain.Customer;
import com.sun.javafx.scene.control.behavior.SpinnerBehavior;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 单元测试
 *
 * @author raojinan
 * @version 1.0
 * @date 2021/8/11 16:18
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {UserProvideApplication.class})
public class CustomerDaoTest extends TestCase {
    @Autowired
    private CustomerDao customerDao;


    @Test
    public void query() {
        String id = "069c9f1d79014703875bb78dca6aa012";
        Customer customer = customerDao.queryById(id);
        System.out.println(customer);
    }

    @Test
    public void test02() {
        System.out.println(customerDao.findCustomerById("5059024a733747f89e5bd303cf8aadd0"));

    }
    @Test
    public void test03(){
        System.out.println(customerDao.findById("fcf4e67e93db431882ab3926f2a1807f"));

    }

}