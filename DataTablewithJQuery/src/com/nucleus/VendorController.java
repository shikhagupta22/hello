package com.nucleus;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nucleus.entity.Vendor;
import com.nucleus.service.VendorService;

/**
 * Servlet implementation class VendorController
 */
public class VendorController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
	   VendorService service=new VendorService();
	   try
	   {
		ArrayList<Vendor> vendors=service.viewMethod();
		request.setAttribute("vendors", vendors);
		RequestDispatcher rd=request.getRequestDispatcher("viewall.jsp");
		rd.forward(request, response);
	    } 
	   catch (SQLException e)
	   {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
}
