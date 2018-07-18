package com.nucleus.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nucleus.pojo.Customer;
import com.nucleus.service.ServiceCustomer;

/**
 * Servlet implementation class CustomerServlet
 */
@WebServlet("/CustomerServlet")
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		ServiceCustomer sc=new ServiceCustomer();
		String action=request.getParameter("action");
		if(action.equals("new"))
		{
			HttpSession session=request.getSession(false);
			if(session.getAttribute("name")!=null)
			{
				out.println("Welcome "+session.getAttribute("name"));
				RequestDispatcher rd=request.getRequestDispatcher("Menu.jsp");
				rd.include(request, response);
			}
			else
			{
				out.println("Please login");
				RequestDispatcher rd=request.getRequestDispatcher("login.html");
				rd.include(request, response);
			}
		RequestDispatcher rd=null;
		String code=request.getParameter("code");
		String name=request.getParameter("name");
		String AD1=request.getParameter("AD1");
		String AD2=request.getParameter("AD2");
		String pincode=request.getParameter("pincode");
		String email=request.getParameter("email");
		String contact=request.getParameter("contact");
		String cperson=request.getParameter("cperson");
		String record=request.getParameter("record");
		String flag=request.getParameter("flag");
		String createby=request.getParameter("createby");
		String createdate=request.getParameter("createdate");
		Customer customer=new Customer();
		customer.setCode(code);
		customer.setName(name);
		customer.setAd1(AD1);
		customer.setCustAd2(AD2);
		customer.setCustPinCode(pincode);
		customer.setCustEmail(email);
		customer.setContact(contact);
		customer.setCustPrimaryContactPerson(cperson);
		customer.setCustRecordStatus(record);
		customer.setCustFlag(flag);
		customer.setCustCreatedBy(createby);
		customer.setCustCreateDate(createdate);
		System.out.println(code);
		int valid=sc.validId(code);
		if(valid==1)
		{
			int isInserted=sc.insert(customer);
			if(isInserted>0)
			{
				out=response.getWriter();
				out.println("Data Inserted Successfully");
				rd=request.getRequestDispatcher("Menu.jsp");
				rd.include(request,response);
				
			}
			else
			{
				out=response.getWriter();
				out.println("Data does not Inserted");
				rd=request.getRequestDispatcher("New.jsp");
				rd.include(request,response);
			}
		}
		else
		{
			out=response.getWriter();
			out.println("Customer code should be unique");
			rd=request.getRequestDispatcher("New.jsp");
			rd.include(request,response);
		}

	}
		else if(action.equals("All"))
		{
			ArrayList<Customer> cust=new ArrayList<Customer>();
			cust=sc.viewAll();
			System.out.println(cust.size());
			request.setAttribute("customers",cust);
			RequestDispatcher rd=request.getRequestDispatcher("All.jsp");
		 	rd.include(request, response);
			
			
		}
		else if(action.equals("single"))
		{
			Customer customer=new Customer();
			String code=request.getParameter("code");
			customer=sc.view(code);
			request.setAttribute("customers",customer);
			RequestDispatcher rd=request.getRequestDispatcher("Single.jsp");
		 	rd.include(request, response);
			
			
		}
		else if(action.equals("delete"))
		{
			//Customer customer=new Customer();
			String code=request.getParameter("code");
			int delete=sc.delete(code);
			RequestDispatcher rd=null;
			//request.setAttribute("customers",customer);
			if(delete>0)
			{
				out=response.getWriter();
				out.println("Data Deleted Successfully");
				rd=request.getRequestDispatcher("Delete.jsp");
				rd.include(request,response);
				
			}
			else
			{
				out=response.getWriter();
				out.println("Data does not Deleted");
				rd=request.getRequestDispatcher("New.jsp");
				rd.include(request,response);
				//out.close();
			}
			/*RequestDispatcher rd=request.getRequestDispatcher("Delete.jsp");
		 	rd.include(request, response);
			*/
			
		}
	}
		
		 
	}


