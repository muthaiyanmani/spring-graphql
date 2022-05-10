package com.employee.query;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.employee.model.Employee;
import com.employee.service.IEmployee;

@Component
public class EmployeeQuery implements GraphQLQueryResolver {
	@Autowired
	private IEmployee employee;

	public List<Employee> getEmployees() {
		return employee.getEmployees();
	}

	public Employee getEmployeeById(Long empId) {
		return employee.getEmployeeById(empId);
	}

}
