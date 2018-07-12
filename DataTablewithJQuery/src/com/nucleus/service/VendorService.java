package com.nucleus.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.nucleus.dao.VendorDAO;
import com.nucleus.entity.Vendor;

public class VendorService 
{
public ArrayList<Vendor> viewMethod() throws SQLException
{
	VendorDAO dao=new VendorDAO();
	ArrayList <Vendor> vendors=dao.viewAll();
	return vendors;
	
}
}
