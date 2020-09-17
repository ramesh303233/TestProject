package com.mindtree.empdashbaord.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.empdashbaord.model.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Long> {

	Employee findByUsername(String username);

}
