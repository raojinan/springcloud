package com.itan.listen;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author raojinan
 * @version 1.0
 * @date 2021/7/11 11:36
 */
@Component
public class MessageListener {
    /**
     * 监听绑定路由交换机的队列
     */
    @RabbitListener(queues = "item_direct_queue")
    public void  myDirectListen(String message){
        System.out.println("监听到消息是:"+message);
    }

    /**
     * 监听绑定通配符交换机的队列
     * @param message
     */
  @RabbitListener(queues = "item_topic_queue")
    public void  myTopicListen(String message){
        System.out.println("监听到消息是:"+message);
    }
}
