package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Studentdemo")
public class Student {
    @Id
    @Column(name="ID")
    @GeneratedValue
    private int id;
    
    @Column(name="Name")
    @GeneratedValue
    private String name;
    
    @Column(name="Dept")
    @GeneratedValue
    private String dept;
    public Student() {}
    Student(int id,String name,String dept){
    	super();
    	this.id=id;
    	this.name=name;
    	this.dept=dept;
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
  public String getDept() {
    return dept;
  }
  public void setDept(String dept) {
    this.dept = dept;
   }
}
