<%-- 
    Document   : index
    Created on : 04 25, 16, 6:50:24 PM
    Author     : Patrick
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>  
<!DOCTYPE html>
<html>
    <head>
        <title>Email Registration</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>
            p.border {
                border-style: double;
                border-width: thick;
                border-color: white;
                white-space: pre-wrap;
                text-align: justify;
                margin: 0 auto;
                width: 30em;
                color: white;
                font-family: "Helvetica Neue", Helvetica, Arial, sans-serif;
                text-align: center;
            }
            h1.style {
                font-family: "Helvetica Neue", Helvetica, Arial, sans-serif;
                text-align: center;
                color: white;
            }
        </style>
    </head>
    <body background = "blur.jpg">
        <%

            String uName = request.getParameter("name");
            String Lname = request.getParameter("lname");
            String Fname = request.getParameter("fname");
            String Mname = request.getParameter("fname");
            String CN = request.getParameter("cn");
            String Address = request.getParameter("address");
        %>
        <font color="#ff0000"> <%= exception%> </font>
        <h1 class="style">EMAIL REGISTRATION</h1>
        <form action="processData.jsp" method="post">
            <p class="border">
        Last Name:                 <input type ="text" name="lname" value="<%=Lname%>"><br><br>
        First Name:                 <input type ="text" name="fname" value="<%=Fname%>"><br><br>
        Middle Name:             <input type="text" name="mname" value="<%=Mname%>"><br><br>
        Contact Number:     <input type ="text" name="cn" value="<%=CN%>"><br><br>
        City:                           <input type="text" name="address" value="<%=Address%>"><br><br>
        User Name:               <input type="text" name="name" value="<%=uName%>"><br><br>
        Password:                 <input type="password" name="password"><br><br>
        Confirm Password:   <input type="password" name="passwordc"><br><br>
                <input type="submit" value="Register">
            </p>
        </form>
    </body>
</html>