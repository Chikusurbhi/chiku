<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
      <head>
           <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
           <title>Login</title>
     </head>
     <body>
           <h1>Capgemini Solutions,Talwade,Pune</h1>
           
          
           ${message} <!-- Expression Language -->
          
        <form action="authenticate" method="POST">
                   User Name:<input type="text" name="userName"></br>
                   Password:<input type="password" name="password"></br>
            
                   <input type="submit" value="GO">
        </form>
    </body>
</html>