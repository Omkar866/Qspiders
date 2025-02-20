package com.inheritance.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
public class Developer extends Employee 
{
	
	private String programmingLanguage;
	
	public Developer() {}
	

	public String getProgrammingLanguage() {
		return programmingLanguage;
	}




	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}




	@Override
	public void greet() {
		System.out.println("Have a Bug free day");

	}

}
