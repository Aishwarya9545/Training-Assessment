package com.yash.collections;

class Node<T>{
	T data;
	Node<T> next;
	
	Node(T data){
		this.data=data;
		this.next=next;
	}
}
public class MyList<T> {

	Node<T> start;
	public MyList() {
		start=null;
	}
	public void addInStart(T data) {
		Node<T> newnode=new Node(data);
		if(start!=null) {
			newnode.next=start;
			
		}
	}
	
}
