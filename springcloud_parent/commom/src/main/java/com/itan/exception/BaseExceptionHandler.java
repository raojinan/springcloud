package com.itan.exception;

import com.itan.entity.Result;
import com.itan.entity.StatusCode;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author raojinan
 * @version 1.0
 * @date 2021/9/8 9:57
 * 全局异常处理类
 */
@ControllerAdvice
public class BaseExceptionHandler  {

    /***
     * 异常处理
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result error(Exception e) {
        e.printStackTrace();
        return new Result(false, StatusCode.ERROR, e.getMessage());
    }
}
