package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Employee;
import com.example.demo.Service.ApiService;

@RestController
public class ApiController {
   @Autowired
   private ApiService stuservice;
   @PostMapping("/addEmployee")
   public String postDetails(@RequestBody Employee e) {
	   stuservice.saveDetails(e);
	   return "Value Successfully Added";
   }
   @GetMapping("/getEmployee")
   public List<Employee>getDetails(){
	   return stuservice.getAllDetails();
   }
 
}