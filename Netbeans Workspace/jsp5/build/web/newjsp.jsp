<%-- 
    Document   : newjsp
    Created on : 04 12, 16, 12:18:11 PM
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
        <%
        String Name = request.getParameter("n");
        double ex = Double.parseDouble(request.getParameter("ex"));
        double q = Double.parseDouble(request.getParameter("q"));
        double er = Double.parseDouble(request.getParameter("er"));
        
        double resultex = ex*.4;
        double resultq = q*.4;
        double resulter = er*.2;
        
        double total = resultex +resultq + resulter;
        %>
        Hello  <%=Name%>
        
        Exam:  <%=ex%> *4 = <%=resultex%>
        Quiz:  <%=q%> *4 = <%=resultq%>
        Exer:  <%=er%> *4 = <%=resulter%>
        
        Total: <%=total%>
        
        
    </body>
</html>
