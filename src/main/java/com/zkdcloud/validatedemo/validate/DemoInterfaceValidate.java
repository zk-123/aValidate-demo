package com.zkdcloud.validatedemo.validate;

import com.zkdcloud.aValidate.exception.ReturnInvokeException;
import com.zkdcloud.validatedemo.bean.OperateResult;
import com.zkdcloud.validatedemo.bean.User;
import com.zkdcloud.validatedemo.exception.ValidateTipException;
import org.springframework.stereotype.Component;

/**
 * description
 *
 * @author zk
 * @since 2018/12/11
 */
@Component
public class DemoInterfaceValidate {

    /**
     * 抛出异常，并手动处理
     * {@link com.zkdcloud.validatedemo.aop.DemoValidateAspect}
     * {@link com.zkdcloud.validatedemo.exception.CommonException#dealTipException(Exception)}
     *
     * @param user user
     * @throws ValidateTipException validateTipException
     */
    public void checkUserName(User user) throws ValidateTipException {
        //if username exist
        throw new ValidateTipException("用户已存在");
    }

    /**
     * 直接返回校验结果
     * {@link com.zkdcloud.aValidate.aop.AbstractValidateAspect} 插件已处理
     *
     * @param user user
     * @throws ReturnInvokeException exception
     */
    public void checkUserName0(User user) throws ReturnInvokeException {
        //if username exist
        throw new ReturnInvokeException(new OperateResult(false));
    }

}
