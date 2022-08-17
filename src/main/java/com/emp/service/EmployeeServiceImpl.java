package com.emp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.model.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService{

	
	@Autowired
	IEmployeeRepository employeeRepository;

	@Override
	public Integer saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Employee savedEmployee = employeeRepository.save(employee);
		return savedEmployee.getId();
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Optional<Employee> getEmployee(Integer id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id);
	}

	@Override
	public void deleteEmployee(Integer id) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(id);
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		employeeRepository.deleteAll();
		
	}
}
