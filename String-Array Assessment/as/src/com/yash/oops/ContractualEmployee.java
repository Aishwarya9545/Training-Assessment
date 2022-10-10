package com.yash.oops;

public class ContractualEmployee extends Employee {
	private int dailyWage;
	private int periodOfContract;
	public ContractualEmployee() {
		// TODO Auto-generated constructor stub
	}
	
	public ContractualEmployee(int dailyWage, int periodOfContract,int age, String ename, String department, String email) {
		super(age,ename,department,email);
		this.dailyWage = dailyWage;
		this.periodOfContract = periodOfContract;
	}

	public int getDailyWage() {
		return dailyWage;
	}
	public void setDailyWage(int dailyWage) {
		this.dailyWage = dailyWage;
	}
	public int getPeriodOfContract() {
		return periodOfContract;
	}
	public void setPeriodOfContract(int periodOfContract) {
		this.periodOfContract = periodOfContract;
	}
	

}
