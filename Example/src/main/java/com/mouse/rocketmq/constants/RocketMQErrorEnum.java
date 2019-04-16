package com.mouse.rocketmq.constants;

/**
 * Desc
 * .<br/>
 * <p>
 * Copyright: Copyright (c) 2019  tdh
 *
 * @ClassName: RocketMQErrorEnum
 * @Description:
 * @version: v1.0.0
 * @author: shilun <sl166199@163.com>
 * @date: 2019/4/3 11:13
 * Modification History:
 * Date             Author          Version            Description
 * ---------------------------------------------------------*
 * 2019/4/3        shilun           v1.0.0               创建
 */
public enum RocketMQErrorEnum implements ErrorCode{
    /********公共********/
    PARAMM_NULL("MQ_001","参数为空"),

    /********生产者*******/



    /********消费者*******/
    NOT_FOUND_CONSUMESERVICE("MQ_100","根据topic和tag没有找到对应的消费服务"),
    HANDLE_RESULT_NULL("MQ_101","消费方法返回值为空"),
    CONSUME_FAIL("MQ_102","消费失败")
    ;

    private String code;
    private String msg;

    private RocketMQErrorEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getMsg() {
        return this.msg;
    }
}
