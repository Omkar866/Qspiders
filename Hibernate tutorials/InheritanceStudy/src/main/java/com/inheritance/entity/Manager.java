package com.inheritance.entity;

import javax.persistence.Entity;

@Entity
public class Manager extends Employee 
{
	
	int teamSize;
	
	public Manager() {}
	
	public int getTeamSize() {
		return teamSize;
	}



	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}



	@Override
	public void greet() 
	{
		System.out.println("Good morning manager");

	}

}
