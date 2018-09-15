package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    Throwable exception = org.apache.jasper.runtime.JspRuntimeLibrary.getThrowable(request);
    if (exception != null) {
      response.setStatus((Integer)request.getAttribute("javax.servlet.error.status_code"));
    }
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
      out.write("  \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Email Registration</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <style>\n");
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
      out.write("    </head>\n");
      out.write("    <body background = \"blur.jpg\">\n");
      out.write("        ");

            
            String uName = request.getParameter("name");
            String Lname = request.getParameter("lname");
            String Fname = request.getParameter("fname");
            String Mname = request.getParameter("fname");
            String CN = request.getParameter("cn");
            String Address = request.getParameter("address");
        
      out.write("\n");
      out.write("        <font color=\"#ff0000\"> ");
      out.print( exception );
      out.write(" </font>\n");
      out.write("        <h1 class=\"style\">EMAIL REGISTRATION</h1>\n");
      out.write("        <form action=\"processData.jsp\" method=\"post\">\n");
      out.write("            <p class=\"border\">\n");
      out.write("         Last Name: <input type =\"text\" name=\"lname\" value=\"");
      out.print(Lname);
      out.write("\"><br><br>\n");
      out.write("            First Name: <input type =\"text\" name=\"fname\" value=\"");
      out.print(Fname);
      out.write("\"><br><br>\n");
      out.write("            Middle Name: <input type=\"text\" name=\"mname\" value=\"");
      out.print(Mname);
      out.write("\"><br><br>\n");
      out.write("            Contact Number: <input type =\"text\" name=\"cn\" value=\"");
      out.print(CN);
      out.write("\"><br><br>\n");
      out.write("            City: <input type=\"text\" name=\"address\" value=\"");
      out.print(Address);
      out.write("\"><br><br>\n");
      out.write("            User Name: <input type=\"text\" name=\"name\" value=\"");
      out.print(uName);
      out.write("\"><br><br>\n");
      out.write("            Password: <input type=\"password\" name=\"password\"><br><br>\n");
      out.write("            Confirm Password: <input type=\"password\" name=\"passwordc\"><br><br>\n");
      out.write("            <input type=\"submit\" value=\"Register\">\n");
      out.write("            </p>\n");
      out.write("        </form>\n");
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
