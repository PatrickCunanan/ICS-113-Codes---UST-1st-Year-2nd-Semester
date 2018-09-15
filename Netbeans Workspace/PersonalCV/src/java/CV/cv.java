/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CV;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Patrick
 */
public class cv extends HttpServlet {

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
            out.println("<title>Servlet cv</title>");            
            out.println("</head>");
            out.println("<body background=\"paper.jpg\">");
            out.println("<h1>Personal CV      <img src=\"2x2.jpg\" align=\"right\" style=\"width:1in;height:1in\"></h1>");
            out.println("<pre class =tab><b>Last Name:</b> Cunanan");
            out.println("<b>First Name:</b> Patrick Bryan");
            out.println("<b>Middle Name:</b> Francisco");
            out.println("<b>Birthdate:</b> April 15, 1998");
            out.println("<b>Marital Status:</b> Single");
            out.println("<b>Home Address:</b> #55 Sampaguita St., Sta Lucia Vill., Viente Reales, Valenzuela City");
            out.println("<b>Provincial Address:</b> N/A");
            out.println("<b>Contact Details:</b>");
            out.println("   <b>Contact Number:</b> 09332123116");
            out.println("   <b>Email Address:</b> patrick.cunanan15@gmail.com");
            out.println("                  patrick.cunanan15@yahoo.com <br><br><br></pre>");
            out.println("<h2><b>Education History</b></h2>");
            out.println("<pre class = tab><b>Tertiary:</b>");
            out.println("<b>   Course:</b> BS Computer Science");
            out.println("<b>   School:</b> University of Santo Tomas");
            out.println("<b>   Inclusive Years:</b> 2014 - 2018");
            out.println("<b>   Honors Received:</b> N/A<br>");
            out.println("<b>Secondary:</b>");
            out.println("<b>   School:</b> Meycauayan College");
            out.println("<b>   Inclusive Years:</b> 2010 - 2014");
            out.println("<b>   Honors Received:</b> Loyalty Award<br>");
            out.println("<b>Primary:</b>");
            out.println("<b>   School:</b> University of Santo Tomas");
            out.println("<b>   Inclusive Years:</b> 2002 - 2010");
            out.println("<b>   Honors Received:</b> Valedictorian (Kinder)");
            out.println("                    2nd Honorable Mention (Grade 6)");
            out.println("                    Loyalty Award</pre>");
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
        processRequest(request, response);
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
