package com.nucleus;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class CheckLogin
 */
public class CheckLogin implements Filter {

    
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		String u=request.getParameter("user");
		String pass=request.getParameter("pass");
		PrintWriter p=response.getWriter();
	if(u.equalsIgnoreCase("admin") && pass.equalsIgnoreCase("admin"))
	{
		//p.print("test");
		System.out.println("Preprocessing");
		System.out.println(u+" "+pass);
	}
/*	else
	{
		RequestDispatcher rd=request.getRequestDispatcher("Login.html");
		p.print("Enter valid details");
		rd.include(request, response);
	}*/
	//	System.out.println("preprocessing :"+u);
	
	chain.doFilter(request, response);
	System.out.println("postprocessing");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException
	{
	
	}

}
