

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.util.*" %>
<%@ page errorPage = "errorpage.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Email / Registration</title>
    </head>
    <body bgcolor = "#98FF98">
        
        <%
           String un = request.getParameter("cpw"),
           pw = request.getParameter("pw");
           
           if(un.equals(pw)){
              int year = Integer.parseInt(request.getParameter("yer"));
              int usermonth = Integer.parseInt(request.getParameter("mth"));
              int userdate = Integer.parseInt(request.getParameter("dte"));
        %>
        <font >
        <h1> Email / Registration </h1>
        <pre>


         First name:    <%=request.getParameter("fn")%> 

         Last name:     <%=request.getParameter("ln")%> 

         Middle name:   <%=request.getParameter("mn")%> 

         Nickname:      <%=request.getParameter("bd")%> 
         
        <%
        
           int currentyear = Calendar.getInstance().get(Calendar.YEAR);
           int month = Calendar.getInstance().get(Calendar.MONTH);
           int date = Calendar.getInstance().get(Calendar.DATE);
           int age;
           age = currentyear - year;
           if(usermonth > month && date < userdate)
             age -= 1;
            %>

         Age:           <%=age%> 
        </pre>
        </font>  
        <% 
           }
           else {
        %>
        <font face="lucida console" color="red" size="2">
            <h1> Error! passwords do not match </h1>
            <h1> input username and password again </h1>
        </font>
          <jsp:include page = "index.jsp"/>
        <%
           }%>
                
    </body>
</html>
