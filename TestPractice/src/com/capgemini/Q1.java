package com.capgemini;

public class Q1
{
	@SuppressWarnings("finally")
	public int luckyNumber(int seed)
	{
		if(seed > 10) return seed%10;
		int x = 0;
		try
		{
			if(seed%2 == 0) throw new Exception("No Even no.");
			else return x;
		}
		catch(Exception e)
		{
			return 3;
		}
		finally
		{
			return 7;
		}
	}
	public static void main(String args[])
	{
		int amount = 100, seed = 6;
		switch( new Q1().luckyNumber(6) )
		{
			case 3: amount = amount * 2;
			case 7: amount = amount * 2;
			case 6: amount = amount + amount;
 			default :
		}
		System.out.println(amount);
	}
}
/*When you pass 6 to luckyNumber(),
 and if the condition is satisfied then the catch block handles the exception and as a result 3 is return
 But finally is present in try catch block so the finally statement also gets executed first.
 In switch case there is no break and therefore it works for both 3 and 7. 
 */
