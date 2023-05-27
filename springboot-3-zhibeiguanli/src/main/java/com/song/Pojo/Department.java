package com.song.Pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Pojo.Department:此类实列化位置类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    private Integer id;          //位置id
    private String department;      //位置名字
   // DepartmentName
}
