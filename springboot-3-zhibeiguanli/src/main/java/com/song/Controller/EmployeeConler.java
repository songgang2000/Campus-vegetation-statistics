package com.song.Controller;

import com.song.Dao.mapper.EmployeeMapper;
import com.song.Pojo.Department;
import com.song.Pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Collection;

/**
 * 展示植被列表
 */
@Controller
public class EmployeeConler {

    //注入到容器中注入
    @Autowired
    EmployeeMapper employeeMapper;
    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping("/emps")
    public String List(Model model){
        //获取全部植被
        Collection<Employee> employees = employeeMapper.allselectEmployee();
        //将数据传入到前台
        model.addAttribute("mps",employees);
        return "/list";
    }

    @GetMapping("/mmp")
    public String toAddpage( Model model){
        //获取所有位置
    Collection<Department> departments = employeeMapper.allselectDepartment();
    model.addAttribute("departments",departments);
    return "comment/add";
    }

    @PostMapping("/mmp")
    public String addpage(Employee employee ){
        //保存植被信息
        employeeMapper.insterEmployee(employee);

        return  "redirect:/emps";
    }


    //编辑植被
    @GetMapping("/mp/{id}")
    public String updatepage(@PathVariable("id")Integer id, Model model){
        Employee employe= employeeMapper.selectEmployee(id);
        model.addAttribute("mp",employe);
        //获取所有位置
        Collection<Department> departments = employeeMapper.allselectDepartment();
        model.addAttribute("departments",departments);
        return "comment/update";
    }

    @PostMapping("/updatemp")
    public String update(Employee employee ){
        //保存植被信息
        employeeMapper.updateEmployee(employee);
        return  "redirect:/emps";
    }
//删除植被
@GetMapping("/delete/{id}")
    public String delete(@PathVariable("id")Integer id ){
    employeeMapper.deleteEmployee(id);
    //sql语句：此语句是解决id自增不连续
    String sql="ALTER TABLE `employee` AUTO_INCREMENT =1";
//执行sql语句
    jdbcTemplate.execute(sql);
        return  "redirect:/emps";
    }

   // 退出/
    @RequestMapping ("/tuichu")
    public String totui(HttpSession session){
        session.invalidate();
        return "redirect:/index";
}

////404
//@GetMapping("/404.do")
//public String Notfond(){
//return "/error/404";
//}
    }





