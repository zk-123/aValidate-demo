package com.zkdcloud.validatedemo.service;

import com.zkdcloud.validatedemo.bean.OperateResult;
import com.zkdcloud.validatedemo.bean.User;

import java.util.List;

/**
 * description
 *
 * @author zk
 * @since 2018/12/11
 */
public interface DemoInterface {

    void saveUser(User user);

    OperateResult saveUser0(User user);

    List<User> getUserList();

    List<User> getUserList0();
}
