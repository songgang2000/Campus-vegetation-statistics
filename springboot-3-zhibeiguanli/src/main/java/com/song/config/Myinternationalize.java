package com.song.config;

import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * 实现国际化方法，实现LocaleResolver接口，并实现其方法
 */
public class Myinternationalize implements LocaleResolver {

    //解析请求
    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        //获取请求中的请求参数
        String parameter = request.getParameter("l");
        //如果没有就使用默认的
        Locale locale = Locale.getDefault();
        //如果携带了国际化的参数
        if (!StringUtils.isEmpty(parameter)){
            //zh_CN
            String[] s = parameter.split("_");
            //国家，地区
          locale=  new Locale(s[0],s[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}
