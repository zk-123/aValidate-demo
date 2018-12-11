package com.zkdcloud.validatedemo.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * description
 *
 * @author zk
 * @since 2018/12/11
 */
@RestControllerAdvice
public class CommonException {

    /**
     * 全局处理校验异常
     *
     * @param e e
     * @return obj
     */
    @ExceptionHandler(value = ValidateTipException.class)
    public Object dealTipException(Exception e){
        Map<String, String> result = new HashMap<>(1);
        result.put("error", e.getMessage());
        return result;
    }
}
