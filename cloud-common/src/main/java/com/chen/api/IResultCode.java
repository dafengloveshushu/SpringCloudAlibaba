package com.chen.api;

import java.io.Serializable;

/**
 * @author 大奉
 * @create 2019-11-19 15:16
 */
public interface IResultCode extends Serializable {
    /**
     * 返回的消息
     * @return
     */
    String getMessage();

    /**
     * 返回的状态码
     * @return
     */
    int getCode();
}
