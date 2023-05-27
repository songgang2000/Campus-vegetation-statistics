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
    //查询全部员工
    List<Employee> allselectEmployee();

    //通过id查询员工
    Employee selectEmployee(int id);

    //增加员工
    int insterEmployee(Employee employee);

    //删除员工
    int deleteEmployee( int id);

    //修改
    int updateEmployee(Employee employee);

    //查询全部部门+6
    List<Department> allselectDepartment();

    //id查询部门
    Department selectDepartment(int id);
}


