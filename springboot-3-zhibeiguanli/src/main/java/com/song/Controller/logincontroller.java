package com.song.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;

/**
 * 创建容器对象
 */
@Controller
public class logincontroller {
    //登录映射地址
@RequestMapping(value = "/user/login")
//登录方法，有参构造
public String log(@RequestParam("username") String username, @RequestParam("password") String password, Model model, HttpSession session){
    //条件：名字不为空，与密码是“123456”，则跳转到指定页面（dashboard（redirect:/main.html））
if (!StringUtils.isEmpty(username) && "123456".equals(password)){
//拦截器
    //注意：添加了拦截器后下面页面跳转不能用重定向，不然会被拦截（redirect：不需要视图解析器，直接重新请求一个新地址**）
    //这里的"loinUser" 为拦截器中方的“Object loser = request.getSession().getAttribute("loinUser");” 的.getAttribute("loinUser")；
    session.setAttribute("loinUser",username);
    //重定向页面，映射地址
    return "redirect:/main.html";
   // return "dashboard";
}else {
    //否则跳转到首页，并提示
    model.addAttribute("msg","您输入的用户名或密码错误");
    return "index";
}


}


}
