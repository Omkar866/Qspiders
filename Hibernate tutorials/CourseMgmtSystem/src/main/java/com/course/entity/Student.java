package com.course.entity;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Student 
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="s_id")
	@SequenceGenerator(name="s_id",initialValue = 100,allocationSize = 1)
	
	private int id;
	private String name;
	
	@ManyToMany
	Set <Subject> subjects;
	
	public Student()
	{
		this.subjects=new LinkedHashSet<Subject>();
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

	public Set<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(Set<Subject> subjects) {
		this.subjects=subjects;
	}
	
	public void addSubject(Subject s)
	{
		subjects.add(s);
	}
	
	

}
