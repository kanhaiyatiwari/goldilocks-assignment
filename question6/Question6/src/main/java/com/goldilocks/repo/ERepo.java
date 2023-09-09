package com.goldilocks.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.goldilocks.entity.Employee;

public interface ERepo  extends JpaRepository<Employee, Integer>{

	
}
