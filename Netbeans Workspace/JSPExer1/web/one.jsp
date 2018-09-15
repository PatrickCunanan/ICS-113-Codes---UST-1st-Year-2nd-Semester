<%-- 
    Document   : one.jsp
    Created on : 04 19, 16, 11:32:19 AM
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
        String Fname = request.getParameter("fn");
        String Mname = request.getParameter("mn");
        String Nname = request.getParameter("nn");
        String Lname = request.getParameter("ln");
        String Address = request.getParameter("ad");
        String Uname = request.getParameter("un");
        String Pword = request.getParameter("pw");
        
        if ((Uname.equals(Pword))){
            out.print("First Name: "+Fname +"<br>");
            out.print("Middle Name: "+Mname +"<br>");
            out.print("Last Name: "+Lname+"<br>");
            out.print("Nickname: "+Nname +"<br>");
            out.print("Address: "+ Address+"<br>");
            out.print("Username: "+Uname+"<br>");
            out.print("Password: "+Pword+"<br>");
        }
        if (!(Uname.equals(Pword))){
        out.print("INPUT AGAIN WRONG USERNAME AND PASSWORD!!!!");
        %><jsp:include page= "two.jsp" /><%
        }
        %>
        
    </body>
</html>
