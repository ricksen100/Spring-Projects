package com.cg.spring.dao;

import java.util.List;

import com.cg.spring.dto.Employee;

public interface EmployeeDAO {

	public void addEmployee(Employee e);
	public List<Employee> showEmployees();
	public void updateEmployee(Employee e);
	public void deleteEmployee(int id);
}
