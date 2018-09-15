/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Harjit
 */
@WebServlet(urlPatterns = {"/Search"})
public class Search extends HttpServlet {

    public static String genre;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Search</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Search at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        genre = request.getParameter("genre");
        response.sendRedirect("Search_platform.html");
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String platform = request.getParameter("platform");
        String genreplat= genre+platform;
        String url="games.jsp";
       RequestDispatcher r = request.getRequestDispatcher(url);
        switch(genreplat.toUpperCase()){
            case"RPGPC":{
                request.setAttribute("inputs", "rpgc");
                break;
            }
            case"RPGXBOX ONE":{
                request.setAttribute("inputs", "rpg1");
                break;
            }
            case"RPGPS":{
                request.setAttribute("inputs", "rpgs");
                break;
            }
            case"ACTIONPC":{
                request.setAttribute("inputs", "ac");
                break;
            }
            case"ACTIONXBOX ONE":{
                request.setAttribute("inputs", "a1");
                break; 
            }
            case"ACTIONPS":{
                 request.setAttribute("inputs", "as");
                break;
            }
            case"ADVENTUREPC":{
                 request.setAttribute("inputs", "adc");
                break;
            }
            case"ADVENTUREXBOX ONE":{
                 request.setAttribute("inputs", "ad1");
                break;
            }
            case"ADVENTUREPS":{
                 request.setAttribute("inputs", "ads");
                break;
            }
            case"RACINGPC":{
                 request.setAttribute("inputs", "rc");
                break;
            }
            case"RACINGXBOX ONE":{
                 request.setAttribute("inputs", "r1");
                break;
            }
            case"RACINGPS":{
                 request.setAttribute("inputs", "rs");
                break;
            }
            case"SIMULATIONPC":{
                 request.setAttribute("inputs", "sc");
                break;
            }
            case"SIMULATIONXBOX ONE":{
                 request.setAttribute("inputs", "s1");
                break;
            }
            case"SIMULATIONPS":{
                 request.setAttribute("inputs", "ss");
                break;
            }
            case"RTSPC":{
                 request.setAttribute("inputs", "rtsc");
                break;
            }
            case"RTSXBOX ONE":{
                 request.setAttribute("inputs", "rts1");
                break;
            }
            case"RTSPS":{
                 request.setAttribute("inputs", "rtss");
                break;
            }
            case"SHOOTERPC":{
                 request.setAttribute("inputs", "shc");
                break;
            }
            case"SHOOTERXBOX ONE":{
                 request.setAttribute("inputs", "sh1");
                break;
            }  
            case"SHOOTERPS":{
                 request.setAttribute("inputs", "shs");
                break;
            }
        } 
          r.forward(request, response);
          
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
