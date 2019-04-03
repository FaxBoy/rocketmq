package com.mouse.rocketmq.exception;

import com.mouse.rocketmq.constants.ErrorCode;

/**
 * Desc
 * .<br/>
 * <p>
 * Copyright: Copyright (c) 2019  tdh
 *
 * @ClassName: MouseException
 * @Description:
 * @version: v1.0.0
 * @author: shilun <sl166199@163.com>
 * @date: 2019/4/3 11:11
 * Modification History:
 * Date             Author          Version            Description
 * ---------------------------------------------------------*
 * 2019/4/3        shilun           v1.0.0               创建
 */
public class MouseException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    /**
     * 错误编码
     */
    protected ErrorCode errCode;

    /**
     * 错误信息
     */
    protected String errMsg;

    /**
     * 无参构造函数
     */
    public MouseException() {
        super();
    }
    public MouseException(Throwable e) {
        super(e);
    }

    public MouseException(ErrorCode errCode, String... errMsg) {
        super(errCode.getMsg());
        this.errCode = errCode;
        setErrMsg(errMsg,true);
    }

    public MouseException(ErrorCode errCode, String errMsg,Boolean isTransfer) {
        super(errMsg);
        this.errCode = errCode;
        setErrMsg(new String[]{errMsg},isTransfer);
    }

    /**
     * 构造函数
     *
     * @param cause 异常
     */
    public MouseException(ErrorCode errCode, Throwable cause, String... errMsg) {
        super(errCode.getCode() + errCode.getMsg(), cause);
        this.errCode = errCode;
        setErrMsg(errMsg,true);
    }

    public ErrorCode getErrCode() {
        return errCode;
    }

    public void setErrCode(ErrorCode errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return this.errMsg;
    }

    public void setErrMsg(String[] errMsg,Boolean isTransfer) {

        if (null != errMsg &&errMsg.length>0) {
            if(errCode.getMsg().contains("%s") && isTransfer){
                this.errMsg = String.format(errCode.getMsg(), errMsg);
            }else{
                StringBuffer sf = new StringBuffer();
                for (String msg : errMsg) {
                    sf.append(msg+";");
                }
                this.errMsg = sf.toString();
            }
        }else{
            this.errMsg = errCode.getMsg();
        }

    }
}
