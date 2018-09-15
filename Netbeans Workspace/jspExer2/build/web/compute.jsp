<%-- 
    Document   : compute
    Created on : 04 25, 16, 7:41:30 AM
    Author     : Patrick
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="error.jsp" %>>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
         
            int dividend = Integer.parseInt(request.getParameter("dv"));
            int divisor = Integer.parseInt(request.getParameter("di"));
            
         %>
         
         Quotient is: <%=dividend/divisor%>
    </body>
</html>
