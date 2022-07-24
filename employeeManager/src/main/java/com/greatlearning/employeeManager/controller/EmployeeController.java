package com.greatlearning.employeeManager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.employeeManager.Entity.Employee;
import com.greatlearning.employeeManager.service.EmployeeCreateServiceImpl;

public class EmployeeController {
	@Autowired
	private EmployeeCreateServiceImpl employeeCreateService;
	
	@PostMapping("/register")
	public void registerNewEmployee(@RequestBody Employee employee) {
		employeeCreateService.registerAnEmployee(employee);
	}
}
