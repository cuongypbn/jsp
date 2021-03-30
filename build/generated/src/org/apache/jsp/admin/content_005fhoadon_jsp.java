package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entity.BillDetail;
import entity.Bill;
import java.util.Vector;

public final class content_005fhoadon_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--       table-hover-->\n");
      out.write("        ");

            Vector<Bill> vector_bill = (Vector<Bill>) request.getAttribute("bill");
//            Vector<BillDetail> vector = (Vector<BillDetail>) request.getAttribute("BillDetail");
        
      out.write("\n");
      out.write("        <div >\n");
      out.write("            <table class=\"table table-responsive table-hover\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Tên khác hàng</th>\n");
      out.write("                        <th>Số điện thoại</th>\n");
      out.write("                        <th>Thời gian</th>\n");
      out.write("                        <th>Tổng Tiền</th>\n");
      out.write("                        <th>Trạng thái</th>\n");
      out.write("                        <th colspan=\"1\">Controll</th>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");
for (Bill bill : vector_bill) {
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print(bill.getCname());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(bill.getPhone());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(bill.getCreateDate());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(bill.getTotal());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(bill.getStatus());
      out.write("</td>\n");
      out.write("                        <td class=\"btn-group\">\n");
      out.write("                            <a href=\"#\" class=\"btn btn-primary\" >Xóa</a>\n");
      out.write("                            <a href=\"#\" class=\"btn btn-primary\" >update</a>\n");
      out.write("                            <a href=\"Admin_controller?id=");
      out.print(bill.getBid());
      out.write("&service=ttsp\" class=\"btn btn-primary\" >Chi tiết sản phẩm</a>\n");
      out.write("<!--                            <a class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#myModal\" >Chi tiết sản phẩm</a>-->\n");
      out.write("                        </td>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td><a href=\"#\" class=\"btn btn-primary\" >Xóa tất cả</a></td>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"myModal\" class=\"modal fade\" role=\"dialog\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("\n");
      out.write("                <!-- Modal content-->\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                        <h4 class=\"modal-title\">Sản phẩm của đơn hàng</h4>\n");
      out.write("                        <form>\n");
      out.write("                            <input type=\"hidden\" name=\"ttsp\" value=\"ttsp\">\n");
      out.write("                            <input type=\"hidden\" name=\"service\" value=\"hd_display\">\n");
      out.write("                            <input type=\"submit\" value=\"thongtinsanpham\">\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <div >\n");
      out.write("                            <table class=\"table table-responsive table-hover\">\n");
      out.write("                                <thead>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th>Tên sản phẩm</th>\n");
      out.write("                                        <th>Số lượng</th>\n");
      out.write("                                        <th>giá tiền</th>\n");
      out.write("                                        <th>Tổng Tiền</th>\n");
      out.write("                                        <th colspan=\"1\">Controll</th>\n");
      out.write("\n");
      out.write("                                    </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                <tbody>\n");
      out.write("                               \n");
      out.write("                                    \n");
      out.write("                                    <tr>\n");
      out.write("                                        <td><a href=\"#\" class=\"btn btn-primary\" >Xóa tất cả</a></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                </tbody>\n");
      out.write("\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("                        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
