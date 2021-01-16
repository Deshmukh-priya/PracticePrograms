package com.cagemini;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashDemo {
	public static void main(String[] args) 
    { 
        Set<Integer> lh = new LinkedHashSet<Integer>(); 
  
        
	lh.add(1); 
    lh.add(5); 
    lh.add(4); 

    // Adding the duplicate 
    // element 
    lh.add(4); 

    // Displaying the LinkedHashSet 
    System.out.println(lh); 

    

    // Iterating over linked hash set items 
    System.out.println("Iterating over set:"); 
    Iterator<Integer> i = lh.iterator(); 
    while (i.hasNext()) 
        System.out.println(i.next()); 
}
}
