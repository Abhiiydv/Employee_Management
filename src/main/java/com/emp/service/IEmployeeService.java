package com.emp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.emp.model.Employee;



public interface IEmployeeService{
	
Integer saveEmployee(Employee employee);

public List<Employee> getAllEmployees();

Optional<Employee> getEmployee(Integer id);

public void deleteEmployee(Integer id);

public void deleteAll();

}
