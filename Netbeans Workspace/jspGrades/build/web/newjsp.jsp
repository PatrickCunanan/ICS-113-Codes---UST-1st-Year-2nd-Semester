<%-- 
    Document   : newjsp
    Created on : 04 18, 16, 7:21:03 AM
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
            double g1 = Double.parseDouble(request.getParameter("g1"));
            double g2 = Double.parseDouble(request.getParameter("g2"));
            double g3 = Double.parseDouble(request.getParameter("g3"));
            
            double ave = (g1+g2+g3)/3.0;
            String result = "";
            String pass = "";
            if (ave <= 69.9){
            result = "POOR";
            pass = "FAILED";
            }
            else if (ave>=70 && ave<=76.9){
            result = "FAIR";
            pass = "PASSED";
            }
            else if (ave>=77 && ave<=82.9){
            result = "SATISFACTORY";
            pass = "PASSED";
            }
            else if (ave>=83 && ave<=87.9){
            result = "AVERAGE";
            pass = "PASSED";
            }
            else if (ave>=88 && ave<=94.9){
            result = "ABOVE AVERAGE";
            pass = "PASSED";
            }
            else if (ave>=95 && ave<=100){
            result = "EXCELLENT";
            pass = "PASSED";
            }
        %>
        
        GRADE: <%=ave%>
        RATING: <%=result%>
        REMARKS: <%=pass%>
    </body>
</html>
