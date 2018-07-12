package com.nucleus;

public class Car extends Vehicle
{
int noOfT;

Car(String vName,String modelNo,int noOfT)
{
	super(vName,modelNo);
	System.out.println("Car constructor called");
	this.noOfT=noOfT;

}

void show2()
{
	System.out.println(noOfT);
}
/*void comment()
{
	System.out.println("Inside child Class");
}*/
}
