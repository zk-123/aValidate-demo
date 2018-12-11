package com.zkdcloud.validatedemo.controller;

import com.zkdcloud.aValidate.annotation.BeforeProcess;
import com.zkdcloud.validatedemo.bean.OperateResult;
import com.zkdcloud.validatedemo.bean.User;
import com.zkdcloud.validatedemo.service.DemoInterface;
import com.zkdcloud.validatedemo.validate.Pagination0Advice;
import com.zkdcloud.validatedemo.validate.PaginationAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * description
 *
 * @author zk
 * @since 2018/12/11
 */
@RestController
@RequestMapping(value = "/demo/")
public class IndexController {

    @Autowired
    private DemoInterface demoInterface;

    /**
     * service校验(抛出异常的方式，通知校验失败)
     *
     * @param user user
     * @return obj
     */
    @PostMapping(value = "/save/user")
    public Object saveUser(@RequestBody User user){
        demoInterface.saveUser(user);
        return "ok";
    }

    /**
     * service校验(校验失败，直接校验逻辑的返回值)
     *
     * @param user user
     * @return obj
     */
    @PostMapping(value = "/save/user0")
    public Object saveUser1(@RequestBody User user){
         OperateResult operateResult = demoInterface.saveUser0(user);
         return operateResult;
    }

    /**
     * controller校验(advice校验)
     *
     * @param pageSize pageSize
     * @param pageNum pageNum
     * @return obj
     */
    @GetMapping(value = "/get/userList")
    @BeforeProcess(advice = PaginationAdvice.class)
    public Object getUserList(String pageSize, String pageNum){
        return demoInterface.getUserList();
    }
    /**
     * controller校验(advice校验)
     *
     * @param pageSize pageSize
     * @param pageNum pageNum
     * @return obj
     */
    @GetMapping(value = "/get/userList0")
    @BeforeProcess(advice = Pagination0Advice.class)
    public Object getUserList1(String pageSize, String pageNum){
        return demoInterface.getUserList0();
    }
}
