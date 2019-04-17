package com.mouse.rocketmq.controller;

import com.mouse.rocketmq.jms.PayProducer;
import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendCallback;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author shil <sl166199@163.com>
 * @version v1.0
 * @ClassName PayController
 * @Description TODO
 * @date 2019/4/2 13:48
 */

@RestController
public class PayController {

    /**使用RocketMq的生产者*/
    @Autowired
    private DefaultMQProducer defaultMQProducer;

    private static  final String topic = "TopicTest";

    @RequestMapping("/api/v1/pay")
    public Object callback(String text) throws InterruptedException, RemotingException, MQClientException, MQBrokerException {

        Message message = new Message(topic,"taga", ("hello rocketmq = "+text).getBytes() );

        SendResult sendResult = defaultMQProducer.send(message);

        System.out.println(sendResult);

        return new HashMap<>();
    }
}
