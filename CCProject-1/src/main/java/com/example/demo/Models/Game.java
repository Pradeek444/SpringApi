package com.example.demo.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Game_Managment")
public class Game {
    @Id
    
    @Column(name="id")
    private int id;
    
    @Column(name="Game_Name")
    private String name;
    
    @Column(name="Company_Name")
    private String cname;
    
    @Column(name="Price")
    private float price;
    
    @Column(name="Released Year")
    private int year;
    
    @Column(name="Quantity")
    private int qty;
    
    public Game() {}
    public Game(int id,String name,String cname,float price,int year,int qty) {
    	super();
    	this.id=id;
    	this.name=name;
    	this.cname=cname;
    	this.price=price;
    	this.year=year;
    	this.qty=qty;
    }
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
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
    
}
