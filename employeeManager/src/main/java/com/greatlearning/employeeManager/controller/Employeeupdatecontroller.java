package com.greatlearning.employeeManager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.employeeManager.Entity.Employee;
import com.greatlearning.employeeManager.service.EmployeeUpdateServiceImpl;

public class Employeeupdatecontroller {
	@Autowired
	private EmployeeUpdateServiceImpl employeeUpdateService;

	@PutMapping("/update/{id}")
	public void updateEmployee(@PathVariable("id") long id, @RequestBody Employee employee) {
		employeeUpdateService.updateExistingEmployeeDetails(id, employee);
	}
}
