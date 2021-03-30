package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <title>Page Title</title>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"main.css\" />\n");
      out.write("    <script src=\"main.js\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"./css/style5.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"./css/style_login.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-12\">\n");
      out.write("                <div class=\"pr-wrap\">\n");
      out.write("                    <div class=\"pass-reset\">\n");
      out.write("                        <label>\n");
      out.write("                            Enter the email you signed up with</label>\n");
      out.write("                        <input type=\"email\" placeholder=\"Email\" />\n");
      out.write("                        <input type=\"submit\" value=\"Submit\" class=\"pass-reset-submit btn btn-success btn-sm\" />\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"wrap\">\n");
      out.write("                    <p class=\"form-title\">\n");
      out.write("                        Sign In</p>\n");
      out.write("                    <form class=\"login\">\n");
      out.write("                    <input type=\"text\" placeholder=\"Username\" />\n");
      out.write("                    <input type=\"password\" placeholder=\"Password\" />\n");
      out.write("                    <input type=\"submit\" value=\"Sign In\" class=\"btn btn-success btn-sm\" />\n");
      out.write("                    <div class=\"remember-forgot\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <div class=\"checkbox\">\n");
      out.write("                                    <label>\n");
      out.write("                                        <input type=\"checkbox\" />\n");
      out.write("                                        Remember Me\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6 forgot-pass-content\">\n");
      out.write("                                <a href=\"javascription:void(0)\" class=\"forgot-pass\">Forgot Password</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("    </div>\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-1.12.0.min.js\"></script>\n");
      out.write("    <script src=\"./js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"./js/login.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
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
