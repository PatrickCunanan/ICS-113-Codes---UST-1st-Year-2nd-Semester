<%-- 
    Document   : printdate
    Created on : 04 18, 16, 7:58:08 AM
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
    </body>
</html>
