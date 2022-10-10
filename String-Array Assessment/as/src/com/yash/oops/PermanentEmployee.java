package com.yash.oops;

import java.sql.Date;

public class PermanentEmployee extends Employee{
	private int salary;
	private Date doj;
	public PermanentEmployee() {
		// TODO Auto-generated constructor stub
	}
	
	public PermanentEmployee(int salary, Date doj,int age, String ename, String department, String email) {
		super(age,ename,department,email);
		this.salary = salary;
		this.doj = doj;
	}
	public PermanentEmployee(int salary,int age, String ename, String department, String email) {
	this(salary, null, age, ename, department, email);
		
		
	}

	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}

}
