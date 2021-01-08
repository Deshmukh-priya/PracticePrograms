package com.capgemini;

public class ThrowsExample {
	

		public int passwordCheck(int password,int password1)throws InvalidPasswordException
		{
		if(password!=password1)
		{
		throw new InvalidPasswordException();
		}
		else
		{
		System.out.println("Both password matches");
		
		}
		return 0;
    }
  }

