package com.nucleus;

public abstract class Bank 
{
	float iRate;
	Bank(float iRate)
	{
		this.iRate=iRate;
	}
abstract String getName();
void getRate()
{
	System.out.println("bank interest rate: "+iRate);
}
}
