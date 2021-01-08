package com.capgemini;

public class Q8
{
   public static void main(String args[])
   {
      try{
         m1();
      }catch(IndexOutOfBoundsException e){
         System.out.println("1");
         throw new NullPointerException();
      }catch(NullPointerException e){
         System.out.println("2");
         return;
      }catch (Exception e) {
         System.out.println("3");
      }finally{
         System.out.println("4");
      }
      System.out.println("END");
   }
   // IndexOutOfBoundsException is a subclass of RuntimeException.
   static void m1()
   {
      System.out.println("m1 Starts");
      throw new IndexOutOfBoundsException( "Big Bang " );
   }
}

/*The IndexOutOfBoundsException is handled by the first catch block. Inside this block, a new NullPointerException is thrown. As this exception is not thrown inside the try block, it will not be caught by any of the remaining catch blocks. It will actually be sent to the caller of the main() method after the finally block is executed. */