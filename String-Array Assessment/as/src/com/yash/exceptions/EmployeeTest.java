package com.yash.exceptions;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter email:");
		Employee e=new Employee();
		try {
			e.setEmail(sc.next());
		} catch (EmailNotValidException e1) {
			System.out.println(e1.getMessage());
		}
	}
}
