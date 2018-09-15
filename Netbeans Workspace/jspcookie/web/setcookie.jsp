<%-- 
    Document   : setcookie
    Created on : 04 26, 16, 12:13:42 PM
    Author     : Patrick
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
String username=request.getParameter("username");
if (username == null){
username=" ";
}
Cookie cookie = new Cookie("username", username);
cookie.setMaxAge(365*24*60*60);
response.addCookie(cookie);
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p><a href="showcookievalue.jsp">Next Page to view the cookie value
                </a><p>
    </body>
</html>
