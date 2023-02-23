package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Employee;
import com.example.demo.Repositories.EmployeeRepo;

@Service
public class ApiService {
	
	@Autowired
	private EmployeeRepo stu;
	
	public Employee saveDetails(Employee e) {
		return stu.save(e);
	}
	public List<Employee> getAllDetails()
	{
		return stu.findAll();
	}
	public void deleteDepartmentById(int id)
	{
		stu.deleteById(id);
	}
}
