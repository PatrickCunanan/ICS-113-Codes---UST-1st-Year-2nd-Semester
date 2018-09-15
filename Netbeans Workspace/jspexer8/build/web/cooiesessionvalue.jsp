<%-- 
    Document   : cooiesessionvalue
    Created on : 04 26, 16, 12:41:51 PM
    Author     : Patrick
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String cookieName = "consonant";
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
    
    String VowelCount = (String) session.getAttribute("vowel");

    if (VowelCount == null) {
        VowelCount = "0";
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
        No Cookies found!
        <% } else {
        %>
        <p>
            Vowels: <%=VowelCount%>
            Consonants: <%=myCookie.getValue()%></>
            <% }%>
    </body>
</html>
