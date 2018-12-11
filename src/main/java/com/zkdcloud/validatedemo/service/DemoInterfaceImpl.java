package com.zkdcloud.validatedemo.service;

import com.zkdcloud.annotation.BeforeProcess;
import com.zkdcloud.annotation.Validate;
import com.zkdcloud.validatedemo.bean.OperateResult;
import com.zkdcloud.validatedemo.bean.User;
import com.zkdcloud.validatedemo.validate.DemoInterfaceValidate;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * description
 *
 * @author zk
 * @since 2018/12/11
 */
@Component
public class DemoInterfaceImpl implements DemoInterface {

    @Override
    @BeforeProcess(validate = @Validate(value = DemoInterfaceValidate.class, method = "checkUserName"))
    public void saveUser(User user) {
        //saveUser
    }

    @Override
    @BeforeProcess(validate = @Validate(value = DemoInterfaceValidate.class, method = "checkUserName0"))
    public OperateResult saveUser0(User user) {
        //saveUser
        return new OperateResult(true);
    }

    @Override
    public List<User> getUserList() {
        return Arrays.asList(new User());
    }

    @Override
    public List<User> getUserList0() {
        return Arrays.asList(new User());
    }
}
