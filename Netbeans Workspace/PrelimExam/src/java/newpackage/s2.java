/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Patrick
 */
public class s2 extends HttpServlet {

    
    static int counter = 0;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet s2</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet s2 at " + request.getContextPath() + "</h1>");
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
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        Cookie [] cw = request.getCookies();
        HttpSession session = request.getSession(false);
       double holder;
        holder = (double) session.getAttribute("change");
        int a,b,c,d,e,f,g,h;
        
        
        a = (int) (holder / 1000);
        b = (int) ((holder%1000)/500);
        c = (int) ((holder%1000%500)/100);
        d = (int) ((holder%1000%500%100)/50);
        e = (int) ((holder%1000%500%100%50)/20);
        f = (int) ((holder%1000%500%100%50%20)/10);
        g = (int) ((holder%1000%500%100%50%20%10)/5);
        h = (int) ((holder%1000%500%100%50%20%10%5)/1);
        counter+=1;
        
        out.println("Change: "+holder+"<br>");
        out.println("Number of 1000 bills: "+a+"<br>");
        out.println("Number of 500 bills: "+b+"<br>");
        out.println("Number of 100 bills: "+c+"<br>");
        out.println("Number of 50 bills: "+d+"<br>");
        out.println("Number of 20 bills: "+e+"<br>");
        out.println("Number of 10 pesos: "+f+"<br>");
        out.println("Number of 5 pesos: "+g+"<br>");
        out.println("Number of 1pesos: "+h+"<br>");
        out.println("number of transactions: "+counter+"<br>");
         out.println("<a href = 'index.html'> Main Menu </a>");
         out.close();
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
        processRequest(request, response);
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
