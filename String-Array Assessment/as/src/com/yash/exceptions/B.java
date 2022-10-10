package com.yash.exceptions;

class A {
int x;
}

public class B extends A {
	int y;
	public static void main(String[] args) {

	//	A a1 = new B();
		B a1=new B();
		System.out.println(a1.x);
		A b1 = (A) a1;
	}

}
