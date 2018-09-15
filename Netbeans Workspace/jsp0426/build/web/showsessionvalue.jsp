<%-- 
    Document   : showsessionvalue
    Created on : 04 26, 16, 12:08:39 PM
    Author     : Patrick
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String username = (String) session.getAttribute("username");

    if (username == null) {
        username = " ";
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p>
            Welcome <%=username%>
            </p>
    </body>
</html>
