package com.mouse.rocketmq.constants;

import java.io.Serializable;

/**
 * Desc
 * .<br/>
 * <p>
 * Copyright: Copyright (c) 2019  tdh
 *
 * @ClassName: ErrorCode
 * @Description:
 * @version: v1.0.0
 * @author: shilun <sl166199@163.com>
 * @date: 2019/4/3 11:12
 * Modification History:
 * Date             Author          Version            Description
 * ---------------------------------------------------------*
 * 2019/4/3        shilun           v1.0.0               创建
 */
public interface ErrorCode extends Serializable {
    /**
     * 错误码
     * @return
     */
    String getCode();
    /**
     * 错误信息
     * @return
     */
    String getMsg();
}
