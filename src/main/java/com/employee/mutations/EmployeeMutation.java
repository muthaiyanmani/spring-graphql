package com.employee.mutations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.employee.model.Employee;
import com.employee.service.impl.EmployeeServiceImpl;

@Component
public class EmployeeMutation implements GraphQLMutationResolver {
	@Autowired
	private EmployeeServiceImpl employeeService;

	public Employee addEmployee(Employee employee) {
		return employeeService.addEmployee(employee);
	}

}
