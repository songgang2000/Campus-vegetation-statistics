package com.song.config;


import org.springframework.boot.web.server.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 扩展springmvc配置
 *
 * 继承WebMvcConfigurer（webmvc配置）
 * 添加@Configuration，定义配置类
 */
@Configuration
public class Myconfig implements WebMvcConfigurer {

    //自定义视图控制器
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //首页映射
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index.html").setViewName("index");
        registry.addViewController("/main.html").setViewName("dashboard");
//        ErrorPage[] errorPages=new ErrorPage[1];
//        errorPages[0] =new ErrorPage(HttpStatus.NOT_FOUND,"/404.do");
    }

    //自定义国际化，
    @Bean
    public LocaleResolver localeResolver(){
        return new Myinternationalize();
    }


    //将拦截器注册的容器中

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new loginInterceptor()).addPathPatterns("/**").excludePathPatterns("/","/index.html","/user/login","/css/*","/img/*","/js/*","/emps","/mmp","/mp/{id}"
                ,"/updatemp","/delete/{id}","/error/404.html");
    }

}

