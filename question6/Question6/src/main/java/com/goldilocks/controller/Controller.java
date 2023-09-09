package com.goldilocks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.goldilocks.entity.Employee;
import com.goldilocks.exeption.EmployeeException;
import com.goldilocks.repo.ERepo;

@RestController
public class Controller {
	@Autowired
private ERepo erepo;

@PostMapping("/employee")
public String post(@RequestBody Employee employee) throws EmployeeException {
	if(employee==null) {
		throw new EmployeeException("can not create employee withoud details");
	}
	erepo.save(employee);
	return employee.getName()+" "+"has been successfully registerd to database";
}
	

@GetMapping("/employee")
public String getAllEmployee() throws EmployeeException {
	
	List<Employee>em=erepo.findAll();
	if(em.size()>0) {
		String bag="";
		for(int i=0;i<em.size();i++) {
			bag+="employee name is:- "+em.get(i).getName()+" "
					+ ","+"employee age is:- "+em.get(i).getAge()+"\n";
		}
		System.out.println(bag);
		return bag;
	}
	
	throw new EmployeeException("there is no mployee in database ");
}


}
