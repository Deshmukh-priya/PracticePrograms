package Menu.java;
import java.util.*;
public class Menu {
	 public static void main(String[] args) 
	    {
	        int num1, num2, option, add, sub, mul;
	        double div;
	        Scanner s = new Scanner(System.in);
	        
	        while(true)
	        {
	        	System.out.println("Enter your choice:");
	            System.out.println(" 1 for addition");
	            System.out.println(" 2 for subtraction");
	            System.out.println(" 3 for multiplication");
	            System.out.println(" 4 for division");
	            System.out.println(" 5 to Exit");
	            option = s.nextInt();
	            System.out.print("Enter first number:");
		        num1 = s.nextInt();
		        System.out.print("Enter second number:");
		        num2 = s.nextInt();
	            switch(option)
	            {
	                case 1:
	                	
	                add = num1 + num2;
	                System.out.println("Result:"+add);
	                System.out.println('\n');
	                break;
	 
	                case 2:
	                sub = num1 - num2;
	                System.out.println("Result:"+sub);
	                System.out.println('\n');
	                break;
	 
	                case 3:
	                mul = num1 * num2;
	                System.out.println("Result:"+mul);
	                System.out.println('\n');
	                break;
	 
	                case 4:
	                div = (double)num1 / num2;
	                System.out.println("Result:"+div);
	                System.out.println('\n');
	                break;    
	 
	                case 5:
	                System.exit(0);
	                
	                default:System.out.println("You have entered wrong value");
	            }
	        }

	    }
	 }
