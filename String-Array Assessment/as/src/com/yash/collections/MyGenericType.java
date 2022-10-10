package com.yash.collections;

class Employee{
	int id;
	String name;
	int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public Employee(Employee employee, Employee employee2) {
		// TODO Auto-generated constructor stub
	}
	
}

public class MyGenericType<T> {
	T a;
	T b;
	
	public MyGenericType(T a,T b){
		this.a=a;
		this.b=b;
	}
	public boolean isValidEqual() {
		return a.equals(b);
	}
	public static void main(String[] args) {
		MyGenericType<String> m=new MyGenericType<String>("abc", "poe");
		System.out.println(m.isValidEqual());
		
		MyGenericType<Integer> m1=new MyGenericType<Integer>(12, 12);
		System.out.println(m1.isValidEqual());
		
		
		Employee e=new Employee(new Employee(1, "asd", 24),new Employee(1, "asd", 24));
		
	}

}
