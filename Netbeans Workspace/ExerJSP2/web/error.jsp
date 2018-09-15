<%-- 
    Document   : two
    Created on : 04 19, 16, 12:31:56 PM
    Author     : Patrick
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true" %>>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      <h1>EMAIL REGISTRATION</h1>
      <% 
      String Fname = request.getParameter("fn");
        String Mname = request.getParameter("mn");
        String Nname = request.getParameter("nn");
        String Lname = request.getParameter("ln");
        String Address = request.getParameter("ad");
        String Uname = request.getParameter("un");
        String Pword = request.getParameter("pw");
      %>
       <form action="one.jsp">
           <pre>
           First Name:   <input type="text" name="fn"value='<%=Fname%>'><br>
           Middle Name:    <input type="text" name="mn"value='<%=Mname%>'><br>
           Last Name:    <input type="text" name="ln" value='<%=Lname%>'><br>
           Nickname:    <input type="text" name="nn" value='<%=Nname%>'><br>
           Address:      <input type="text" name="ad" value='<%=Address%>'><br>
           Username:     <input type="text" name="un"><br>
           Password:     <input type="password" name="pw"><br>
           Confirm Password: <input type="password" name="cpw"><br>
           </pre>
           <input type="submit" value="submit">
       </form>
    </body>
</html>
