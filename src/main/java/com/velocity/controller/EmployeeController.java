package com.velocity.controller;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.velocity.model.Employee;
import com.velocity.service.EmployeeService;

import org.slf4j.Logger;

// 5

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.Employee;
import com.velocity.service.EmployeeService;

@RestController
public class EmployeeController {

	private static final Logger logger = org.slf4j.LoggerFactory.getLogger(EmployeeController.class);
	// EmployeeService reference inject
	@Autowired
	private EmployeeService employeeService;

	// Design the restful web sevices to save the emplyee data into database
	@PostMapping("/saveEmployee")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {

		Employee emp = employeeService.saveEmployee(employee);

		logger.info("in the employee controller class");
		return ResponseEntity.ok().body(emp);
	}
}
