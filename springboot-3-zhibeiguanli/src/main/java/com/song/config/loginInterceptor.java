package com.song.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class loginInterceptor implements HandlerInterceptor {

        //设置拦截器
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        //登录成功后应该有一个用户的sessoin
        Object loser = request.getSession().getAttribute("loinUser");
        //如果为空
        if (loser==null){
            request.setAttribute("msg","没权限，请先登录！");
            //返回首页
            request.getRequestDispatcher("/index.html").forward(request,response);
            return false;
        }else {
            return true;
        }

    }
}
