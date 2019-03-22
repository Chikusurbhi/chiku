package com.cg.hr;

import java.io.IOException;


import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*Life Cycle Methods.
 * init(ServletConfig): Its for initialization .
 *         Initialization,Resource Allocation are done here.
 *         init():Its for initialization and overriding.
 * service(): This method is called on every request.
 *            Controlling,Transformation
 * destroy(): This method is called while un-deploying the servlet.
 *            Resource Deallocation.
 *            
 *            
 * Eager: created at the time of starting the server. Consumes memory resources right from beginning.
 *        Normally used for the servlets which are used by all users.
 *        Load on Startup is +ve.
 *        Home, Login, Main menu
 * Lazy: Created only when first request comes in.
 *        Normally used for the servlets which may be instantiated optionally.
 *        ListAllemps, AddNewEmps
 *        
 * Servlet API
 */


@WebServlet(urlPatterns="/MyServlet", loadOnStartup=2)
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void init() throws ServletException
	{
		
		System.out.println("In init(ServletConfig)");
		
	}

	public void destroy() 
	{
		System.out.println("In detroy()");
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("In doGet()");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
