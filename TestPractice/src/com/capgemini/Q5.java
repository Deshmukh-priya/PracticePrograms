package com.capgemini;

public class Q5
{
 static String s = "";
 public static void m0(int a, int b)
 {
   s +=a;
   m2();
   m1(b);
 }
 public static void m1(int i)
 {
   s += i;
 }
 public static void m2()
 {
  throw new NullPointerException("aa");
 }
 public static void m()
 {
   m0(1, 2);
   m1(3);
 }
 public static void main(String args[])
 {
   try
   {
    m();
   }
   catch(Exception e){ }
   System.out.println(s);
 }
}


/*Okay. What happens is m() is called in the main. m() calls m0. m0 calls m2(). m2() throws an exception. Since it is not in a try/catch block, control reverts back to m0. m0() is not in a try/catch block, so control reverts back m(). m() is not in a try/catch block, so control reverts back to the main(), which called m(). Since it is in a try/catch block, the exception is caught. After the catch, the println is executed. s was set to equal ++a, which is 1, so 1 is printed.*/