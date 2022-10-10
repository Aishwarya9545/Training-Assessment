package com.yash.ArraysAssignments;

public class ArrayAssignment_Removepalindrome_9 {
	public static void main(String[] args) {
//	   WAP to remove the String which is not palindrome string from the array of String.
		String[] a = { "abba", "ajay", "tushar", "sdds", "sumit", "mayur", "akshay" };
		for (int i = 0; i < a.length; i++) {
			if (a[i].equalsIgnoreCase(isPalindrome(a[i]))) {
				System.out.print(a[i] + " ");
			}
		}
	}

	public static String isPalindrome(String reverse) {
		String temp = reverse;
		String rev = "";
		for (int i = temp.length() - 1; i >= 0; i--) {
			rev = rev + temp.charAt(i);
		}
		return rev;
	}
}