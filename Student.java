package com.hcc.example.RESTdemo;

import org.springframework.stereotype.Component;

@Component
public class Student {
 
	public Student(int id, String name, double gpa, String email, String gender) {
		this.id = id;
		this.name = name;
		this.gpa = gpa;
		this.email = email;
		this.gender = gender;
	}
	
	private int id;
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private double gpa;
	private String email;
	private String gender;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gpa=" + gpa + ", email=" + email + ", gender=" + gender
				+ "]";
	}
	
	
	}


