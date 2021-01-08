package com.capgemini;

public class EceptionHandling {
 public static void main(String args[]) {
	 int a=10;
	 int b = 0;
	 try {
	  int result=a/b;
	  System.out.println(result);
 }
	 catch(ArithmeticException np) {
	 System.out.println("error");
	 System.out.println(np.getMessage());
	 
 }
	 System.out.println("heyy");
	 }
}
