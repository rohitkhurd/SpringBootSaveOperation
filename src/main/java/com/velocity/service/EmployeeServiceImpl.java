package com.velocity.service;

 import org.slf4j.Logger;

// 4

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.controller.EmployeeController;
import com.velocity.model.Employee;
import com.velocity.repository.EmployeeRepository;

//its implementation

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private static final Logger logger = org.slf4j.LoggerFactory.getLogger(EmployeeController.class);

	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	@Override
	public Employee saveEmployee(Employee emp) {
	
		logger.info("in employee service implementation");
		return employeeRepository.save(emp);
	}

}
