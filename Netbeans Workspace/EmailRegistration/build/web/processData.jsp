<%-- 
    Document   : process
    Created on : 04 19, 16, 11:35:27 AM
    Author     : 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page errorPage="index.jsp" %>  
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String user = request.getParameter("name");
            String pass = request.getParameter("password");
            String fname = request.getParameter("fname");
            String lname = request.getParameter("lname");
            String mname = request.getParameter("mname");
            String cn = request.getParameter("cn");
            String address = request.getParameter("address");
            String passc = request.getParameter("passwordc");
            if (!passc.equals(pass)) {
                throw new RuntimeException("Password did not match.");
            }
            if (user == null || pass == null || fname == null || lname == null
                    || mname == null || cn == null || address == null) {
                throw new RuntimeException("You have missed a field.");
            }
            if (cn.length() < 11 || cn.length() > 11) {
                throw new RuntimeException("Please input 11 digits for your "
                        + "contact number");
            }
            if (user.length() <= 6) {
                throw new RuntimeException("Username should have more than 6"
                        + " characters.");
            }
            if (pass.length() <= 6) {
                throw new RuntimeException("Password should have more than "
                        + "6 characters.");
            }
            if (fname.matches(".*\\d.*") || lname.matches(".*\\d.*")
                    || mname.matches(".*\\d.*"))
                throw new RuntimeException("Only alphabets are allowed on the name");
            else {
        %>

        <jsp:useBean id="u" class="bean.User"></jsp:useBean>
        <jsp:setProperty property="*" name="u"/>
        Report: <br>
        Username: <jsp:getProperty property="name" name="u"/><br>
        Password: <jsp:getProperty property="password" name="u"/><br>
        Last Name: <jsp:getProperty property="lname" name="u"/><br>
        First Name: <jsp:getProperty property="fname" name="u"/><br>
        Middle Name: <jsp:getProperty property="mname" name="u"/><br>
        Contact Number: <jsp:getProperty property="cn" name="u"/><br>
        Address: <jsp:getProperty property="address" name="u"/><br>
        <%
            }
        %>
    </body>
</html>

