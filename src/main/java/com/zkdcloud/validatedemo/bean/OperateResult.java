package com.zkdcloud.validatedemo.bean;

/**
 * description
 *
 * @author zk
 * @since 2018/12/11
 */
public class OperateResult {
    private boolean success;

    public OperateResult(boolean success){
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
