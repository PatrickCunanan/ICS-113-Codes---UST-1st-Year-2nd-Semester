<%-- 
    Document   : index
    Created on : 05 16, 16, 8:25:28 AM
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
        <h3> This is expression language in session object </h3>
        <%
        session.setAttribute("user", "Jose");
        %>
        <a href="process.jsp">Click Here!</a>
    </body>
</html>
