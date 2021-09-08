package com.itan.config;


import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author raojinan
 * @version 1.0
 * @date 2021/7/11 10:37
 */
@Configuration
public class RabbitMQConfig {
    /**
     * 声明交换机
     * 通配符模式交换机
     * item_topic_exchange:才是虚拟主机中交换机的名字
     *
     * @return
     */
    @Bean("itemTopicExchange")
    public Exchange topicExchange() {
        return ExchangeBuilder.topicExchange("item_topic_Exchange").durable(true).build();
    }
    /**
     * 声明队列
     */
    @Bean(name = "itemTopicQueue")
    public Queue itemQueue() {
        return QueueBuilder.durable("item_topic_queue").build();

    }
    /**
     * 队列绑定在交换机上
     * 通配符模式的交换机
     */
    @Bean
    public Binding itemBinding(@Qualifier("itemTopicQueue") Queue queue, @Qualifier("itemTopicExchange") Exchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with("topic.#").noargs();

    }




    /**
     * 路由模式交换机
     *
     * @return
     */
    @Bean(name = "itemRoutingExchange")
    public Exchange routingExchange() {
        return ExchangeBuilder.directExchange("item_routing_Exchange").durable(true).build();
    }
    /**
     * 声明队列
     *
     * @return
     */
    @Bean(name = "itemDirectQueue")
    public Queue itemQueue1() {
        return QueueBuilder.durable("item_direct_queue").build();

    }
    /**
     * 队列绑定路由key交换机
     *
     * @param queue
     * @param exchange
     * @return
     */
    @Bean
    public Binding itemBinding1(@Qualifier("itemDirectQueue") Queue queue, @Qualifier("itemRoutingExchange") Exchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with("directKey").noargs();

    }


}
