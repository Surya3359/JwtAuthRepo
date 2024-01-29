package com.Restapi.Lion.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Restapi.Lion.Models.Employee;
import com.Restapi.Lion.Repository.EmployeeRepository;

@RestController
@RequestMapping("/api/emp")
@CrossOrigin(origins =  "*", maxAge =3600)
public class EmpController {
	
	@Autowired
	private EmployeeRepository emprepo;
	
	//to get all employee details
	@GetMapping
	private List<Employee> getallEmployee(){
		return this.emprepo.findAll();		
	}
	
	//create employee
	@PostMapping
	public Employee createEmployee(@RequestBody Employee emp) {
		return this.emprepo.save(emp);
	}
}
