package com.yash.ArraysAssignments;

public class ArrayAssignment_AccTolength_8 {
	public static void main(String[] args) {
//	 You are having array of strings. 
// 	 Now you have to arrange strings in array on the basis of the length of each string. 
//	 Smallest string will be first and so on. 
				
		
		String[] str = { "bb", "aaa", "c", "ddddyyyyyyyyyyy" };

		String str2;

		for (int i = 0; i < str.length; i++) {

			for (int j = 0; j < str.length; j++) {

				// System.out.println(str[i]);

				if (str[i].length() < str[j].length()) {
					str2 = str[i];
					str[i] = str[j];
					str[j] = str2;

				}

			}

		}
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}

	}
}
