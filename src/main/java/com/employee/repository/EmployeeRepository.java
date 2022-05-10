package com.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.employee.model.Employee;

@Component
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
