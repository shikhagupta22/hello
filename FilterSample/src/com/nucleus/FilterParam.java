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
 * Servlet Filter implementation class FilterParam
 */
public class FilterParam implements Filter {

    String user,pass;
    public FilterParam() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		PrintWriter p=response.getWriter();
		System.out.println(user+" "+pass);
		if(user.equalsIgnoreCase((request.getParameter("u")) )&&( pass.equalsIgnoreCase(request.getParameter("p"))))
		{
			chain.doFilter(request, response);
		}
		else
		{
			p.print("Wrong username or password..");
			RequestDispatcher rd=request.getRequestDispatcher("Login.html");
			rd.include(request, response);
		}
	
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException 
	{
		user=fConfig.getInitParameter("username");
		pass=fConfig.getInitParameter("password");
	}

}
