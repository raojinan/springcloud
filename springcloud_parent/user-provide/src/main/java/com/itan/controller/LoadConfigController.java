package com.itan.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author raojinan
 * @version 1.0
 * @date 2021/7/10 10:36
 */
@RestController //可以返回json格式数据
@RefreshScope
@RequestMapping("/config") //指定这个控制器处理什么url请求
public class LoadConfigController {
   /* @Value("${config.message}")*/
    private String msg;

    @GetMapping("/load")
    public String getMsg() {
        return msg;
    }


}
