package com.cagemini;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class Demo {
	
		public static void main(String[] args) 
	    { 
	        Set<String> ts 
	            = new TreeSet<String>(); 
	  
	        // Adding elements into the TreeSet 
	        // using add() 
	        ts.add("priya"); 
	        ts.add("riya"); 
	        ts.add("shriya"); 
	  
	        // Adding the duplicate 
	        // element 
	        ts.add("riya"); 
	  
	        // Displaying the TreeSet 
	        System.out.println(ts); 
	  
	        // Removing items from TreeSet 
	        // using remove() 
	        ts.remove("riya"); 
	        System.out.println("Set after removing "
	                           + "riya:" + ts); 
	  
	        // Iterating over Tree set items 
	        System.out.println("Iterating over set:"); 
	        Iterator<String> i = ts.iterator(); 
	        while (i.hasNext()) 
	            System.out.println(i.next()); 
	    } 

}
