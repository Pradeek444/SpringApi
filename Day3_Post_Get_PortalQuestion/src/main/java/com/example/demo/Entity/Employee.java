package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="EmployeeDetails")
public class Employee {
    @Id
    @Column(name="ID")
    @GeneratedValue
    private int id;
    
    @Column(name="employeeName")
    @GeneratedValue
    private String name;
    
    @Column(name="age")
    @GeneratedValue
    private int age;
    @Column(name="salary")
    @GeneratedValue
    private int salary;
    public Employee() {}
    Employee(int id,String name,int age,int salary){
    	super();
    	this.id=id;
    	this.name=name;
    	this.age=age;
    	this.salary=salary;
    }
    //Getters,setters
  public int getId() {			
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getage() {
    return age;
  }
  public void setage(int age) {
    this.age = age;
   }
  public int getsalary() {
	  return salary;
  }
  public void setsalary(int salary) {
	  this.salary=salary;
  }
}