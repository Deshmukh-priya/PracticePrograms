package collectionSetExample;

import java.util.*;
 public class Example {
 public static void main(String[] args) {
	 TreeSet<Integer> set=new TreeSet<>();
	 set.add(2);
	 set.add(1);
	 System.out.println(set);
	 
	 HashSet<Integer> hs=new HashSet<>();
	 hs.add(2);
	 hs.add(1);
	 System.out.println(hs);
	 
	 SortedSet<Integer> ts= new TreeSet<Integer>(); 
	 ts.add(2);
	 ts.add(1);
	 System.out.println(ts);
	 
	 LinkedList<Integer> obj =new LinkedList<>();
	 obj.add(2);
	 obj.add(1);
	 System.out.println(obj);
	 

 }
 }

/* import java.util.*;
 public class Example {
 public static void main(String[] args) {
 // insert code here
 set.add(new integer(2));
 set.add(new integer(l));
 System.out.println(set);
 }
 }
Which code, inserted at line 4, guarantees that this program will
output [1, 2]?

 
A. Set set = new TreeSet();   sorting in ascending order
B. Set set = new HashSet();     does not maintain any order
C. Set set = new SortedSet();    keeps the element in natural order.
D. List set = new SortedList();  does not exist in java
E. Set set = new LinkedHashSet(); insertion order is maintain */

