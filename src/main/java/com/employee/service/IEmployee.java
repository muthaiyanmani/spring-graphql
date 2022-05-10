package com.employee.service;

import java.util.List;

import com.employee.model.Employee;

public interface IEmployee {
	public Employee addEmployee(Employee employee);

	public List<Employee> getEmployees();

	public Employee getEmployeeById(Long empId);
}
