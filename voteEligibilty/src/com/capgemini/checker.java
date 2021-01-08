package com.capgemini;

import java.util.Scanner;

public class checker {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the age of person");
	    int age = sc.nextInt();
		System.out.println("Enter the name of person");
		String name=sc.next();
		
		PersonData p=new PersonData();
		
		p.setAge(age);
		p.setName(name);
		
		if(age>18) {
			System.out.println(p.getName()+" is eligible to vote");
		}
		else {
			
		}
		sc.close();
		
	}

}
