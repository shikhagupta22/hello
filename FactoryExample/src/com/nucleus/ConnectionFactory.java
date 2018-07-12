package com.nucleus;

public class ConnectionFactory 
{
static ConnectionI getConnectionMethod(String str)
{
	if(str.equalsIgnoreCase("oracle"))
	{
		return new OracleConnection();
	}
	else if(str.equalsIgnoreCase("mysql"))
	{
		return new MySQL();
	}
	return null;
}
}
