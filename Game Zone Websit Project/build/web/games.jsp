

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="games.GenreBean,games.GameBean" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Games</title>
    </head>
    <body background = bgLogin.jpg style="postion: absolute">
        <link rel="stylesheet" type="text/css" href="btn.css">
        <%
            String s = (String) request.getAttribute("inputs");
            GenreBean genreb = GenreBean.getgames(s);
            GameBean game1 = genreb.getgame();
            GameBean game2 = genreb.getgame2();
            GameBean game3 = genreb.getgame3();
        %>

        
        <form action ="GameDescription">
            <div style=" text-align:center;font-family: hacked; font-size: 350%; color:white;"><%= genreb.getgenre()%></div>
        <div style=" text-align:center;font-family: hacked; font-size: 350%; color:white;"><%= genreb.getplatform()%></div>
            <p align="center">
                <img src=<%=game1.getpicture()%> , height="400" hspace="20"/> <img src=<%=game2.getpicture()%> , height="400" hspace="20"/> <img src=<%=game3.getpicture()%> , height="400" hspace="20"/><br></p>
            <p align="center"><a href="Menu.jsp" class ="btn" style="font-family: code">Home</a> <a href="Search_genre.html" class ="btn" style="font-family: code">Search again</a></p>
        </form>
    </body>
</html>
