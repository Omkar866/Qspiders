package com.prc;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student 
{
	@Id
	private int id;
	
	private String name;
	private double percentage;
	
	
	
	
	
	public Student() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, double percentage)
	{
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public double getPercentage() 
	{
		return percentage;
	}
	public void setPercentage(double percentage) 
	{
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
	}
	
	
	

}
