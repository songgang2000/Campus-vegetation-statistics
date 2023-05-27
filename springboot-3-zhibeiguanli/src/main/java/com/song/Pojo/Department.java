package com.song.Pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Pojo.Department:此类实列化部门类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    private Integer id;          //部门id
    private String department;      //部门名字
   // DepartmentName
}
