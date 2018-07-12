package com.nucleus;

public class Department 
{
int depId;
String depName;
Department(int depId,String depName)
{
this.depId=depId;
this.depName=depName;
}
Department(int depId)
{
	this.depId=depId;
}
Department()
{
	System.out.println("No arg....");
}
void show()
{
	System.out.println("Departments details: "+ depId+ " "+depName);
}
}
