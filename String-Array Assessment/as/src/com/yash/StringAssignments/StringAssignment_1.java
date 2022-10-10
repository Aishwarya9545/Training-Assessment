package com.yash.StringAssignments;

public class StringAssignment_1 {
	public static void main(String[] args) {
		// 1 Create a program in which two string is input by the user and after that
		// user will enter index in first string where we want to insert the second
		// string
		// and insert the second string at that index and create a new string .

//	2   WAP to print the all alphabets of string in ascending and descending order.

		String str = "shubham";
		char[] cs = str.toCharArray();
		char temp = 0;
		for (int i = 0; i < cs.length; i++) {
			for (int j = 0; j < cs.length; j++) {
				if (cs[i] < cs[j]) { // for ascending order
//			if (cs[i] > cs[j]) { // for decending order
					temp = cs[i];
					cs[i] = cs[j];
					cs[j] = temp;
				}

			}

		}
		for (int i = 0; i < cs.length; i++) {
			System.out.print(cs[i]);

		}
	}

}
