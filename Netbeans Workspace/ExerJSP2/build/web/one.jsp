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
        String Fname = request.getParameter("fn");
        String Mname = request.getParameter("mn");
        String Nname = request.getParameter("nn");
        String Lname = request.getParameter("ln");
        String Address = request.getParameter("ad");
        String Uname = request.getParameter("un");
        String Pword = request.getParameter("pw");
        String CPword = request.getParameter("cpw");
        
        if ((CPword.equals(Pword))){
            out.print("First Name: "+Fname +"<br>");
            out.print("Middle Name: "+Mname +"<br>");
            out.print("Last Name: "+Lname+"<br>");
            out.print("Nickname: "+Nname +"<br>");
            out.print("Address: "+ Address+"<br>");
            out.print("Username: "+Uname+"<br>");
            out.print("Password: "+Pword+"<br>");
        }
        else{
        out.print("Password does not match. Input username and passowrd again!");
        %><jsp:include page= "error.jsp" /><%
        }
        %>
        
    </body>
</html>
