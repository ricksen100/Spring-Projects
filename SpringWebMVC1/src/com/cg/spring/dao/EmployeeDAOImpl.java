package com.cg.spring.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.spring.dto.Employee;

@Repository("employeedao")
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	@PersistenceContext
	EntityManager entityManager;
	@Override
	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
	entityManager.persist(e);
	}

	@Override
	public List<Employee> showEmployees() {
		// TODO Auto-generated method stub
		List<Employee> list=new ArrayList<Employee>();
		Query q=entityManager.createQuery("from Employee");
		list=q.getResultList();
		return list;
	}

	@Override
	public void updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		entityManager.merge(e);
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		Query q=entityManager.createQuery("from Employee where emp_id=:id");
		q.setParameter("id",id);
		Employee empList=(Employee) q.getSingleResult();
		entityManager.remove(empList);
	}

}
