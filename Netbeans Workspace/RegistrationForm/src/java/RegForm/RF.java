/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegForm;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Patrick
 */
@WebServlet(name = "RF", urlPatterns = {"/RF"})
public class RF extends HttpServlet {

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
            float a = 6081;
            float b = 4933;
            float c = 8468;
            float d = 2764;
            float e = 750;
            float f = 37314;
            float g = a+b+c+d+e+f;
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RF</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<pre class = tab>");
            out.println("<h1><img src=\"UST.png\" style=\"width:8.5in;height:0.83in\"></h1>");
            out.println("   Student No: <b>2014069410            M</b>      Year:   <b>2nd Year</b>       AY/Semester     :<b>2015-2016 2nd Semester  #01</b>");
            out.println("   Name      : <b>CUNANAN, PATRICK BRYAN F.</b>                           College         : <b>26 IICS</b>");
            out.println("   Address   : <b>55 SAMPAGUITA ST., STA. LUCIA VILL.,</b>                Program/Major:  :<b>01 COMPUTER SCIENCE</b>");
            out.println("               <b>VEINTEREALES, VALENZUELA CITY 09278314768</b>           Curriculum Code :<b>2</b>");
            out.println("<br>");
            out.println("<span style = \"background-color: #d1d1e0\">          <strong>Course</strong>      <strong>Section</strong>       <strong>Lec</strong>           <strong>Lab</strong>          <strong>Class Schedule</strong>                              <b>Room</b><br></span>");
            out.println("   <b>01. FIL 2          2CSB          3.00          .00          M 10:00am - 11:00am 5th Flr. Rm. 54");
            out.println("                                                               F 09:00am - 11:00am 5th Flr. Rm. 58");
            out.println("   02. ENG 4          2CSB          3.00          .00          W 08:00am - 10:00am 5th Flr. Rm. 57");
            out.println("                                                               M 09:00am - 10:00am 5th Flr. Rm. 54");
            out.println("   03. MATH 103       2CSB          3.00          .00          F 12:00pm - 2:00pm 5th Flr. Rm.57");
            out.println("                                                               Th 07:00am - 08:00am 5th Flr. Rm.57");
            out.println("   04. MATH 109A      2CSB          3.00          .00          M 12:00pm - 01:00pm 5th Flr. Rm.55");
            out.println("                                                               W 10:00am - 11:00am 5th Flr. Rm.57");
            out.println("   05. RC             2CSB          3.00          .00          Th 08:00am - 09:00am 5th Flr. Rm.57");
            out.println("                                                               T 07:00am - 09:00am 5th Flr. Rm.58");
            out.println("   06. ICS113         2CSB          3.00         1.00          T 11:00am - 12:00pm 3rd Flr. Rm. ICS LAB 4");
            out.println("                                                               M 07:00am - 09:00am 3rd Flr. Rm. ICS LAB 3");
            out.println("                                                               T 12:00pm - 01:00pm 3rd Flr. Rm. ICS LAB 4");
            out.println("   07. ICS 131        2CSB          3.00          .00          W 07:00am - 08:00am 5th Flr. Rm.57");
            out.println("                                                               T 10:00am - 11:00am 3rd Flr. Rm. ICS LAB1");
            out.println("                                                               Th 02:00pm - 03:00pm 4th Flr. Rm. IT LAB");
            out.println("   08. CS203          2CSB          3.00         1.00          F 08:00am - 09:00am 3rd Flr. Rm. ICS LAB3");
            out.println("                                                               F 07:00am - 08:00am 3rd Flr. Rm. ICS LAB3");
            out.println("                                                               Th 10:00am - 12:00pm 3rdFlr. Rm. ICS LAB3");
            out.println("   09. FOLK DANCE     FDC16         2.00          .00          W 01:00pm - 03:00pm 1st Flr. Rm. QP2");
            out.println("   10. NSTP CWS 2     C-ENG-6        .00         3.00     <br>");
            out.println("           Total Units (w/ PE and ROTC): 30.00</b><br>");
            out.println("<br><br><br>");
            out.println("<span style = \"background-color: #d1d1e0\">        <strong><u>Fee Category</strong></u>      <strong><u>Amount</strong></u>                                                                                </span>");
            out.println("   <b>MISC                   " + a + "              <b>EXCESS PAYMENT</b>                             <b>1,750.00</b>");
            out.println("   OTHER CHARGES          " + b);
            out.println("   OTHER FEES             " + c);
            out.println("   PE                     " + d);
            out.println("   PE UNIFORM              " + e);
            out.println("   TUITION               "+ f +"</b>");
            out.println("<br>");
            out.println("   Total Fees - Vat Exempt <b>" + g +"</b>          Due Prelims:       <b>.00</b>");
            out.println("   Payment Term   :      <b>FULL PAYMENT</b>         Due Finals :       <b>.00</b>");
            out.println("   Initial Payment:        <b>58,560.00</b>          Assessed by:<b>SBS_USER20</b>      Date:   <b>01/07/2016</b>");
            out.println("</pre>");
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
