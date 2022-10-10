package com.yash.StringAssignments;

public class StringAssignment_3 {
	public static void main(String[] args) {

//	4   WAP to print the number of alphabets repeated in the given string.

		String s = "aabbccddeetyu";

		char[] cs = s.toCharArray();
//		int count = 0;
//
//		char[] cs = s.toCharArray();
//
//		for (int i = 0; i < cs.length - 1; i++) {
//			for (int j = i + 1; j < cs.length; j++) {
//
//				if (cs[i] == cs[j]) {
//					count++;
//				}
//				break;
//			}
//
//		}
//		System.out.println(count);
//

		for (int i = 0; i < cs.length; i++) {
			for (int j = i + 1; j < cs.length; j++) {
				if (cs[i] == cs[j]) {

					System.out.println(cs[i]);
				}
			}

		}
	}

}
