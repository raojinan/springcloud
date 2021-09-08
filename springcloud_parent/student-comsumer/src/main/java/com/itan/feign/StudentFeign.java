package com.itan.feign;

import com.itan.pojo.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author raojinan
 * @version 1.0
 * @date 2021/9/7 10:49
 */
@FeignClient(value = "good-provide",fallback = StudentFallback.class) //服务名字
public interface StudentFeign {
    @RequestMapping("/provide/find/{id}")//从控制器开始的路径
    public Student find(int id);

}
