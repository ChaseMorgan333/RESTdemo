package com.hcc.example.RESTdemo;

public class Greeting {

	private String name;
	private boolean student;
	
	

	public Greeting(String name, boolean student) {
		this.name = name;
		this.student = student;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isStudent() {
		return student;
	}

	public void setStudent(boolean student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Greeting [name=" + name + ", student=" + student + "]";
	}
	
	
	
}
