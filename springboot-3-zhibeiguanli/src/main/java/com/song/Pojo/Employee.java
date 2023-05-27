package com.song.Pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Pojo.Employee: 此类实列化员工类
 */
@Data
@NoArgsConstructor

public class Employee {
    private Integer id; //员工的id
    private String lastName; //员工的名字
    private String email;  //员工的邮箱
    private Integer sex; //员工的性别。男：1 ，女：0

    private  int department;  //员工的部门
    private Date brith;   //日期
    private Department department1;

    public Employee(Integer id, String lastName, String email, Integer sex,Department department1,int department) {
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.sex = sex;
        this.brith =new Date();
        this.department=department;
        this.department1=department1;
    }
}
