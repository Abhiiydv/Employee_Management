package com.emp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.model.Employee;
import com.emp.service.IEmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	IEmployeeService employeeService;
	
	
	@RequestMapping("/hello")
	
	public String hello() {
		return "Hello Java World!";
	}
	
	@PostMapping("/employee")
	
	Integer createEmployee(@RequestBody Employee employee) {
		
		Integer id = employeeService.saveEmployee(employee);
		System.out.println(id);
		return id;
	}
	@GetMapping("/allemployees")
public List<Employee> getEmployee(){
		return employeeService.getAllEmployees();
	}
	@GetMapping("/getemployee/{id}")
	public Optional<Employee> getAllEmployee(@PathVariable Integer id){
			Optional<Employee> emp =  employeeService.getEmployee(id);
			return emp;
			
		}
	
	@DeleteMapping("/employee/{id}")
	public ResponseEntity <Employee>  deleteEmployee(@PathVariable Integer id){
		System.out.println(id);
		ResponseEntity <Employee>rp = new ResponseEntity<>(HttpStatus.OK);
		try {
			employeeService.deleteEmployee(id);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			rp = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return rp;
		
		
	}
	@DeleteMapping("/deleteall")
	public String deleteAll() {
		employeeService.deleteAll();
		return "Deleted All records";
	}
}
