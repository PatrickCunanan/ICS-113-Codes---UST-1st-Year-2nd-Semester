/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Payslip;

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
public class Payslip extends HttpServlet {

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
            out.println("<title>Servlet Payslip</title>");   
            out.println("<script type=\"text/javascript\">\n" +
                        "          function Gross()\n" + "          {\n" + "\n" +
                        "             var BasicPay = document.grossform.bp.value;\n" +
                        "             var OvertimePay = document.grossform.op.value;\n" +
                        "             var Gross = parseFloat(BasicPay) + parseFloat(OvertimePay);\n" +
                        "             document.getElementById('gp').value = Gross;\n" +
                        "          }\n" + "        </script>");
            out.println("<script type=\"text/javascript\">\n" +
                        "          function Deduct()\n" + "          {\n" + "\n" +
                        "             var SSS = document.deductform.sss.value;\n" +
                        "             var Pagibig = document.deductform.pib.value;\n" +
                        "             var Loans = document.deductform.lns.value;\n" +
                        "             var TotalDeduction = parseFloat(SSS) + parseFloat(Pagibig) + parseFloat(Loans);\n" +
                        "             document.getElementById('td').value = TotalDeduction;\n" +
                        "          }\n" + "        </script>");
            out.println("<script type=\"text/javascript\">\n" +
                        "          function Net()\n" + "          {\n" + "\n" +
                        "             var GP = document.grossform.grosspay.value;\n" +
                        "             var TD = document.deductform.totaldeduction.value;\n" +
                        "             var NetPay = parseFloat(GP) - parseFloat(TD);\n" +
                        "             document.getElementById('n').value = NetPay;\n" +
                        "          }\n" + "        </script>");
            out.println("</head>");
            out.println("<body>");
            out.println("<pre><h1>Payslip Servlet</h1>");
            out.println("<form name=\"grossform\"method = \"post\">");
            out.println("Last Name:     <input type=\"text\" name=\"ln\"><br>");
            out.println("First Name:    <input type=\"text\" name=\"fn\"><br>");
            out.println("Middle Name:   <input type=\"text\" name=\"mn\"><br>");
            out.println("     Basic Pay:      <input type=\"text\" name=\"bp\"><br>");
            out.println("     Overtime Pay:   <input type=\"text\" name=\"op\"><br>");
            out.println("     <input type=\"button\" name=\"Gross Pay\" Value=\"Gross Pay\" onClick=\"Gross()\"/>" + 
                        "     <input type=\"text\" disabled=\"disabled\" id=\"gp\" name=\"grosspay\" value=\"\"/>");
            out.println("</form>");
            out.println("<form name=\"deductform\"><h3>Deductions:</h3>");
            out.println("     SSS:            <input type=\"text\" name=\"sss\"><br>");
            out.println("     Pag-ibig:       <input type=\"text\" name=\"pib\"><br>");
            out.println("     Loans:          <input type=\"text\" name=\"lns\"><br>");
            out.println("     <input type=\"button\" name=\"Total Dedcutions\" Value=\"Total Deductions\" onClick=\"Deduct()\"/>" + 
                        "     <input type=\"text\" disabled=\"disabled\" id=\"td\" name=\"totaldeduction\" value=\"\"/>");
            out.println("</form>");
            out.println("</form>");
            out.println("<form name=\"netform\">");
            out.println("     <input type=\"button\" name=\"Net Pay\" Value=\"Net Pay\" onClick=\"Net()\"/>" + 
                        "     <input type=\"text\" disabled=\"disabled\" id=\"n\" name=\"netpay\" value=\"\"/>");
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
