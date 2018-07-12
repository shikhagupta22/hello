package com.nucleus;
class T
{
	T()
	{
		System.out.println("Constructor called");
	}
	static
	{
		System.out.println("Static block executed");
	}
	{
		System.out.println("Initialization block...");
	}
}
public class BlockExample {

	public static void main(String[] args) 
	{
	 T ob=new T();
	 T ob1=new T();
	}

}
