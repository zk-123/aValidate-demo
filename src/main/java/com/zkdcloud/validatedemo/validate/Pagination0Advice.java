package com.zkdcloud.validatedemo.validate;

import com.zkdcloud.aValidate.exception.ReturnInvokeException;
import com.zkdcloud.advice.HttpAdvice;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * ReturnInvokeException 异常直接返回
 *
 * @author zk
 * @since 2018/12/11
 */
@Component
public class Pagination0Advice implements HttpAdvice {
    @Override
    public void doAdvice(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Map<String, Object> map) throws ReturnInvokeException {
        String pageNum = httpServletRequest.getParameter("pageNum");
        String pageSize = httpServletRequest.getParameter("pageSize");

        if(pageNum == null || pageNum.equals("")){
            throw new ReturnInvokeException("pageNum is need");
        }
        if(pageSize == null || pageSize.equals("")){
            throw new ReturnInvokeException("pageSize is need");
        }
    }
}
