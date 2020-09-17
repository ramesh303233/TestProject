package com.mindtree.empdashbaord.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.empdashbaord.model.Employee;
import com.mindtree.empdashbaord.repository.EmpRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmpRepository empRepo;

	
	 public List<Employee> getAllEmployees()
	    {
	        List<Employee> employeeList = empRepo.findAll();
	         
	        if(employeeList.size() > 0) {
	            return employeeList;
	        } else {
	            return new ArrayList<Employee>();
	        }
	    }
	
	public Employee getEmployeeById(Long id) {
        Optional<Employee> employee = empRepo.findById(id);

			  return employee.get();
    }
	
	@Override
	public Employee createOrUpdateEmployee(Employee employee) {
		Employee emp = empRepo.save(employee);
		return emp;
	}
	
	 public void deleteEmployeeById(Long id)
	    {
	        Optional<Employee> employee = empRepo.findById(id);
	         
	        if(employee.isPresent()) 
	        {
	        	empRepo.deleteById(id);
	        }
	    } 

}
