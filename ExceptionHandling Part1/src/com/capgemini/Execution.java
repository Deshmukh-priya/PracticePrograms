package com.capgemini;

import java.util.Scanner;

public class Execution {
	
		 public static void main(String[] args) {
		 int p1,p2;
		 Scanner sc=new Scanner(System.in);
		 
		ThrowsExample th=new ThrowsExample();
		try
		{
		System.out.println("Enter the password");
		p1=sc.nextInt();
		System.out.println("Renter the password");
		p2=sc.nextInt();
		System.out.println("password matches"+th.passwordCheck(p1, p2));
		}
		catch( InvalidPasswordException ia)
		{
		System.out.println("Invalid password");
		}
		sc.close();

	}

}


