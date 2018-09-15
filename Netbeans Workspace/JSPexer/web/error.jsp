<%-- 
    Document   : error
    Created on : 04 25, 16, 7:30:54 AM
    Author     : Patrick
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true" %>>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        Division zero occurred<br>
        The exception is <%=exception%>
    </body>
</html>
