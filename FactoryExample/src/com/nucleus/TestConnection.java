package com.nucleus;

public class TestConnection {

	public static void main(String[] args)
	{
	ConnectionI conn=ConnectionFactory.getConnectionMethod("oracle");
	conn.getConnection();
	}

}
