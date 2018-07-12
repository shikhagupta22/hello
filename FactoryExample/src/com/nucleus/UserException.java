package com.nucleus;

public class UserException extends Exception
{
String message;
UserException(String message)
{
	this.message=message;
}
@Override
public String toString() {
	return "UserException [message=" + message + "]";
}
void showErrorMessage()
{
	System.out.println("User exception class...");
}
}
