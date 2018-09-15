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
                        "             var BasicPay = document.payslip.bp.value;\n" +
                        "             var OvertimePay = document.payslip.op.value;\n" +
                        "             var Gross = parseFloat(BasicPay) + parseFloat(OvertimePay);\n" +
                        "             document.getElementById('gp').value = Gross;}\n"+
                        "          function Deduct()\n" + "          {\n" + "\n" +
                        "             var Housing = document.payslip.hsg.value;\n" +
                        "             var Loans = document.payslip.lns.value;\n" +
                        "             var TotalDeduction = parseFloat(Housing) + parseFloat(Loans);\n" +
                        "             document.getElementById('td').value = TotalDeduction;}\n" +
                        "          function Net()\n" + "          {\n" + "\n" +
                        "             var GP = document.payslip.grosspay.value;\n" +
                        "             var TD = document.payslip.totaldeduction.value;\n" +
                        "             var NetPay = parseFloat(GP) - parseFloat(TD);\n" +
                        "             document.getElementById('n').value = NetPay;\n" +
                        "          }\n" + "        </script>");
            out.println("</head>");
            out.println("<body>");
            out.println("<pre><h1>Payslip Servlet</h1>");
            out.println("<form name=\"payslip\" method = \"post\">");
            out.println("<pre>Last Name:     <input type=\"text\" name=\"ln\"><br>");
            out.println("First Name:    <input type=\"text\" name=\"fn\"><br>");
            out.println("Middle Name:   <input type=\"text\" name=\"mn\"><br>");
            out.println("     Basic Pay:      <input type=\"text\" name=\"bp\"><br>");
            out.println("     Overtime Pay:   <input type=\"text\" name=\"op\"><br>");
            out.println("     <input type=\"button\" name=\"Gross Pay\" Value=\"Gross Pay\" onClick=\"Gross()\"/>" + 
                        "     <input type=\"text\" readonly id=\"gp\" name=\"grosspay\"><br>");
            out.println("Deductions<br>");
            out.println("     Loans:          <input type=\"text\" name=\"lns\"><br>");
            out.println("     Housing:        <input type=\"text\" name=\"hsg\"><br>");
            out.println("     <input type=\"button\" name=\"Total Dedcutions\" Value=\"Total Deductions\" onClick=\"Deduct()\"/>" + 
                        "     <input type=\"text\"  id=\"td\" name=\"totaldeduction\"><br>");
            out.println("     <input type=\"button\" name=\"Net Pay\" Value=\"Net Pay\" onClick=\"Net()\"/>" + 
                        "     <input type=\"text\" readonly id=\"n\" name=\"netpay\"><br>");
            out.println("Designation: <select name=\"designation\">\n" +
                        "    <option value=\"DeptHead\" selected>Department Head</option>\n" +
                        "    <option value=\"Manager\">Manager</option>\n" +
                        "    <option value=\"RankFile\">Rank and File</option>\n" +
                        "</select><br>");
            out.println("<input type=\"submit\" value=\"Compute\"></pre>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            PrintWriter out = response.getWriter();
            String LastName = request.getParameter("ln");
            String FirstName = request.getParameter("fn");
            String MiddleName = request.getParameter("mn");
            String BasicPay = request.getParameter("bp");
            String OvertimePay = request.getParameter("op");
            String GrossPay = request.getParameter("grosspay");
            String Loans = request.getParameter("lns");
            String Housing = request.getParameter("hsg");
            String TotalDeduction = request.getParameter("totaldeduction");
            double NP = Double.parseDouble(request.getParameter("netpay"));
            String Designation = request.getParameter("designation");
            double total = 0;
            
            switch (Designation) {
            case "DeptHead":
                total = NP + 3000.00;
                break;
            case "Manager":
                total = NP + 2000.00;
                break;
            case "RankFile":
                total = NP + 1000.00;
                break;
        }
            out.println("<h1>Payslip</h1>");
            out.println("<pre>" + LastName + ", " + FirstName + " " + MiddleName + "");
            out.println("Basic Pay:        " + BasicPay);
            out.println("OvertimePay Pay:  " + OvertimePay);
            out.println("Gross Pay:        " + GrossPay);
            out.println("Deductions");
            out.println("   Loans:            " + Loans);
            out.println("   Housing:          " + Housing);
            out.println("   Total Deductions: " + TotalDeduction);
            switch (Designation) {
            case "DeptHead":
                out.println("Designation: Department Head: 3000>");
                break;
            case "Manager":
                out.println("Designation: Manager: 2000");
                break;
            case "RankFile":
                out.println("Designation: Rank and File: 1000");
                break;
        }
            out.println("Net Pay:          " + total);
            out.println("</pre>");
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
