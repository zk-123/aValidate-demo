package com.zkdcloud.validatedemo.exception;

/**
 * 自定义异常，并自定义异常处理方法
 *
 * @author zk
 * @since 2018/12/11
 */
public class ValidateTipException extends RuntimeException{
    public ValidateTipException(String msg){
        super(msg);
    }
}
