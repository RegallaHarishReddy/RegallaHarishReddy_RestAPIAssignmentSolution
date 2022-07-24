package com.greatlearning.employeeManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.employeeManager.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	public User getUserByUsername(String username); 

}
