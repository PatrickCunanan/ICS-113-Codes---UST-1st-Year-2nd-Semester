<%-- 
    Document   : newjsp
    Created on : 03 29, 16, 11:16:01 AM
    Author     : Patrick
--%>
<%@page import = "java.util.Date" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%!private int access=0; %>
        <% int a=8, b=10; %>
        <% Date date = new Date(); %>
        <h1>First number is <%=a%></h1>
        <h1>Second number is <%=b%></h1>
        <h1>Sum is <%=a+b%></h1>
         <h1>Difference is <%=a-b%></h1>
          <h1>Product is <%=a*b%></h1>
           <h1>Quotient is <%=a/b%></h1>
        <h1>Number of access: <%=++access%></h1>
        <h1>Date for today is <%=date%></h1>
    </body>
</html>
