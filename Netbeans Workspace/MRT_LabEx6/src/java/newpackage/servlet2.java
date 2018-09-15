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
public class servlet2 extends HttpServlet {

    static Cookie ck[];
    static int s1=0, s2=0, s3=0, s4=0, s5=0, s6=0, s7=0, s8=0, s9=0, s10=0, s11=0, s12=0;
    static double fare1 = 0.0, fare2 =0.0, fare3 =0.0, fare4 =0.0, fare5 =0.0, fare6 =0.0, fare7 =0.0, fare8 =0.0, fare9 =0.0, fare10 =0.0, fare11 =0.0, fare12 =0.0;
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
            out.println("<title>Servlet servlet2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet servlet2 at " + request.getContextPath() + "</h1>");
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
        int i =0 ;
        ck = request.getCookies();
        while( i < ck.length-1){
        switch (ck[i].getValue()){
            case "QA":
                s1+=1;
                fare1 += 10.0;
                out.println("Station: " + ck[i].getValue() + " Total Passengers on Station:" + s1 + "\nTotal Profit: " + fare1);
                break;
            case "GMA":
                s2+=1;
                fare2 += 10.0;
                out.println("Station: " + ck[i].getValue() + " Total Passengers on Station:" + s2 + "\nTotal Profit: " + fare2);
                break;
            case "C":
                s3+=1;
                fare3 += 11.0;
                out.println("Station: " + ck[i].getValue() + " Total Passengers on Station:" + s3 + "\nTotal Profit: " + fare3);
                break;
            case "S":
               s4+=1;
                fare4 += 11.0;
                out.println("Station: " + ck[i].getValue() + " Total Passengers on Station:" + s4 + "\nTotal Profit: " + fare4);
                break;
            case "O":
               s5+=1;
                fare5 += 12.0;
                out.println("Station: " + ck[i].getValue() + " Total Passengers on Station:" + s5 + "\nTotal Profit: " + fare5);
                break;
            case "SB":
               s6+=1;
                fare6 += 12.0;
                out.println("Station: " + ck[i].getValue() + " Total Passengers on Station:" + s6 + "\nTotal Profit: " + fare6);
                break;
            case "BA":
               s7+=1;
                fare7 += 13.0;
                out.println("Station: " + ck[i].getValue() + " Total Passengers on Station:" + s7 + "\nTotal Profit: " + fare7);
                break;
            case "G":
                s8+=1;
                fare8 += 13.0;
                out.println("Station: " + ck[i].getValue() + " Total Passengers on Station:" + s8 + "\nTotal Profit: " + fare8);
                break;
            case "B":
                s9+=1;
                fare9 += 14.0;
                out.println("Station: " + ck[i].getValue() + " Total Passengers on Station:" + s9 + "\nTotal Profit: " + fare9);
                break;
            case "A":
                s10+=1;
                fare10 += 14.0;
                out.println("Station: " + ck[i].getValue() + " Total Passengers on Station:" + s10 + "\nTotal Profit: " + fare10);
                break;
            case "M":
                s11+=1;
                fare11 += 15.0;
                out.println("Station: " + ck[i].getValue() + " Total Passengers on Station:" + s11 + "\nTotal Profit: " + fare11);
                break;
            case "TA":
                s12+=1;
                fare12 += 15.0;
                out.println("Station: " + ck[i].getValue() + " Total Passengers on Station:" + s12 + "\nTotal Profit: " + fare12);
                break;
        }
        i++;
        }
        out.println("<a href = 'index.html'> Main Menu </a>");
        out.close();
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
