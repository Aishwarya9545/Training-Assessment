package com.yash.ArraysAssignments;

import java.util.Arrays;

public class ArrayAssignment_HalfAscenDecen_5 {
	public static void main(String[] args) {
//	 Suppose that you are having an array of size N. 
//	 now your task is to sort the half array that is from 0 to N/2 in ascending order 
//	 and N/2+1 to N in descending order. 
				
		int[] a = { 1,4,6,9,3,5,2,10,12,14,11,13 };

		int temp = 0;
		int size = a.length / 2;
		for (int i = 0; i <= size; i++) {
			for (int j = 0; j <= size; j++) {
				if (a[i] < a[j]) {

					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}

		}
		for (int i = size + 1; i < a.length; i++) {
			for (int j = size + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			
		}
		System.out.print(Arrays.toString(a));
	}
}
