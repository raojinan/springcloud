package com.itan.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author raojinan
 * @version 1.0
 * @date 2021/7/11 16:25
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitMQTest {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    public void producerPushMsg() {
        rabbitTemplate.convertAndSend("item_routing_Exchange", "directKey", "测试路由模式交换机，路由key为directKey的队列");
        rabbitTemplate.convertAndSend("item_topic_Exchange", "topic.add", "测试通配符模式交换机，队列路由key为topic.#,消息的路由key为item.add");
        rabbitTemplate.convertAndSend("item_topic_Exchange", "topic.delete", "测试通配符模式交换机，队列路由key为topic.#,消息的路由key为item.delete");
        rabbitTemplate.convertAndSend("item_topic_Exchange", "topic.insert", "测试通配符模式交换机，队列路由key为topic.#,消息的路由key为item.insert");

    }
}
