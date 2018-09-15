<%-- 
    Document   : index
    Created on : 04 19, 16, 1:35:28 PM
    Author     : Harjit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Email / Registration</title>
    </head>
    <body>
    <body  bgcolor = "#98FF98">
        
        <h1>Please fill up the following fields.</h1>
        <form action="Report.jsp">
            <pre>
            First name:        <input type="text" name = "fn" value = <%=request.getParameter("fn")%> required/><br>
            Last name:         <input type="text" name = "ln" value = <%=request.getParameter("ln")%> required/><br>
            Middle name:       <input type="text" name = "mn" value = <%=request.getParameter("mn")%> required/><br>
            Birth date:  Month:<input type="text" name = "mth" required/> Date:<input type="text" name = "dte" required/> Year:<input type="text" name = "yer" required/><br>
            Nickname:          <input type="text" name = "bd" value = <%=request.getParameter("bd")%> required/><br>
            <br>
            Username:          <input type="text" name = "un" value = '<%= request.getParameter("un") %>'/><br>
            Password:          <input type="password" name = "pw"/><br>
            Confirm Password:  <input type="password" name = "cpw" required/><br>
            <input type="submit" value = "Go"/>
            </pre>
        </form>
    </body>
    </body>
</html>
