package com.mindtree.empdashbaord.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mindtree.empdashbaord.model.Employee;
import com.mindtree.empdashbaord.service.EmployeeService;

@Controller
public class EmployeeFormController {

    @Autowired
    EmployeeService empService;
	
    @RequestMapping("/showCreate")
	public String showCreate() {
		return "createEmployee";
	}
    
	@RequestMapping("/saveEmployee")
	public String saveLocation(@ModelAttribute("employee") Employee employee, ModelMap modelMap) {
		Employee created = empService.createOrUpdateEmployee(employee);
		String msg = "employee saved with id: " + created.getId();
		modelMap.addAttribute("msg", msg);
		return "createEmployee";
	}
	
}
