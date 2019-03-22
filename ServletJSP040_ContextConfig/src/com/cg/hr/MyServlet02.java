package com.cg.hr;

import java.io.IOException;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MyServlet02")
public class MyServlet02 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletContext ctx= getServletContext();
		String companyName=ctx.getInitParameter("companyName");
		System.out.println(companyName);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
