package com.mindtree.empdashbaord.securityConfig;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.mindtree.empdashbaord.model.Employee;
import com.mindtree.empdashbaord.repository.EmpRepository;

@Service
public class EmployeeDetailService implements UserDetailsService {

	@Autowired
	EmpRepository empRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Employee employee = empRepo.findByUsername(username);
        return new User(employee.getUsername(), employee.getPassword(), new ArrayList<>());
	}


}
