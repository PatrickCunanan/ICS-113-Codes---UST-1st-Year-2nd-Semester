<%-- 
    Document   : showcookievalue
    Created on : 04 26, 16, 12:18:30 PM
    Author     : Patrick
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String cookieName = "username";
    Cookie cookies[] = request.getCookies();
    Cookie myCookie = null;

    if (cookies != null) {
        for (int i = 0; i < cookies.length; i++) {
            if (cookies[i].getName().equals(cookieName)) {
                myCookie = cookies[i];
                break;
            }
        }
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            if (myCookie == null) {
        %>
        No Cookies found with the name <%=cookieName%>
        <% } else {
        %>
        <p>Welcome <%=myCookie.getValue()%></>
            <% }%>
    </body>
</html>
