package com.yash.exceptions;

public class Employee {

	private int eid;
	private String email;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) throws EmailNotValidException {
		String e="\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b";
		if(email.matches(e)) {
			System.out.println("Valid Email");
			this.email = email;
			
		}
		else {
			throw new EmailNotValidException("Email not valid");
		}
		
	}
	
}
