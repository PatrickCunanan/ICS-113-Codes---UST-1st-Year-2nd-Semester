<%-- 
    Document   : Order
    Created on : 05 2, 16, 8:11:35 AM
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
        <%
            String O = request.getParameter("order"); 
        %>
        Order
        <br>
        Item: <%=O%>
    </body>
</html>
