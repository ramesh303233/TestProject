package com.mindtree.empdashbaord.controller;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.mindtree.empdashbaord.model.Employee;
import com.mindtree.empdashbaord.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController {

	@Autowired
	EmployeeService empService;

	//private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeRestController.class);

	@GetMapping("/allDetails")
	public ResponseEntity<List<Employee>> getAllEmployees() {
		List<Employee> list = empService.getAllEmployees();
	//	LOGGER.info("Inside getAllEmployees() ");
		return new ResponseEntity<List<Employee>>(list, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long id) {
		Employee entity = empService.getEmployeeById(id);

		return new ResponseEntity<Employee>(entity, new HttpHeaders(), HttpStatus.OK);
	}

	@PostMapping("/createEmployee")
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {

		//LOGGER.info("Inside createEmployee() " + employee.getUsername());
		Employee created = empService.createOrUpdateEmployee(employee);
		return new ResponseEntity<Employee>(created, new HttpHeaders(), HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public HttpStatus deleteEmployeeById(@PathVariable("id") Long id) {
		empService.deleteEmployeeById(id);
		return HttpStatus.OK;
	}

}
