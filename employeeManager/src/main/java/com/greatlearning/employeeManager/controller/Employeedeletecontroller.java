package com.greatlearning.employeeManager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.employeeManager.service.EmployeeDeleteServiceImpl;

@RestController
@RequestMapping("/employee")
public class Employeedeletecontroller {
	@Autowired
	private EmployeeDeleteServiceImpl employeeDeleteService;
	
	@DeleteMapping("/delete/{id}")
	public void deleteEmployeeById(@PathVariable long id) {
		employeeDeleteService.removingAnExistingEmployee(id);
	}
}
