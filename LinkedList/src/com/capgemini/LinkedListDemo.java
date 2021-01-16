package com.capgemini;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListDemo {

	public static void main(String[] args) {
	LinkedList<Integer> obj =new LinkedList<>();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the 4 values");
	
	for(int i=0;i<=4;i++) {
	   
	   obj.add(sc.nextInt());	
	}
	System.out.println("Advance forloop");
	for(Integer i:obj) {
		System.out.println(i);
	}
	System.out.println("using Index");
	for(int i=0;i<obj.size();i++)
	{
	System.out.println(obj.get(i));
	}
	System.out.println("using iterator");
	Iterator i=obj.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	System.out.println("using list iterator");
	ListIterator list=obj.listIterator();
	while(list.hasNext()) {
		System.out.println(list.next());
	}

	}

}
