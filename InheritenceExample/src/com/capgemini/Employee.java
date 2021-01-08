package com.capgemini;
class Data{
	int a=100;
	Data(){
		super();
		System.out.println("Constructor");
	}
	Data(int a){
		this.a=a;
		System.out.println(a);
	}
	 void showData() {
		 int salary=1000;
		 String name="Riya";
		 System.out.println("salary is : "+salary+" and name is :"+name);
	 }
}

class Developer extends Data{
	Developer(){
		super(20);
	}
	     @Override
	     void showData() {
		 int salary=2000;
		 String dname="Helly";
		 System.out.println("salary is : "+salary+" and name is :"+dname);
		 super.showData();
		 

	 }
 }
 public class Employee {
		public static void main(String args[]) {
			Developer d=new Developer();
			d.showData();
			
			//Data data=new Data();
			//data.showData();
			
			
			
		}
	     
	}
 
 
