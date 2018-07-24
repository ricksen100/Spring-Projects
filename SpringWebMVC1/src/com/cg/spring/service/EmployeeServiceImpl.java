package com.cg.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spring.dao.EmployeeDAO;
import com.cg.spring.dto.Employee;


@Service("employeeservice")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDAO employeeDao;
	@Override
	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		employeeDao.addEmployee(e);
	}

	@Override
	public List<Employee> showEmployee() {
		// TODO Auto-generated method stub
		return employeeDao.showEmployees();
	}

	@Override
	public void updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		employeeDao.updateEmployee(e);
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		employeeDao.deleteEmployee(id);
	}

	
}
