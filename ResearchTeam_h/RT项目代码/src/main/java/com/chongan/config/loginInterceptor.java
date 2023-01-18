package com.chongan.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class loginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        try {
            Object user = request.getSession().getAttribute("user");
            if(user != null) {
                return true;
            }
            response.sendRedirect(request.getContextPath()+"/backLogin");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
