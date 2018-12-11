package com.zkdcloud.validatedemo.aop;

import com.zkdcloud.aop.AbstractValidateAspect;
import com.zkdcloud.validatedemo.exception.ValidateTipException;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * demo validate aspect
 *
 * @author zk
 * @since 2018/12/11
 */
@Aspect
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class DemoValidateAspect extends AbstractValidateAspect {

    /**
     * static logger
     */
    private static Logger logger = LoggerFactory.getLogger(DemoValidateAspect.class);

    @Override
    public Object renderThrowable(Throwable throwable) throws Throwable {
        //处理校验抛出的异常
        if(throwable instanceof ValidateTipException){
            throw throwable;
        }
        logger.error(throwable.getMessage(), throwable);
        return throwable.getMessage();
    }
}
