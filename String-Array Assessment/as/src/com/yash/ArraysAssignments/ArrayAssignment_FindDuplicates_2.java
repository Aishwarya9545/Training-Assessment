package com.yash.ArraysAssignments;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayAssignment_FindDuplicates_2 {
	public static void main(String[] args) {
//	2    WAP to find duplicate numbers and there counting from list of numbers.
		int arr[] = { 4, 5, 6, 7, 8, 7, 3, 4, 5, 3, 5 };
		int count=1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					System.out.println(arr[i]+" : "+count);
				}

			}

		}
//		by using map interface
		
		
//		Map<Integer, Integer> map = new HashMap();
//		List<Integer> list = Arrays.asList(12, 23, 34, 45, 23, 34, 23, 23);
//		list.stream().distinct().forEach(System.out::println);
//		for (Integer i : list) {
//
//			if (map.containsKey(i)) {
//				map.put(i, map.get(i) + 1);
//			} else {
//				map.put(i, 1);
//			}
//		}
//		System.out.println(map);
//		
//		map.entrySet().stream().filter(n->n.getValue()>1).forEach(System.out::println);

	}
}
