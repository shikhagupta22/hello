package com.nucleus;

public class Address
{
String city;
String state;
String zipCode;
Address(String c,String s,String z)
{
	this.city=c;
	this.state=s;
	this.zipCode=z;
}
void showAddress()
{
	System.out.println("city: "+city+" state: "+state+" zipcode: "+zipCode);
}
}
