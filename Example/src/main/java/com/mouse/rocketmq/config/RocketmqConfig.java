package com.mouse.rocketmq.config;

/**
 * @author shil <sl166199@163.com>
 * @version v1.0
 * @ClassName RocketmqConfig
 * @Description TODO
 * @date 2019/4/3 09:55
 */
//@Component
//@ConfigurationProperties(prefix = RocketmqConfig.PREFIX)
public class RocketmqConfig {

    public static final String PREFIX="mouse";

    //producer group name.
    private String producerGroup = "";

    // Specify name server addresses.
    private String nameServerAddr = "";

    public String getProducerGroup() {
        return producerGroup;
    }

    public void setProducerGroup(String producerGroup) {
        this.producerGroup = producerGroup;
    }

    public String getNameServerAddr() {
        return nameServerAddr;
    }

    public void setNameServerAddr(String nameServerAddr) {
        this.nameServerAddr = nameServerAddr;
    }
}
