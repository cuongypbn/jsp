package org.apache.jsp.admin;

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
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\n");
      out.write("        <title>ADMIN</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/admin/css/style5.css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String tg = request.getParameter("service");
//            String tg1 = request.getParameter("service1");

            if (tg == null) {
                tg = "display";
            }
        
      out.write("\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            <!-- Sidebar Holder -->\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, false);
      out.write("\n");
      out.write("                <!-- Page Content Holder -->\n");
      out.write("                <div id=\"content\" style=\"width: 100%\">\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\n");
      out.write("                ");
 if (tg.equalsIgnoreCase("display")) {
      out.write("\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "content_khachang.jsp", out, false);
      out.write("\n");
      out.write("                ");
} else if (tg.equalsIgnoreCase("hd_display")) {
      out.write("\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "content_hoadon.jsp", out, false);
      out.write("\n");
      out.write("                  ");
} else if (tg.equalsIgnoreCase("ttsp")) {
      out.write("\n");
      out.write("                   ");
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "content_hoadon.jsp", out, false);
      out.write("\n");
      out.write("                ");
} else {
      out.write("\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "content_thongke.jsp", out, false);
      out.write("\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "content_sanpham.jsp", out, false);
      out.write("\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $('#sidebarCollapse').on('click', function () {\n");
      out.write("                    $('#sidebar').toggleClass('active');\n");
      out.write("                    $(this).toggleClass('active');\n");
      out.write("               });\n");
      out.write("           \n");
      out.write("            });\n");
      out.write("            \n");
      out.write("            $('.MyModal').click(function (){\n");
      out.write("                var idd = $(this).attr('data-id');\n");
      out.write("                 $.ajax({\n");
      out.write("                url: \"Admin_controller?id=b1&service=ttsp\",\n");
      out.write("                type: 'POST'\n");
      out.write("            }).done(function(res) {\n");
      out.write("               \n");
      out.write("                $('#mdid').html(res);\n");
      out.write("                ");
  String md =(String) session.getAttribute("modal");
                    if (md != null)
      out.write("\n");
      out.write("                 ");
      out.print(md);
      out.write("\n");
      out.write("                 ");
 session.removeAttribute("modal");   
      out.write("\n");
      out.write("            });\n");
      out.write("                \n");
      out.write("            });\n");
      out.write("           \n");
      out.write("        </script>\n");
      out.write("        <!-- jQuery CDN -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
