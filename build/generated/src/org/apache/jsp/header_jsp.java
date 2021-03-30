package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("        <title>WEB</title>\n");
      out.write("        <!-- Bootstrap -->\n");
      out.write("        <!-- <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/> -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/blog.css\">\n");
      out.write("        <link href=\"css/mdb.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/style_login.css\">   \n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/style.css\" />\n");
      out.write("        <!-- Owl Carousel Assets -->\n");
      out.write("        <link href=\"./owl-carousel/owl.carousel.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"./owl-carousel/owl.theme.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"./owl-carousel/owl.transitions.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String user=(String)session.getAttribute("username");
        
      out.write("\n");
      out.write("        <nav class=\"container-fluid navbar navbar-default row \" style=\"margin: 0px;\" role=\"navigation\">\n");
      out.write("            <div class=\"collapse navbar-collapse navbar-ex1-collapse\">\n");
      out.write("                <form action=\"#\" class=\"navbar-form navbar-left\" role=\"search\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Search\">\n");
      out.write("                    </div>\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-default\">\n");
      out.write("                        <span class=\"glyphicon glyphicon-search\"></span> Search</button>\n");
      out.write("                </form>\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    <!-- <a class=\"btn btn-primary\" >Trigger modal</a> -->\n");
      out.write("                    \n");
      out.write("                    <li>\n");
      out.write("                        <a data-toggle=\"modal\" href='#modal-id' href=\"#\">\n");
      out.write("                            <span class=\"glyphicon glyphicon-user\"></span>login</a>\n");
      out.write("                    </li>\n");
      out.write("                \n");
      out.write("\n");
      out.write("                    <li class=\"Cart\">\n");
      out.write("                        <a href=\"#\">\n");
      out.write("                            <span class=\"glyphicon glyphicon-shopping-cart\"></span>Cart</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <div class=\"modal fade\" id=\"modal-id\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6 col-md-offset-3\">\n");
      out.write("                            <div class=\"panel panel-login\">\n");
      out.write("                                <div class=\"panel-heading\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-xs-6\">\n");
      out.write("                                            <a class=\"active\" id=\"login-form-link\">Login</a>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-xs-6\">\n");
      out.write("                                            <a  id=\"register-form-link\">Register</a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <hr>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"panel-body\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-lg-12\">\n");
      out.write("                                            <form id=\"login-form\" action=\"Product_controller\" method=\"post\" role=\"form\" style=\"display: block;\">\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <input style=\"width: 90%\" type=\"text\" name=\"username\" id=\"username\" tabindex=\"1\" class=\"form-control\" placeholder=\"Username\" value=\"\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <input style=\"width: 90%\" type=\"password\" name=\"password\" id=\"password\" tabindex=\"2\" class=\"form-control\" placeholder=\"Password\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"form-group text-center\">\n");
      out.write("                                                    <input type=\"checkbox\" tabindex=\"3\" class=\"\" name=\"remember\" id=\"remember\">\n");
      out.write("                                                    <label for=\"remember\"> Remember Me</label>\n");
      out.write("                                                </div>\n");
      out.write("                                                <input type=\"hidden\" name=\"service\" value=\"login\">\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <div class=\"row\">\n");
      out.write("                                                        <div class=\"col-sm-6 col-sm-offset-3\">\n");
      out.write("                                                            <input style=\"width: 100px;\" type=\"submit\" name=\"login-submit\" id=\"login-submit\" tabindex=\"4\" class=\"form-control btn btn-login\" value=\"Log In\">\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <div class=\"row\">\n");
      out.write("                                                        <div class=\"col-lg-12\">\n");
      out.write("                                                            <div class=\"text-center\">\n");
      out.write("                                                                <a href=\"#\" tabindex=\"5\" class=\"forgot-password\">Forgot Password?</a>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </form>\n");
      out.write("                                            <form id=\"register-form\" action=\"#\" method=\"post\" role=\"form\" style=\"display: none;\">\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <input style=\"width: 90%\"  type=\"text\" name=\"username\" id=\"username\" tabindex=\"1\" class=\"form-control\" placeholder=\"Username\" value=\"\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <input style=\"width: 90%\"  type=\"email\" name=\"email\" id=\"email\" tabindex=\"1\" class=\"form-control\" placeholder=\"Email Address\" value=\"\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <input style=\"width: 90%\"  type=\"password\" name=\"password\" id=\"password\" tabindex=\"2\" class=\"form-control\" placeholder=\"Password\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <input style=\"width: 90%\"  type=\"password\" name=\"confirm-password\" id=\"confirm-password\" tabindex=\"2\" class=\"form-control\" placeholder=\"Confirm Password\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <div class=\"row\">\n");
      out.write("                                                        <div class=\"col-sm-6 col-sm-offset-3\">\n");
      out.write("                                                            <input style=\"width: 100px;\" type=\"submit\" name=\"register-submit\" id=\"register-submit\" tabindex=\"4\" class=\"form-control btn btn-register\" value=\"Register Now\">\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </form>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>  \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <nav class=\"navbar navbar-inverse\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <a class=\"navbar-brand\" href=\"Product_controller\">\n");
      out.write("                        <img src=\"img/fullimage1.jpg\" style=\"width: 100px\">\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapse navbar-collapse \" id=\"myNavbar\">\n");
      out.write("                    <ul class=\"nav navbar-nav nav-style\">\n");
      out.write("                        <li class=\"dropdown-toggle\">\n");
      out.write("                            <form class=\"navbar-form navbar-left search-input\" role=\"search\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" placeholder=\"Search\">\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-default\">\n");
      out.write("                                        <span class=\"glyphicon glyphicon-search\"></span> Search</button>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li class=\"dropdown\">\n");
      out.write("                            <a href=\"Product_controller\">Home</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"dropdown\">\n");
      out.write("                            <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Sản Phẩm\n");
      out.write("                                <span class=\"caret\"></span>\n");
      out.write("                            </a>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">Đồ uống</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">♠</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">Page 1-3</a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"dropdown\">\n");
      out.write("                            <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Mẹo vật\n");
      out.write("                                <span class=\"caret\"></span>\n");
      out.write("                            </a>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">Page 1-1</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">Page 1-2</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">Page 1-3</a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"dropdown\">\n");
      out.write("                            <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Công thức\n");
      out.write("                                <span class=\"caret\"></span>\n");
      out.write("                            </a>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">Page 1-1</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">Page 1-2</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">Page 1-3</a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right search-input\">\n");
      out.write("                        <li>\n");
      out.write("                            <a data-toggle=\"modal\" href='#modal-id' href=\"#\">\n");
      out.write("                                <span class=\"glyphicon glyphicon-user\"></span>login</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"Cart\">\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <span class=\"glyphicon glyphicon-shopping-cart\"></span>Cart</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </body>\n");
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
