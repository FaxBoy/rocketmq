package com.mouse.rocketmq.jms;

import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.springframework.stereotype.Component;

/**
 * @author shil <sl166199@163.com>
 * @version v1.0
 * @ClassName PayProducer
 * @Description TODO
 * @date 2019/4/2 13:43
 */

@Component
public class PayProducer {

    //producer group name.
    private String producerGroup = "pay_producer_group";

    // Specify name server addresses.
    private String nameServerAddr = "localhost:9876";

    private DefaultMQProducer producer;

    public PayProducer(){
        //Instantiate with a producer group name.
        producer = new DefaultMQProducer(producerGroup);
        producer.setNamesrvAddr(nameServerAddr);
        start();
    }

    public DefaultMQProducer getProducer() {
        return producer;
    }

    /**
     * 对象在使用之前必须要调用一次，只能初始化一次
     */
    public void start(){
        try {
            this.producer.start();
        } catch (MQClientException e) {
            e.printStackTrace();
        }
    }

    /**
     * 一般在应用上下文，使用上下文监听器，进行关闭
     */
    public void shutdown(){
        this.producer.shutdown();
    }

}
