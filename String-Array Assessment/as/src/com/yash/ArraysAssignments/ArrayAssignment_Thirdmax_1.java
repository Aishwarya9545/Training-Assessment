package com.yash.ArraysAssignments;

public class ArrayAssignment_Thirdmax_1 {
	public static void main(String[] args) {
//	1    WAP to find third maximum number from list of numbers.
		int[] a = { 1, 4, 66, 43, 45, 22, 44 };

		int temp = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}

		}
		System.out.println("Third maximum number is: " + a[2]);
	}
}
