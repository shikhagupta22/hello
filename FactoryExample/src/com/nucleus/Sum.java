package com.nucleus;

public class Sum {

	public static void main(String[] args) 
	{
		try
		{
			//sensitve code
		int x=9/2;
		System.out.println("value of x: "+x);
		}
		catch(ArithmeticException obj)
		{
		System.out.println("Exception handled: "+obj);	
		//obj.printStackTrace();
		}
		finally
		{
			System.out.println("inside finally block..");
		}
		System.out.println("end of code..");

	}

}
