<%-- 
    Document   : a
    Created on : 03 29, 16, 12:35:41 PM
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
        <h1><center>Result for <%=request.getParameter("a1")%></center></h1>
        <%
            int i = Integer.parseInt(request.getParameter("t1"));
            int j = Integer.parseInt(request.getParameter("t2"));
            int k = 0;
            String str = request.getParameter("a1");
            if(str.equals("add"))
                k=i+j;
            if(str.equals("sub"))
                k=i-j;
            if(str.equals("mul"))
                k=i*j;
            if(str.equals("div"))
                k=i/j;
        %>
        Result is <%=k%>
    </body>
</html>
