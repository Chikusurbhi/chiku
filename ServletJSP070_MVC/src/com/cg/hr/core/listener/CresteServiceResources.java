package com.cg.hr.core.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebListener;

import com.cg.hr.core.exceptions.Empexception;
import com.cg.hr.core.sevices.EmployeeService;
import com.cg.hr.core.sevices.EmployeeServicesImpl;

@WebListener
public class CresteServiceResources implements ServletContextListener {
	 private EmployeeService services;

    public void contextDestroyed(ServletContextEvent arg0)  { 
    	services=null;
        
    }

    public void contextInitialized(ServletContextEvent arg0)  { 
    	
    	try {
    		services=new EmployeeServicesImpl();
    		ServletContext ctx= arg0.getServletContext();
    		ctx.setAttribute("services",services);
    	} catch (Empexception e) {
    	try {
			throw new ServletException("Missed Service refrence",e);
		} catch (ServletException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	}
    }
	
}
