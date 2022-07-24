package com.greatlearning.employeeManager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.employeeManager.Entity.Role;
import com.greatlearning.employeeManager.repository.RoleRepository;

@Service
public class RoleServiceImpl {
	@Autowired
	private RoleRepository roleRepository;
	
	public void addRole(Role role) {
		roleRepository.save(role);
	}
}
