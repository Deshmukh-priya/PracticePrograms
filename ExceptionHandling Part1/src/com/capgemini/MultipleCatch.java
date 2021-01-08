package com.capgemini;

public class MultipleCatch {
public static void main(String args[]) {
	int a=10;
	int b=0;
	int result;
	int []array= {1,2,3};
try {
	result=a/b;
	System.out.println(result);
	System.out.println(array[3]);
}
catch(ArithmeticException ae) {
	System.out.println("division by zero"); 
}
catch(IndexOutOfBoundsException be) {
	System.out.println("Index out of bound"); 
}
finally {
	System.out.println("final block"); 
}
System.out.println("last line in main");
}
}
