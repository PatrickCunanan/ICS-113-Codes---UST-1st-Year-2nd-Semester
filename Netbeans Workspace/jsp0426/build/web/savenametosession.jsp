<%-- 
    Document   : savenametosession
    Created on : 04 26, 16, 11:59:31 AM
    Author     : Patrick
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String username = request.getParameter("username");
    if (username == null) {
        username = " ";
    }
    session.setAttribute("username", username);
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p>
            <a href="showsessionvalue.jsp">
                Next Page to view the session value</a>
        </p>
    </body>
</html>
