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
public class CV extends HttpServlet {

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
            out.println("<title>Servlet CV</title>");
            out.println("<style type=\"text/css\">\n"
                    + "html, \n" + "body {\n"
                    + "height: 100%;\n" + "}\n" + "body {\n"
                    + "background-image: url(bg.png);\n"
                    + "background-repeat: repeat;\n"
                    + "background-size: cover;\n" + "}\n" + "</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1 align=\"center\">CV GENERATOR</h1>");
            out.println("<pre align=\"center\"><form name=\"cv\"method = \"post\">");
            out.println("<b>Personal Information:</b><br>");
            out.println("   Last Name:             <input type=\"text\" name=\"ln\"><br>");
            out.println("   First Name:            <input type=\"text\" name=\"fn\"><br>");
            out.println("   Middle Name:           <input type=\"text\" name=\"mn\"><br>");
            out.println("   Birthdate:             <input type=\"text\" name=\"bd\"><br>");
            out.println("   Marital Status:        <input type=\"text\" name=\"ms\"><br>");
            out.println("   Home Address:          <input type=\"text\" name=\"ha\"><br>");
            out.println("   Provincial Address:    <input type=\"text\" name=\"pa\"><br>");
            out.println("   <b>Contact Details:</b><br>");
            out.println("      Mobile Number:      <input type=\"text\" name=\"mbn\"><br>");
            out.println("      Landline Number:    <input type=\"text\" name=\"ldn\"><br>");
            out.println("      Email Address:      <input type=\"text\" name=\"ea\"><br>");
            out.println("<b>Education History</b>:<br>");
            out.println("   <b>Tertiary:</b><br>");
            out.println("      Course:             <input type=\"text\" name=\"c1\"><br>");
            out.println("      School:             <input type=\"text\" name=\"s1\"><br>");
            out.println("      Inclusive Years:    <input type=\"text\" name=\"i1\"><br>");
            out.println("      Honors Received:    <input type=\"text\" name=\"h1\"><br>");
            out.println("   <b>Secondary:</b><br>");
            out.println("      School:             <input type=\"text\" name=\"s2\"><br>");
            out.println("      Inclusive Years:    <input type=\"text\" name=\"i2\"><br>");
            out.println("      Honors Received:    <input type=\"text\" name=\"h2\"><br>");
            out.println("   <b>Primary:</b><br>");
            out.println("      School:             <input type=\"text\" name=\"s3\"><br>");
            out.println("      Inclusive Years:    <input type=\"text\" name=\"i3\"><br>");
            out.println("      Honors Received:    <input type=\"text\" name=\"h3\"><br>");
            out.println("<input type=\"submit\" value=\"Create CV\"><br><br>");
            out.println("</form></pre>");
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
        PrintWriter out = response.getWriter();
        String LastName = request.getParameter("ln");
        String FirstName = request.getParameter("fn");
        String MiddleName = request.getParameter("mn");
        String Birthdate = request.getParameter("bd");
        String MaritalStatus = request.getParameter("ms");
        String HomeAddress = request.getParameter("ha");
        String ProvincialAddress = request.getParameter("pa");
        String MobileNumber = request.getParameter("mbn");
        String LandlineNumber = request.getParameter("ldn");
        String EmailAddress = request.getParameter("ea");
        String Course = request.getParameter("c1");
        String School1 = request.getParameter("s1");
        String Years1 = request.getParameter("i1");
        String Honors1 = request.getParameter("h1");
        String School2 = request.getParameter("s2");
        String Years2 = request.getParameter("i2");
        String Honors2 = request.getParameter("h2");
        String School3 = request.getParameter("s3");
        String Years3 = request.getParameter("i3");
        String Honors3 = request.getParameter("h3");

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet CV</title>");
        out.println("<style type=\"text/css\">\n"
                + "html, \n" + "body {\n"
                + "height: 100%;\n" + "}\n" + "body {\n"
                + "background-image: url(bg.png);\n"
                + "background-repeat: repeat;\n"
                + "background-size: cover;\n" + "}\n" + "</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1 align=\"center\">YOUR PERSONAL CV <img src=\"picture.png\" align=\"middle\" style=\"width:100px;height:100px\"></h1>");
        out.println("<pre><form name=\"cv\"method = \"post\">");
        out.println("                             <b>Personal Information:</b><br>");
        out.println("                                Last Name:             " + LastName + "<br>");
        out.println("                                First Name:            " + FirstName + "<br>");
        out.println("                                Middle Name:           " + MiddleName + "<br>");
        out.println("                                Birthdate:             " + Birthdate + "<br>");
        out.println("                                Marital Status:        " + MaritalStatus + "<br>");
        out.println("                                Home Address:          " + HomeAddress + "<br>");
        out.println("                                Provincial Address:    " + ProvincialAddress + "<br>");
        out.println("                                <b>Contact Details:</b><br>");
        out.println("                                   Mobile Number:      " + MobileNumber + "<br>");
        out.println("                                   Landline Number:    " + LandlineNumber + "<br>");
        out.println("                                   Email Address:      " + EmailAddress + "<br>");
        out.println("                             <b>Education History</b>:<br>");
        out.println("                                <b>Tertiary:</b><br>");
        out.println("                                   Course:             " + Course + "<br>");
        out.println("                                   School:             " + School1 + "<br>");
        out.println("                                   Inclusive Years:    " + Years1 + "<br>");
        out.println("                                   Honors Received:    " + Honors1 + "<br>");
        out.println("                                <b>Secondary:</b><br>");
        out.println("                                   School:             " + School2 + "<br>");
        out.println("                                   Inclusive Years:    " + Years2 + "<br>");
        out.println("                                   Honors Received:    " + Honors2 + "<br>");
        out.println("                                <b>Primary:</b><br>");
        out.println("                                   School:             " + School3 + "<br>");
        out.println("                                   Inclusive Years:    " + Years3 + "<br>");
        out.println("                                   Honors Received:    " + Honors3 + "<br>");
        out.println("</body>");
        out.println("</html>");

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
