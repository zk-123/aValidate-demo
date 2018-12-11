package com.zkdcloud.validatedemo.validate;

import com.zkdcloud.aValidate.advice.HttpAdvice;
import com.zkdcloud.validatedemo.exception.ValidateTipException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * description
 *
 * @author zk
 * @since 2018/12/11
 */
@Component
public class PaginationAdvice implements HttpAdvice {
    @Override
    public void doAdvice(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Map<String, Object> map) throws ValidateTipException{
        String pageNum = httpServletRequest.getParameter("pageNum");
        String pageSize = httpServletRequest.getParameter("pageSize");

        if(pageNum == null || pageNum.equals("")){
            throw new ValidateTipException("pageNum is need");
        }
        if(pageSize == null || pageSize.equals("")){
            throw new ValidateTipException("pageSize is need");
        }
    }
}
