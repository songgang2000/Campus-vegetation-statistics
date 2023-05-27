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
    private Integer id; //植被的id
    private String lastName; //植被的名字
    private String email;  //植被的上传时间
    private Integer sex; //植被的推荐。是：1 ，否：0

    private  int department;  //植被的位置
    private Date brith;   //时间
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
