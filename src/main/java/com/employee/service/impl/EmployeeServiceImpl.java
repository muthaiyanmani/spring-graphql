package com.employee.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.employee.model.Employee;
import com.employee.repository.EmployeeRepository;
import com.employee.service.IEmployee;

@Service
public class EmployeeServiceImpl implements IEmployee {

	@Autowired
	private EmployeeRepository employeeRepo;

	@Override
	public List<Employee> getEmployees() {
		List<Employee> employees = employeeRepo.findAll();
		return employees;
	}

	@Override
	public Employee getEmployeeById(Long empId) {
		return employeeRepo.findById(empId).orElse(null);
	}

	@Override
	public Employee addEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}

}
