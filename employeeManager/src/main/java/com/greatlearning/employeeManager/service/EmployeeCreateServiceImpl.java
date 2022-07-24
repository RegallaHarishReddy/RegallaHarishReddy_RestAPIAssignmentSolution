package com.greatlearning.employeeManager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.employeeManager.Entity.Employee;
import com.greatlearning.employeeManager.repository.EmployeeRepository;

@Service
public class EmployeeCreateServiceImpl {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	public void registerAnEmployee(Employee emp) {
		employeeRepository.save(emp);
	}
}
