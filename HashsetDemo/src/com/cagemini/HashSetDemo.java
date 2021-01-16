package com.cagemini;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) 
    { 
        Set<String> h = new HashSet<String>(); 
  
        h.add("priya"); 
        h.add("riya"); 
        h.add("shriya"); 
  
        // Adding the duplicate 
        
        h.add("riya"); 
  
  
        // Displaying the HashSet 
        System.out.println(h); 
        
        Iterator<String> i=h.iterator();
        while(i.hasNext()) {
        	System.out.println(i.next());
        }
  
}
}
