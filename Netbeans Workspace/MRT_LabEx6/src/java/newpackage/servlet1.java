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

/**
 *
 * @author Patrick
 */
public class servlet1 extends HttpServlet {

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
            out.println("<title>Servlet servlet1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet servlet1 at " + request.getContextPath() + "</h1>");
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
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String LastName = request.getParameter("ln");
        String FirstName = request.getParameter("fn");
        String Destination = request.getParameter("destination");
        String Name = FirstName + " " + LastName;
        double fare = 0.0;
        
        switch (Destination) {
            case "QA":
                out.println("<pre>The fare amount to <b>QUEZON AVENUE</b> station (STOP 1) from North Avenue Station is P10.00\n" +
                        "Passenger name is "+ FirstName + " "+ LastName + "<br><br>" +"Total Fare: P10.00</pre>");
                fare += 10.0;
                break;
            case "GMA":
                out.println("<pre>The fare amount to <b>GMA KAMUNING</b> station (STOP 1) from North Avenue Station is P10.00\n" +
                        "Passenger name is "+ FirstName + " "+ LastName + "<br><br>" +"Total Fare: P10.00</pre>");
                fare += 10.0;
                break;
            case "C":
                out.println("<pre>The fare amount to <b>CUBAO</b> station (STOP 2) from North Avenue Station is P11.00\n" +
                        "Passenger name is "+ FirstName + " "+ LastName + "<br><br>" +"Total Fare: P11.00</pre>");
                fare += 11.0;
                break;
            case "S":
                out.println("<pre>The fare amount to <b>SANTOLAN</b> station (STOP 2) from North Avenue Station is P11.00\n" +
                        "Passenger name is "+ FirstName + " "+ LastName + "<br><br>" +"Total Fare: P11.00</pre>");
                fare += 11.0;
                break;
            case "O":
                out.println("<pre>The fare amount to <b>ORTIGAS</b> station (STOP 3) from North Avenue Station is P12.00\n" +
                        "Passenger name is "+ FirstName + " "+ LastName + "<br><br>" +"Total Fare: P12.00</pre>");
                fare += 12.0;
                break;
            case "SB":
                out.println("<pre>The fare amount to <b>SHAW BOULEVARD</b> station (STOP 3) from North Avenue Station is P12.00\n" +
                        "Passenger name is "+ FirstName + " "+ LastName + "<br><br>" +"Total Fare: P12.00</pre>");
                fare += 12.0;
                break;
            case "BA":
                out.println("<pre>The fare amount to <b>BONI AVENUE</b> station (STOP 4) from North Avenue Station is P13.00\n" +
                        "Passenger name is "+ FirstName + " "+ LastName + "<br><br>" +"Total Fare: P13.00</pre>");
                fare += 13.0;
                break;
            case "G":
                out.println("<pre>The fare amount to <b>GUADALUPE</b> station (STOP 4) from North Avenue Station is P13.00\n" +
                        "Passenger name is "+ FirstName + " "+ LastName + "<br><br>" +"Total Fare: P13.00</pre>");
                fare += 13.0;
                break;
            case "B":
                out.println("<pre>The fare amount to <b>BUENDIA</b> station (STOP 5) from North Avenue Station is P14.00\n" +
                        "Passenger name is "+ FirstName + " "+ LastName + "<br><br>" +"Total Fare: P14.00</pre>");
                fare += 14.0;
                break;
            case "A":
                out.println("<pre>The fare amount to <b>AYALA</b> station (STOP 5) from North Avenue Station is P14.00\n" +
                        "Passenger name is "+ FirstName + " "+ LastName + "<br><br>" +"Total Fare: P14.00</pre>");
                fare += 14.0;
                break;
            case "M":
                out.println("<pre>The fare amount to <b>MAGALLANES</b> station (STOP 6) from North Avenue Station is P15.00\n" +
                        "Passenger name is "+ FirstName + " "+ LastName + "<br><br>" +"Total Fare: P15.00</pre>");
                fare += 15.0;
                break;
            case "TA":
                out.println("<pre>The fare amount to <b>TAFT AVENUE</b> station (STOP 6) from North Avenue Station is P15.00\n" +
                        "Passenger name is "+ FirstName + " "+ LastName + "<br><br>" +"Total Fare: P15.00</pre>");
                fare += 15.0;
                break;
            }
        
        Cookie ck = new Cookie("dest",Destination);
        Cookie ck2 = new Cookie("name",Name);
        response.addCookie(ck);
        response.addCookie(ck2);
        out.print("<form action='servlet2' method='post'>");
        out.print("<input type='submit' value='go'>");
        out.print("</form>");
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
