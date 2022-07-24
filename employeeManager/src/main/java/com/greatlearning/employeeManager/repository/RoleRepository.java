package com.greatlearning.employeeManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.employeeManager.Entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
	
}
