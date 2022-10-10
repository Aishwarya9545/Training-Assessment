package com.yash.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
public static void main(String[] args) {
	List<String> list=new ArrayList<>();
	list.add("vyug");list.add("vtfyug");list.add("yugho");list.add("bjhi");
	for (String string : list) {
		System.out.println(string);
	}
	System.out.println("===========================");
	Iterator<String> itr = list.iterator();
	
	while (itr.hasNext()) {
		String next = itr.next();
		char[] cs = next.toCharArray();
		for (int i = 0; i < cs.length; i++) {
			
			if(cs[0]=='n') {
				itr.remove();
			}
		}
		System.out.println(next);
		
	}
//	List<String> l=new ArrayList<>();
//	l.add("nvyug");l.add("vtfyug");l.add("nyugho");l.add("bjhi");
//	for (String string : l) {
//		boolean startsWith = string.startsWith("n");
//		System.out.println(startsWith);
//	}
}
}
