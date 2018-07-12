package com.nucleus;

public class OracleConnection implements ConnectionI
{

	@Override
	public void getConnection()
	{
		System.out.println("Oracle Connection... connected");
		
	}
}
