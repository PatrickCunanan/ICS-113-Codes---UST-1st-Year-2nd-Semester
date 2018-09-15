/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoPost_Arithmetic;

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
public class DoPost_Arithmetic extends HttpServlet {

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
            out.println("<title>Servlet DoPost_Arithmetic</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1 align = \"center\">Calculator</h1>");
            out.println("<form method = \"post\">");
            out.println("<p align = \"center\">First Operand:<input type=\"text\" name=\"num1\"></p>");
            out.println("<p align = \"center\">Operator:");
            out.println("<select name=\"operator\">\n"
                    + "    <option value=\"add\" selected>Addition (+)</option>\n"
                    + "    <option value=\"sub\">Subtraction (-)</option>\n"
                    + "    <option value=\"mult\">Multiplication (*)</option>\n"
                    + "    <option value=\"div\">Division (/)</option>\n"
                    + "</select>");
            out.println("<p align = \"center\">Second Operand:<input type=\"text\" name=\"num2\"></p><br>");
            out.println("<p align = \"center\"><input type=\"submit\" value=\"Calculate\"></p>");
            out.println("</form>");
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
        double num1 = Double.parseDouble(request.getParameter("num1"));
        double num2 = Double.parseDouble(request.getParameter("num2"));
        String op = request.getParameter("operator");
        try {
            if (null != op) {
                switch (op) {
                    case "add":
                        out.println("<h1 align = \"center\">Result: The sum of " + num1 + " and " + num2 + " is " + (num1 + num2) + "</h1>");
                        break;
                    case "sub":
                        out.println("<h1 align = \"center\">Result: The difference of " + num1 + " and " + num2 + " is " + (num1 - num2) + "</h1>");
                        break;
                    case "mult":
                        out.println("<h1 align = \"center\">Result: The product of " + num1 + " and " + num2 + " is " + (num1 * num2) + "</h1>");
                        break;
                    case "div":
                        if (num2 == 0) {
                            out.println("<h1 align = \"center\">Result: The second operand should not be equal to 0.</h1>");
                        } else {
                            out.println("<h1 align = \"center\">Result: The quotient of " + num1 + " and " + num2 + " is " + (num1 / num2) + "</h1>");
                        }
                        break;
                }
            }
        } catch (NumberFormatException n) {
            out.println("<h1>Wrong Input!</h1>");
            n.printStackTrace();
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
