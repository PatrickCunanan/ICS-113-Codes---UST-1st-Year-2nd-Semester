<%-- 
    Document   : index
    Created on : 04 18, 16, 8:03:26 AM
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
       <h2>this is index page</h2>
       <jsp:forward page= "printdate.jsp" >
           <jsp:param name ="name" value="javatpoint.com"/>
       </jsp:forward>
    </body>
</html>
