package com.yash.ArraysAssignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayAssignment_AddElements_3 {
	public static void main(String[] args) {
//	 WAP to create a dynamic array. Dynamic Array means when user want to input 
//	the number more than size of array it will increase the size of array without throwing exception.
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array  ");
		int size = sc.nextInt();
		String str[] = new String[size];

		System.out.println("Enter elements of the array (Strings)  ");

		for (int i = 0; i < size; i++) {
			str[i] = sc.next();
		}

		System.out.println(Arrays.toString(str));

		ArrayList<String> myList = new ArrayList<String>(Arrays.asList(str));
		
		System.out.println("How much elements you want to added:");
		int n = sc.nextInt();
		
		System.out.println("Enter the String type element that is to be added:");
		for (int i = 0; i < n; i++) {
			String element = sc.next();
			myList.add(element);
			
		}
		str = myList.toArray(str);

		System.out.println(Arrays.toString(str));

	}
}
