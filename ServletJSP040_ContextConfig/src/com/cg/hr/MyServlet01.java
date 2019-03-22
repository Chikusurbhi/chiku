package com.cg.hr;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*the context parameters are accessible to all web components in an application
 * Get them from ServletContext
 * Servlets,JSP,Filters,Listeners
 * Declare common values like companyName,URLs of other application
 * 
 * The config parameters
 * Get them from ServletConfig(One object per Servlet/JSP)
 * Accessible to only a parent web component.
 * Not Accessible to any other web component.
 * 
 */
//@WebServlet("/MyServlet01")
public class MyServlet01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext ctx= getServletContext();
		String companyName=ctx.getInitParameter("companyName");
		System.out.println(companyName);
		
		ServletConfig config=getServletConfig();//Generic Servlet
		String pageTitle=config.getInitParameter("pageTitle");
		System.out.println("pageTitle"+pageTitle);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
