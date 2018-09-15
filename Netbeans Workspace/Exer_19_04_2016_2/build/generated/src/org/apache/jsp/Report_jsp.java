package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Report_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Email / Registration</title>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor = \"#98FF98\">\n");
      out.write("        \n");
      out.write("        ");

           String un = request.getParameter("cpw"),
           pw = request.getParameter("pw");
           
           if(un.equals(pw)){
               try{
              int age = Integer.parseInt(request.getParameter("age"));
        
      out.write("\n");
      out.write("        <font >\n");
      out.write("        <h1> Email / Registration </h1>\n");
      out.write("        <pre>\n");
      out.write("\n");
      out.write("\n");
      out.write("         First name:    ");
      out.print(request.getParameter("fn"));
      out.write(" \n");
      out.write("\n");
      out.write("         Last name:     ");
      out.print(request.getParameter("ln"));
      out.write(" \n");
      out.write("\n");
      out.write("         Middle name:   ");
      out.print(request.getParameter("mn"));
      out.write(" \n");
      out.write("\n");
      out.write("         Nickname:      ");
      out.print(request.getParameter("bd"));
      out.write(" \n");
      out.write("\n");
      out.write("         Age:           ");
      out.print(age);
      out.write(" \n");
      out.write("        </pre>\n");
      out.write("        </font>\n");
      out.write("        ");

               }
               catch(Exception e){        
        
      out.write("\n");
      out.write("          <h1> Error! invalid input </h1>\n");
      out.write("          ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "index.jsp", out, false);
      out.write("    \n");
      out.write("        ");
 
               }
           }
           else {
        
      out.write("\n");
      out.write("        <font face=\"lucida console\" color=\"red\" size=\"2\">\n");
      out.write("        <h1> Error! password and confirm password mismatch </h1>\n");
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
