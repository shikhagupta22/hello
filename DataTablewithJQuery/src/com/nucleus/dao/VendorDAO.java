package com.nucleus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.nucleus.connection.VendorConnection;
import com.nucleus.entity.Vendor;

public class VendorDAO 
{
	Connection conn=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
public ArrayList<Vendor> viewAll() throws SQLException
{
	ArrayList <Vendor> vendors=new ArrayList<Vendor>();
	VendorConnection vc=new VendorConnection();
	conn=vc.getConn();
	ps=conn.prepareStatement("select vId,vName from vendors");
	rs=ps.executeQuery();
	while(rs.next())
	{
		Vendor v=new Vendor();
		v.setvId(rs.getInt(1));
		v.setvName(rs.getString(2));
		vendors.add(v);
	}
	return vendors;
	
}
}
