package com.yash.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee1 {
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

	public Employee1(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

}

public class ArrayListDemo2 {
	public static void main(String[] args) {
		
		List<Employee1> list = new ArrayList<>();
		list.add(new Employee1(11, "Shubham", 23));
		list.add(new Employee1(12, "Abhilash", 25));
		list.add(new Employee1(13, "Ram", 24));
		list.add(new Employee1(14, "Shubham", 29));
		
//		Collections.sort(list,new NameComparator());
//		
//		for (Employee1 e : list) {
//			
//			System.out.println(e.id+" "+e.name+" "+e.age);
//		}
		
		// anonymous inner class implementations...
		Collections.sort(list, new Comparator<Employee1>() {

			@Override
			public int compare(Employee1 o1, Employee1 o2) {
				
				return o1.age-o2.age;
			}
		});
		
		System.out.println(list.get(list.size()-1).getAge());
		
		
		
		
		
		
		
		
		
		
//		List<String> list = new ArrayList<>();
//
//		list.add("shubham");
//		list.add("ram");
//		list.add("anil");
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter name");
//		if (list.contains(sc.next())) {
//			System.out.println("present");
//		} else {
//			System.out.println("Absent");
//		}

	}
}
