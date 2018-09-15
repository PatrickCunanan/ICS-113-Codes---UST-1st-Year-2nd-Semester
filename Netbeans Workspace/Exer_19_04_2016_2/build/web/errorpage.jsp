<%-- 
    Document   : errorpage
    Created on : 04 25, 16, 5:45:27 PM
    Author     : Harjit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page isErrorPage= "true" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <font face="lucida console" color="red" size="2">
            <h1> Error! Invalid input</h1>
        </font>
        <jsp:include page = "index.jsp"/>
    </body>
</html>
