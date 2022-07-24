package com.greatlearning.employeeManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.employeeManager.Entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
}
