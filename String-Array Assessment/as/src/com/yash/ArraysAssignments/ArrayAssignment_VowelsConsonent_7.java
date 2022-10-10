package com.yash.ArraysAssignments;

public class ArrayAssignment_VowelsConsonent_7 {
	public static void main(String[] args) {
//    You are given a sequence of Character in the form of Array. 
// 	  Now you have to put all vowels and consonants together in the array.
		
		 char a[]= {'y','a','s','h','t','e','c'};
		    System.out.println("vowels are ");
		    for(int i=0;i<a.length;i++)
		    {
		        if(a[i]=='a' || a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u')
		        {
		            System.out.print(a[i]+" ");
		           
		        }
		    }
		    System.out.println();
		    System.out.println("consonants are ");
		    for(int i=0;i<a.length;i++)
		    {
		        if(a[i]!='a' && a[i]!='e' && a[i]!='i' && a[i]!='o' && a[i]!='u')
		        {
		            System.out.print(a[i]+" ");
		        }
		    }
	}
}
