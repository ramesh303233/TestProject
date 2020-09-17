package com.mindtree.empdashbaord.service;

import java.util.List;

import com.mindtree.empdashbaord.model.Employee;

public interface EmployeeService {

	Employee createOrUpdateEmployee(Employee employee);

	void deleteEmployeeById(Long id);

	Employee getEmployeeById(Long id);

	List<Employee> getAllEmployees();

}
