<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList,java.util.Calendar"%>
<%@ page session="true" %>   
<%! private int x=10; %> 
<%! public int getValue() {
	return 10;
	}
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
      <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
     <title>Insert title here</title>
    </head>
    <body>
         <%
            for(int i=0;i<5;i++){
         %>
         <h1>Capgemini Solutions.</h1>
         <%
            }
         %>
         <%= x %>
         <%= getValue() %>
         
         <%
            config.getInitParameter(arg0);
            application.getInitParameter(arg0);
            request.getParameter(arg0);
            session.getId();
            System.out.println(page.x);
           
             %>
         
     
    </body>
</html>

<%-- 
      Directives:<%@ %>
      page:session,import
      taglib:
      include:
      Declaration: <%! %> They are contents of class 
         Instances Fields,Methods.
      Scriptlet: <% %> Its a Java code to be added inside service().
      Expressions: A single value to print.
      Template: Its HTML part
      Elements: <jsp:xxxx> forward, include.
       --%>
       
 <%-- 
     Implicit objects
      1. ServletContext: application
      2. ServletConfig: config
      3. HttpServletRequest: request
      4. HttpServletResponse: response
      5. HttpSession session
      6. JspWriter out: Handle to Response.
      7. Page page: Like 'this'
      8. Page context pageContext: Bundle of JSP resources.
      9. Exception exception: Refers to Exception
            Available on only those JSP for whom
             <%@ page isError=true %> 
      
  --%>
       