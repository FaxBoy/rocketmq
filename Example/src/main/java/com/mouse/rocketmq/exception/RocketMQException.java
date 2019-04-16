package com.mouse.rocketmq.exception;

import com.mouse.rocketmq.constants.ErrorCode;

/**
 * Desc
 * .<br/>
 * <p>
 * Copyright: Copyright (c) 2019  tdh
 *
 * @ClassName: RocketMQException
 * @Description:
 * @version: v1.0.0
 * @author: shilun <sl166199@163.com>
 * @date: 2019/4/3 11:10
 * Modification History:
 * Date             Author          Version            Description
 * ---------------------------------------------------------*
 * 2019/4/3        shilun           v1.0.0               创建
 */
public class RocketMQException extends MouseException{
    private static final long serialVersionUID = 1L;


    /**
     * 无参构造函数
     */
    public RocketMQException() {
        super();
    }
    public RocketMQException(Throwable e) {
        super(e);
    }
    public RocketMQException(ErrorCode errorType) {
        super(errorType);
    }

    public RocketMQException(ErrorCode errorCode, String ... errMsg) {
        super(errorCode, errMsg);
    }
    /**
     * 封装异常
     * @param errorCode
     * @param errMsg
     * @param isTransfer 是否转换异常信息，如果为false,则直接使用errMsg信息
     */
    public RocketMQException(ErrorCode errorCode, String errMsg,Boolean isTransfer) {
        super(errorCode, errMsg,isTransfer);
    }

    public RocketMQException(ErrorCode errCode, Throwable cause,String ... errMsg) {
        super(errCode,cause, errMsg);
    }
}
