/**
 * 
 */
package com.nucleus;

import java.util.Scanner;

/**
 * @author kausar.khan
 *
 */
public class TestException {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int salary=0;
		int bonus=0;
		int tot=0;
		System.out.println("enter  salary+bonus");
		Scanner sc=new Scanner(System.in);
		salary=sc.nextInt();
		bonus=sc.nextInt();
		try
		{
			tot=salary+bonus;
			if(tot>25000)
			{
				throw new UserException("exception raised...");
			}
		}
catch(UserException e)
{
	System.out.println(e);
	e.showErrorMessage();e.printStackTrace();
	}
	}
}
