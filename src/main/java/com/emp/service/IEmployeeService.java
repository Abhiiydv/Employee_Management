package com.emp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.emp.model.Employee;



public interface IEmployeeService{
	
Integer saveEmployee(Employee employee);

public List<Employee> getAllEmployees();

}