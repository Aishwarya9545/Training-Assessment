package com.yash.ArraysAssignments;

public class ArrayAssignment_AccUnitPlaces_10 {
	public static void main(String[] args) {
		 int arr[] = {14, 100, 99,12,133};
	        int temp;
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = i+1; j < arr.length; j++) {
	                if (arr[i] % 10 > arr[j] % 10) {
	                    temp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = temp;
	                }
	            }
	            System.out.print(arr[i]+"  ");
	            
	        }
	        for (int i = 0; i < arr.length; i++) {
	            System.out.println(arr[i]);
	            
	        }
	}
}
