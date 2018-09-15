<%-- 
    Document   : printdate
    Created on : 04 18, 16, 8:03:46 AM
    Author     : Patrick
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% out.print ("Today is: " + java.util.Calendar.getInstance().getTime());%>
        <%= request.getParameter("name")%>
                
    </body>
</html>
