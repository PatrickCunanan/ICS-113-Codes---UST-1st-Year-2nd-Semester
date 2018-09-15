<%-- 
    Document   : newjsp
    Created on : 29-Mar-2016, 11:32:07
    Author     : Patrick
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import =" java.util.Date"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%! private int access = 0;
        %>
        <%Date date = new Date();%>
        <form name = form1>
        Enter first number: <input type="text" name="a" value="" />
        Enter second number: <input type="text" name="b" value="" />
        
        <br>Sum: <input type="text" name="sum" value="" />
        <br>Difference:   <input type="text" name="diff" value="" />
        <br>Product:   <input type="text" name="prod" value="" />
        <br>Quotient:   <input type="text" name="quo" value="" />
        <input type="button" value="Click!" onclick=calc(); />
        <h1>number of access: <%=++access%></h1>
        <h1>Date is : <%=date%>
        </form>
        
        <script>
            function calc(){
                    var x = parseInt(document.form1.a.value);
                    var y = parseInt(document.form1.b.value);
                   document.form1.sum.value = x + y;
                   document.form1.diff.value = x - y;
                    document.form1.prod.value = x * y;
                    document.form1.quo.value = x / y;
            }
            </script>
    </body>
</html>
