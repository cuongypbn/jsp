package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class slider_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("    <title>WEB</title>\n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("    <!-- <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/> -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\t\t\t\t\n");
      out.write("    <link rel=\"stylesheet\" href=\"./css/style.css\"/>\n");
      out.write("      <!-- Owl Carousel Assets -->\n");
      out.write("      <link href=\"./owl-carousel/owl.carousel.css\" rel=\"stylesheet\">\n");
      out.write("      <link href=\"./owl-carousel/owl.theme.css\" rel=\"stylesheet\">\n");
      out.write("      <link href=\"./owl-carousel/owl.transitions.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("      <link rel=\"stylesheet\" type=\"text/css\" href=\"css/blog.css\">\n");
      out.write("  </head>\n");
      out.write("    <body>\n");
      out.write("              <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                  <div class=\"span12\">\n");
      out.write("                    <div id=\"owl-demo\" class=\"owl-carousel\">\n");
      out.write("                      <div><img src=\"./img/fullimage1.jpg\"></div>\n");
      out.write("                      <div><img src=\"./img/fullimage1.jpg\"></div>\n");
      out.write("                      <div><img src=\"./img/fullimage1.jpg\"></div>\n");
      out.write("                      <div><img src=\"./img/fullimage1.jpg\"></div>\n");
      out.write("                      <div><img src=\"./img/fullimage1.jpg\"></div>\n");
      out.write("                      <div><img src=\"./img/fullimage1.jpg\"></div>\n");
      out.write("                      <div><img src=\"./img/fullimage1.jpg\"></div>\n");
      out.write("                      <div><img src=\"./img/fullimage1.jpg\"></div>\n");
      out.write("                      <div><img src=\"./img/fullimage1.jpg\"></div>\n");
      out.write("                      <div><img src=\"./img/fullimage1.jpg\"></div>\n");
      out.write("                    </div>\n");
      out.write("        \n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("                    <style>\n");
      out.write("            #owl-demo .owl-item div{\n");
      out.write("              padding:5px;\n");
      out.write("            }\n");
      out.write("            #owl-demo .owl-item img{\n");
      out.write("              display: block;\n");
      out.write("              width: 100%;\n");
      out.write("              height: auto;\n");
      out.write("              -webkit-border-radius: 3px;\n");
      out.write("              -moz-border-radius: 3px;\n");
      out.write("              border-radius: 3px;\n");
      out.write("            }\n");
      out.write("            </style>\n");
      out.write("        \n");
      out.write("            <script>\n");
      out.write("\n");
      out.write("            $(document).ready(function() {\n");
      out.write("              $(\"#owl-demo\").owlCarousel({\n");
      out.write("                autoPlay : 3000,\n");
      out.write("                stopOnHover : true,\n");
      out.write("                navigation:false,\n");
      out.write("                paginationSpeed : 1000,\n");
      out.write("                goToFirstSpeed : 2000,\n");
      out.write("                singleItem : true,\n");
      out.write("                autoHeight : true,\n");
      out.write("                transitionStyle:\"fade\"\n");
      out.write("              });\n");
      out.write("            });\n");
      out.write("         </script>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"./assets/js/jquery-1.9.1.min.js\"></script> \n");
      out.write("<script src=\"./owl-carousel/owl.carousel.js\"></script>\n");
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
