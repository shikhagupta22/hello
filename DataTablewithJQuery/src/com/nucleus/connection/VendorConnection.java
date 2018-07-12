package com.nucleus.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class VendorConnection 
{
private Connection conn=null;
public Connection getConn()
{
	try {
	DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
	
		conn=DriverManager.getConnection("jdbc:oracle:thin:@10.1.50.198:1521:orcl","sh","sh");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return conn;
	
}
}
