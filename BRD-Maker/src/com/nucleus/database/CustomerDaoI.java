package com.nucleus.database;

import java.util.ArrayList;

import com.nucleus.pojo.Customer;

public interface CustomerDaoI 
{
	//public int insert();
	public ArrayList<Customer> viewAll();
	public Customer view(String code);
	public int update();
	public int delete(String code);
	public boolean validId(String id);
	public int insert(Customer customer);

}
