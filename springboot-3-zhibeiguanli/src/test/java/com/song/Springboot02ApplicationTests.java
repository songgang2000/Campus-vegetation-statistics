package com.song;


import com.song.Dao.mapper.EmployeeMapper;
import com.song.Pojo.Department;
import com.song.Pojo.Employee;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Springboot02ApplicationTests {

@Autowired
EmployeeMapper employeeMapper;
//	@Test
//	void contextLoads() {
//
//
//		List<Employee> employees = employeeMapper.allselectEmployee();
//		for (Employee a:employees) {
//			System.out.println(a);
//		}
//
////		List<Department> departments = employeeMapper.allselectDepartment();
////		for (Department b:departments) {
////			System.out.println(b);
////		}
//
//	}

}
