package com.song.Dao.mapper;


import com.song.Pojo.Department;
import com.song.Pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface EmployeeMapper {


//    Integer id=1;
    //查询全部植被
    List<Employee> allselectEmployee();

    //通过id查询植被
    Employee selectEmployee(int id);

    //
    int insterEmployee(Employee employee);

    //删除植被
    int deleteEmployee( int id);

    //修改
    int updateEmployee(Employee employee);

    //查询全部位置+6
    List<Department> allselectDepartment();

    //id查询位置
    Department selectDepartment(int id);
}


