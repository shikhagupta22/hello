package com.nucleus;

public class MySQL implements ConnectionI
{

	@Override
	public void getConnection()
	{
	System.out.println("MySQL connection... connected");
	}

}
