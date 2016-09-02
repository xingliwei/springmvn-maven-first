package com.xlw.exceptions;/**
 * Created by levyx on 2016/9/2 0002.
 */

/**
 * 不支持的设备异常类
 * Created by levyx on 2016/9/2 0002.
 */
public class UnsupportDeviceException extends RuntimeException{

    public UnsupportDeviceException() {
    }

    public UnsupportDeviceException(String message) {
        super(message);
    }
}
