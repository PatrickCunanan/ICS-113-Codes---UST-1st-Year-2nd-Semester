/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MRT;

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
public class MRT extends HttpServlet {

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
            out.println("<title>Servlet MRT</title>"); 
            out.println("<style type=\"text/css\">\n" +
                        "html, \n" + "body {\n" +
                        "height: 100%;\n" + "}\n" + "body {\n" +
                        "background-image: url(mrtna.jpg);\n" +
                        "background-repeat: no-repeat;\n" +
                        "background-size: cover;\n" + "}\n" + "</style>");
            out.println("<style type=\"text/css\">\n" +
                        "select {font-size: 27px;});" + "</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<pre>");
            out.println("<form method = \"post\">");
            out.println("<p>   <img src=\"ln.png\" style=\"width:2.175in;height:0.5875in\"><img src=\"FareList.png\" align = \"right\" style=\"width:4.5in;height:6.0in\"></p>");
            out.println("   <input style=\"height:25px;font-size:14pt;\" type=\"text\" name=\"ln\">");
            out.println("<p>   <img src=\"fn.png\" style=\"width:2.175in;height:0.5875in\"></p>");
            out.println("   <input style=\"height:25px;font-size:14pt;\" type=\"text\" name=\"fn\">");
            out.println("<p>   <img src=\"sd.png\" style=\"width:2.175in;height:0.5875in\"></p>");
            out.println("   <select name=\"destination\">\n" +
                        "    <option value=\"QA\" selected>Quezon Avenue</option>\n" +
                        "    <option value=\"GMA\">GMA Kamuning</option>\n" +
                        "    <option value=\"C\">Cubao</option>\n" +
                        "    <option value=\"S\">Santolan</option>\n" +
                        "    <option value=\"O\">Ortigas</option>\n" +
                        "    <option value=\"SB\">Shaw Boulevard</option>\n" +
                        "    <option value=\"BA\">Boni Avenue</option>\n" +
                        "    <option value=\"G\">Guadalupe</option>\n" +
                        "    <option value=\"B\">Buendia</option>\n" +
                        "    <option value=\"A\">Ayala</option>\n" +
                        "    <option value=\"M\">Magallanes</option>\n" +
                        "    <option value=\"TA\">Taft Avenue</option>\n" +
                        "</select>");
            out.println("<br>   <input style=\"height:55px;font-size:44px;\" type=\"submit\" value=\"Buy Ticket\">");
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
            String Destination = request.getParameter("destination");
            switch (Destination) {
            case "QA":
                out.println("<pre>The fare amount to <b>QUEZON AVENUE</b> station (STOP 1) from North Avenue Station is P10.00\n" +
                        "Passenger name is "+ FirstName + " "+ LastName + "<br><br>" +"Total Fare: P10.00</pre>");
                break;
            case "GMA":
                out.println("<pre>The fare amount to <b>GMA KAMUNING</b> station (STOP 1) from North Avenue Station is P10.00\n" +
                        "Passenger name is "+ FirstName + " "+ LastName + "<br><br>" +"Total Fare: P10.00</pre>");
                break;
            case "C":
                out.println("<pre>The fare amount to <b>CUBAO</b> station (STOP 2) from North Avenue Station is P11.00\n" +
                        "Passenger name is "+ FirstName + " "+ LastName + "<br><br>" +"Total Fare: P11.00</pre>");
                break;
            case "S":
                out.println("<pre>The fare amount to <b>SANTOLAN</b> station (STOP 2) from North Avenue Station is P11.00\n" +
                        "Passenger name is "+ FirstName + " "+ LastName + "<br><br>" +"Total Fare: P11.00</pre>");
                break;
            case "O":
                out.println("<pre>The fare amount to <b>ORTIGAS</b> station (STOP 3) from North Avenue Station is P12.00\n" +
                        "Passenger name is "+ FirstName + " "+ LastName + "<br><br>" +"Total Fare: P12.00</pre>");
                break;
            case "SB":
                out.println("<pre>The fare amount to <b>SHAW BOULEVARD</b> station (STOP 3) from North Avenue Station is P12.00\n" +
                        "Passenger name is "+ FirstName + " "+ LastName + "<br><br>" +"Total Fare: P12.00</pre>");
                break;
            case "BA":
                out.println("<pre>The fare amount to <b>BONI AVENUE</b> station (STOP 4) from North Avenue Station is P13.00\n" +
                        "Passenger name is "+ FirstName + " "+ LastName + "<br><br>" +"Total Fare: P13.00</pre>");
                break;
            case "G":
                out.println("<pre>The fare amount to <b>GUADALUPE</b> station (STOP 4) from North Avenue Station is P13.00\n" +
                        "Passenger name is "+ FirstName + " "+ LastName + "<br><br>" +"Total Fare: P13.00</pre>");
                break;
            case "B":
                out.println("<pre>The fare amount to <b>BUENDIA</b> station (STOP 5) from North Avenue Station is P14.00\n" +
                        "Passenger name is "+ FirstName + " "+ LastName + "<br><br>" +"Total Fare: P14.00</pre>");
                break;
            case "A":
                out.println("<pre>The fare amount to <b>AYALA</b> station (STOP 5) from North Avenue Station is P14.00\n" +
                        "Passenger name is "+ FirstName + " "+ LastName + "<br><br>" +"Total Fare: P14.00</pre>");
                break;
            case "M":
                out.println("<pre>The fare amount to <b>MAGALLANES</b> station (STOP 6) from North Avenue Station is P15.00\n" +
                        "Passenger name is "+ FirstName + " "+ LastName + "<br><br>" +"Total Fare: P15.00</pre>");
                break;
            case "TA":
                out.println("<pre>The fare amount to <b>TAFT AVENUE</b> station (STOP 6) from North Avenue Station is P15.00\n" +
                        "Passenger name is "+ FirstName + " "+ LastName + "<br><br>" +"Total Fare: P15.00</pre>");
                break;
            }
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
