package com.yash.oops;

public class StaticMethod_variables {
	
	static String  s="XYZ";
	String s1="ABC";
	
	public static void m1() {
		StaticMethod_variables ss=new StaticMethod_variables();
		
		System.out.println(StaticMethod_variables.s);
		System.out.println(ss.s1);
		
	}
	public static void main(String[] args) {
		StaticMethod_variables.m1();
	}

}
