package com.yash.oops;

public class Employee {
	private int age;
	private String ename;
	private String department;
	private String email;
	public Employee() {
		
	}
	
	public Employee(int age, String ename, String department, String email) {
		super();
		this.age = age;
		this.ename = ename;
		this.department = department;
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 20 && age < 60) {
			this.age = age;
		} else {
			this.age = 0;
		}

	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		if (ename.equals("ABC")) {
			this.ename = ename;
		} else {
			this.ename = "";
		}

	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [age=" + age + ", ename=" + ename + ", department=" + department + ", email=" + email + "]";
	}

	

}
