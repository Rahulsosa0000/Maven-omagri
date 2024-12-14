package com.mavenDemo.CustomJar;

import java.util.Date;

public class Employee {

	private String name;
	private int age;

	private int Salary;

	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(String name, int age,  int salary) {
		super();
		this.name = name;
		this.age = age;
	
		Salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	



	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", Salary=" + Salary + "]";
	}
	
	

}