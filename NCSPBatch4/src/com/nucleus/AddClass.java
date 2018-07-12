package com.nucleus;

public class AddClass implements Interface1,Interface2
{

	public static void main(String[] args) 
	{
	AddClass obj=new AddClass();
	obj.cal(10, 9);
	obj.greetMessage();
	System.out.println(Interface1.p);

	}

	@Override
	public void cal(int x, int y)
	{
		System.out.println("Sum is: "+(x+y));
		
	}

	@Override
	public void greetMessage() 
	{
		System.out.println("hello...");
	}

}
