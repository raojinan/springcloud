package com.itan.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * @author raojinan
 * @version 1.0
 * @date 2021/9/8 10:30
 */
@Getter
@Setter
public class MyException extends RuntimeException {
    private int code;  //异常状态码

    private String message;  //异常信息

    private String method;   //发生的方法，位置等

    private String describe;   //描述

    public MyException(int code, String message, String method, String describe) {
        this.code = code;
        this.message = message;
        this.method = method;
        this.describe = describe;
    }

    public MyException(int code, String message, String method) {
        this.code = code;
        this.message = message;
        this.method = method;
    }
}
