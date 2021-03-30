package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entity.Product;
import java.util.Vector;

public final class section_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");
 Vector<Product> vectorpProducts = (Vector<Product>) request.getAttribute("hienthi");

        
      out.write("\n");
      out.write("        <div class=\"list_item\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    ");
 for (Product product : vectorpProducts) {
      out.write("\n");
      out.write("                    <div class=\"col-xs-12 col-sm-6 col-md-3\">\n");
      out.write("                        <div class=\"conten1-2-3\">\n");
      out.write("                            <div class=\"box\">\n");
      out.write("                                <div class=\"img-box\" style=\"width:100%\">\n");
      out.write("                                    <img style=\"width: 100%\" src=\"");
      out.print(product.getImg());
      out.write("\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"conten-box\" style=\"text-align: left; size: 40px; padding-left: 10px\">\n");
      out.write("                                    <a href=\"\"><h2>");
      out.print(product.getProducName());
      out.write("</h2>\n");
      out.write("                                    </a>\n");
      out.write("                                    <h3>");
      out.print(product.getPrice());
      out.write("</h3>\n");
      out.write("                                    <p>");
      out.print(product.getDescriptions());
      out.write("</p>\n");
      out.write("                                    \n");
      out.write("<!--                                    <div class=\"container\">\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-lg-12\">\n");
      out.write("                                                <div class=\"star-rating\">\n");
      out.write("                                                    <span class=\"fa fa-star-o\" data-rating=\"1\"></span>\n");
      out.write("                                                    <span class=\"fa fa-star-o\" data-rating=\"2\"></span>\n");
      out.write("                                                    <span class=\"fa fa-star-o\" data-rating=\"3\"></span>\n");
      out.write("                                                    <span class=\"fa fa-star-o\" data-rating=\"4\"></span>\n");
      out.write("                                                    <span class=\"fa fa-star-o\" data-rating=\"5\"></span>\n");
      out.write("                                                    <input type=\"hidden\" name=\"whatever1\" class=\"rating-value\" value=\"2.56\">\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-lg-12\">\n");
      out.write("                                                <div class=\"star-rating\">\n");
      out.write("                                                    <span class=\"fa fa-star-o\" data-rating=\"1\"></span>\n");
      out.write("                                                    <span class=\"fa fa-star-o\" data-rating=\"2\"></span>\n");
      out.write("                                                    <span class=\"fa fa-star-o\" data-rating=\"3\"></span>\n");
      out.write("                                                    <span class=\"fa fa-star-o\" data-rating=\"4\"></span>\n");
      out.write("                                                    <span class=\"fa fa-star-o\" data-rating=\"5\"></span>\n");
      out.write("                                                    <input type=\"hidden\" name=\"whatever2\" class=\"rating-value\" value=\"1.9\">\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-lg-12\">\n");
      out.write("                                                <div class=\"star-rating\">\n");
      out.write("                                                    <span class=\"fa fa-star-o\" data-rating=\"1\"></span>\n");
      out.write("                                                    <span class=\"fa fa-star-o\" data-rating=\"2\"></span>\n");
      out.write("                                                    <span class=\"fa fa-star-o\" data-rating=\"3\"></span>\n");
      out.write("                                                    <span class=\"fa fa-star-o\" data-rating=\"4\"></span>\n");
      out.write("                                                    <span class=\"fa fa-star-o\" data-rating=\"5\"></span>\n");
      out.write("                                                    <input type=\"hidden\" name=\"whatever3\" class=\"rating-value\" value=\"4.1\">\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        \n");
      out.write("                                    </div>-->\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("                <script>\n");
      out.write("                    \n");
      out.write(" var $star_rating = $('.star-rating .fa');\n");
      out.write("\n");
      out.write("var SetRatingStar = function() {\n");
      out.write("  return $star_rating.each(function() {\n");
      out.write("    if (parseInt($star_rating.siblings('input.rating-value').val()) >= parseInt($(this).data('rating'))) {\n");
      out.write("      return $(this).removeClass('fa-star-o').addClass('fa-star');\n");
      out.write("    } else {\n");
      out.write("      return $(this).removeClass('fa-star').addClass('fa-star-o');\n");
      out.write("    }\n");
      out.write("  });\n");
      out.write("};\n");
      out.write("\n");
      out.write("$star_rating.on('click', function() {\n");
      out.write("  $star_rating.siblings('input.rating-value').val($(this).data('rating'));\n");
      out.write("  return SetRatingStar();\n");
      out.write("});\n");
      out.write("\n");
      out.write("SetRatingStar();\n");
      out.write("$(document).ready(function() {\n");
      out.write("\n");
      out.write("});\n");
      out.write("                </script>\n");
      out.write("<!--        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"./assets/js/jquery-1.9.1.min.js\"></script> \n");
      out.write("        <script src=\"./owl-carousel/owl.carousel.js\"></script>-->\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
