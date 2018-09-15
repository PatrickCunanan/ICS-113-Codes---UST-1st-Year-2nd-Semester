<%-- 
    Document   : Menu
    Created on : 05 17, 16, 9:25:47 PM
    Author     : Miguel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>GameZone</title>
    </head>
    <body background = bgLogin.jpg style="postion: absolute">
        <link rel="stylesheet" type="text/css" href="headerBtn.css">
        <link rel="stylesheet" type="text/css" href="btn.css">
    <center>
        <pre>


            <form action="ServletControllerMenu">
               <div style=" text-align:center; font-family: hacked; font-size: 500%; color:white;">Menu</div>
        <input type ="submit" value="Find Game" class="btn1" name = "oper"/> <input type ="submit" value="Game Reviews" class="btn1" name = "oper" /> <input type ="submit" value="Upcoming Games" class="btn1" name = "oper"/>      
            </form>
        </pre>
    </body>
</html>
