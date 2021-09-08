package com.itan.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.DiscoveryClient;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author raojinan
 * @version 1.0
 * @date 2021/9/5 10:08
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private EurekaClient eurekaClient;
  /*  @Autowired
    private DiscoveryClient discoveryClient;*/

/*
    @GetMapping("/find")
    public void find() {
        List<InstanceInfo> transactional = discoveryClient.getInstancesById("transactional");
        try {
            InstanceInfo instanceInfo = transactional.get(0);
            String hostName = instanceInfo.getHostName();
            System.out.println(hostName);
        } catch (Exception e) {
            throw new RuntimeException("没找到");

        }

    }
*/

    @GetMapping("/find02")
    public void find02() {
        List<InstanceInfo> transactional = eurekaClient.getInstancesById("user-consumer");
        try {
            InstanceInfo instanceInfo = transactional.get(0);
            String hostName = instanceInfo.getHostName();
            System.out.println(hostName);
        } catch (Exception e) {
            throw new RuntimeException("没找到");

        }

    }


}
