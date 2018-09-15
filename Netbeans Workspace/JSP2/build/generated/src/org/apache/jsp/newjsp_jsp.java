package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 private int access = 0;
        
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
Date date = new Date();
      out.write("\n");
      out.write("        <form name = form1>\n");
      out.write("        Enter first number: <input type=\"text\" name=\"a\" value=\"\" />\n");
      out.write("        Enter second number: <input type=\"text\" name=\"b\" value=\"\" />\n");
      out.write("        \n");
      out.write("        <br>Sum: <input type=\"text\" name=\"sum\" value=\"\" />\n");
      out.write("        <br>Difference:   <input type=\"text\" name=\"diff\" value=\"\" />\n");
      out.write("        <br>Product:   <input type=\"text\" name=\"prod\" value=\"\" />\n");
      out.write("        <br>Quotient:   <input type=\"text\" name=\"quo\" value=\"\" />\n");
      out.write("        <<input type=\"button\" value=\"Click!\" onclick=calc(); />\n");
      out.write("        <h1>number of access: ");
      out.print(++access);
      out.write("</h1>\n");
      out.write("        <h1>Date is : ");
      out.print(date);
      out.write("\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            function calc(){\n");
      out.write("                    var x = parseInt(document.form1.a.value);\n");
      out.write("                    var y = parseInt(document.form1.b.value);\n");
      out.write("                   document.form1.sum.value = x + y;\n");
      out.write("                   document.form1.diff.value = x - y;\n");
      out.write("                    document.form1.prod.value = x * y;\n");
      out.write("                    document.form1.quo.value = x / y;\n");
      out.write("            }\n");
      out.write("            </script>\n");
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
