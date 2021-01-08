package com.capgemini;

import java.util.Scanner;

public class Practice {
	void printTable(int a) {
		int i;
		for(i=1;i<=10;i++) {
		int table=a*i;
		System.out.println(a+" "+"x"+" "+i+"="+table);
		}
	}
	 static void prime(int a) {
	  int i =0;
      int num =0;
      String  primeNumbers = "";

      for (i = 1; i <= a; i++)         
      { 		  	  
         int counter=0; 	  
         for(num =i; num>=1; num--)
	  {
            if(i%num==0)
	     {
		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {

	     primeNumbers = primeNumbers + i + " ";
	  }	
    }
      System.out.println("Prime numbers from 1 to "+a+" are :");
      System.out.println(primeNumbers);
}
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		Practice p=new Practice();
		System.out.println("enter the number");
		int num=sc.nextInt();
		p.printTable(num);
		System.out.println("enter the number");
		int num1=sc.nextInt();
		prime(num1);
		sc.close();
	}
	

}
