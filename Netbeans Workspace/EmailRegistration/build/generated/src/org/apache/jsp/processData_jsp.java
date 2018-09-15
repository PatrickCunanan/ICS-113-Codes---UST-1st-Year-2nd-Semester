package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Calendar;

public final class processData_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <style>\n");
      out.write("            p.border {\n");
      out.write("                border-style: double;\n");
      out.write("                border-width: thick;\n");
      out.write("                border-color: white;\n");
      out.write("                white-space: pre-wrap;\n");
      out.write("                text-align: justify;\n");
      out.write("                margin: 0 auto;\n");
      out.write("                width: 30em;\n");
      out.write("                color: white;\n");
      out.write("                font-family: \"Helvetica Neue\", Helvetica, Arial, sans-serif;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            h1.style {\n");
      out.write("                font-family: \"Helvetica Neue\", Helvetica, Arial, sans-serif;\n");
      out.write("                text-align: center;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor = \"#98FF98\">\n");
      out.write("        \n");
      out.write("        ");

           String CPW = request.getParameter("cpw");
           String PW = request.getParameter("pw");
           
           if(CPW.equals(PW)){
              int year = Integer.parseInt(request.getParameter("ye"));
              int usermonth = Integer.parseInt(request.getParameter("mo"));
              int userdate = Integer.parseInt(request.getParameter("da"));
        
      out.write("\n");
      out.write("        <h1> Email / Registration </h1>\n");
      out.write("         First name:    ");
      out.print(request.getParameter("fn"));
      out.write("  \n");
      out.write("         Middle name:   ");
      out.print(request.getParameter("mn"));
      out.write("\n");
      out.write("         Last name:     ");
      out.print(request.getParameter("ln"));
      out.write("\n");
      out.write("         Nickname:      ");
      out.print(request.getParameter("nn"));
      out.write("     \n");
      out.write("        ");

           int currentyear = Calendar.getInstance().get(Calendar.YEAR);
           int month = Calendar.getInstance().get(Calendar.MONTH);
           int date = Calendar.getInstance().get(Calendar.DATE);
           int age;
           age = currentyear - year;
           if(usermonth > month && date < userdate)
             age -= 1;
            
      out.write("\n");
      out.write("         Age:           ");
      out.print(age);
      out.write(" \n");
      out.write("        ");
 
           }
           else {
        
      out.write("\n");
      out.write("        <font face=\"lucida console\" color=\"red\" size=\"2\">\n");
      out.write("            <h1> Error! passwords do not match </h1>\n");
      out.write("            <h1> input username and password again </h1>\n");
      out.write("        </font>\n");
      out.write("          ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "index.jsp", out, false);
      out.write("\n");
      out.write("        ");

           }
      out.write("\n");
      out.write("                \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
