<%-- 
    Document   : cookiesession
    Created on : 04 26, 16, 12:34:41 PM
    Author     : Patrick
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String word = request.getParameter("word");
    int vowel=0;
    int consonant=0;
    for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowel++;
            }
            else{
                consonant++;
            }
        }
    //store vowel in session 
    session.setAttribute("vowel", vowel+"");
     //store consonant in cookie
    Cookie cookie = new Cookie("consonant", consonant+"");
    cookie.setMaxAge(365*24*60*60);
    response.addCookie(cookie);
     
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <p>
            <a href="cooiesessionvalue.jsp">
                Next Page to view the values</a>
        </p>
    </body>
</html>
