package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Enumeration;
import entity.Information_coffe;
import java.util.Vector;

public final class Giohang_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <section class=\"container\" style=\"background: #ffffff\" >\n");
      out.write("            <div class=\"row ttsanpham\">\n");
      out.write("                <div class=\"col-sm-4 col-md-12\">\n");
      out.write("                    <form action=\"\" method=\"\" name=\"\" class=\"\">\n");
      out.write("\n");
      out.write("                        <table class=\"table table-responsive table-hover cart_coffe\">\n");
      out.write("                            <thead >\n");
      out.write("                                <tr>\n");
      out.write("                                    <th></th>\n");
      out.write("                                    <th style=\"text-align: center; font-size: 20px;\">Tên sản phẩm</th>\n");
      out.write("                                    <th style=\"text-align: center; font-size: 20px;\">Số lượng</th>\n");
      out.write("                                    <th style=\"text-align: center; font-size: 20px;\">Giá tiền</th>\n");
      out.write("                                    <th style=\"text-align: center; font-size: 20px;\">xóa</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("                                ");

                                    Enumeration enumeration = session.getAttributeNames();
                                    Information_coffe information_coffe;
                                    int tg = 0;
                                    while (enumeration.hasMoreElements()) {
                                        tg++;
                                        String key = (String) enumeration.nextElement().toString();
//                                         int soluong = (int) Integer.parseInt(request.getAttribute("soluong").toString());
                                        if (!key.equalsIgnoreCase("user")) {
                                            information_coffe = (Information_coffe) session.getAttribute(key);
//                                            int soluong = (int) Integer.parseInt(request.getAttribute("soluong").toString());


                                
      out.write("\n");
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("\n");
      out.write("                                    <th >\n");
      out.write("                                        <img src=\"img/sp.jpg\" style=\"height: 50px;\" class=\"rounded float-left\" alt=\"anh\">\n");
      out.write("                                    </th>\n");
      out.write("                                    <th style=\"text-align: center; font-size: 20px;\">");
      out.print(information_coffe.getContex());
      out.write("</th>\n");
      out.write("                                    <th style=\"text-align: center; font-size: 20px;\">\n");
      out.write("                                        <div  class=\"quantity\" style=\" height: 52px; width:100%; margin-left: 90px;\">\n");
      out.write("                                            <input style=\"color: #333\" type=\"number\" min=\"1\" max=\"100\" step=\"1\" value=\"");
      out.print(information_coffe.getSoluong());
      out.write("\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </th>\n");
      out.write("                                    <th style=\"text-align: center; font-size: 20px;\">");
      out.print(information_coffe.getGia());
      out.write("</th>\n");
      out.write("                                    <th style=\"text-align: center; font-size: 20px;\"><a href=\"aaaa\" >Delete</a></th>\n");
      out.write("                                </tr>\n");
      out.write("                                ");
}
                                    if (tg == 0) { 
      out.write("\n");
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>\n");
      out.write("                                        <p>ban khong co san pham nao</p>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("\n");
      out.write("                                ");

                                        }

                                    }

                                
      out.write("\n");
      out.write("                                ");
      out.print(tg);
      out.write("\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
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
