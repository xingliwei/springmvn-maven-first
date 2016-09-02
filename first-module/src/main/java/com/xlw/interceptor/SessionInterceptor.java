package com.xlw.interceptor;

import com.mysql.jdbc.StringUtils;
import com.xlw.constants.LoginConstant;
import com.xlw.exceptions.UnsupportDeviceException;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2016/9/2 0002.
 */
public class SessionInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String clientType = request.getHeader(LoginConstant.CLIENT_TYPE);
        if (StringUtils.isNullOrEmpty(clientType)){
            throw new Exception("unsupport device type!");
        }
        return super.preHandle(request, response, handler);
    }
}
