<%-- 
    Document   : Giohang
    Created on : Feb 5, 2018, 2:08:41 PM
    Author     : vancuong
--%>

<%@page import="java.util.Enumeration"%>
<%@page import="entity.Information_coffe"%>
<%@page import="java.util.Vector"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>

        <section class="container" style="background: #ffffff" >
            <div class="row ttsanpham">
                <div class="col-sm-4 col-md-12">
                    <form action="" method="" name="" class="">

                        <table class="table table-responsive table-hover cart_coffe">
                            <thead >
                                <tr>
                                    <th></th>
                                    <th style="text-align: center; font-size: 20px;">Tên sản phẩm</th>
                                    <th style="text-align: center; font-size: 20px;">Số lượng</th>
                                    <th style="text-align: center; font-size: 20px;">Giá tiền</th>
                                    <th style="text-align: center; font-size: 20px;">xóa</th>
                                </tr>
                            </thead>
                            <tbody>
                                <%
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


                                %>

                                <tr>

                                    <th >
                                        <img src="img/sp.jpg" style="height: 50px;" class="rounded float-left" alt="anh">
                                    </th>
                                    <th style="text-align: center; font-size: 20px;"><%=information_coffe.getContex()%></th>
                                    <th style="text-align: center; font-size: 20px;">
                                        <div  class="quantity" style=" height: 52px; width:100%; margin-left: 90px;">
                                            <input style="color: #333" type="number" min="1" max="100" step="1" value="<%=information_coffe.getSoluong()%>">
                                        </div>
                                    </th>
                                    <th style="text-align: center; font-size: 20px;"><%=information_coffe.getGia()%></th>
                                    <th style="text-align: center; font-size: 20px;"><a href="aaaa" >Delete</a></th>
                                </tr>
                                
                                <%}
                               

                                    }

                                %>
                                <%
                                    if (tg == 0) { %>

                                <tr>
                                    <td style="text-align: center; font-size: 20px; color: blue;" colspan="5">
                                        <p>Giỏ hàng trống</p>
                                    </td>
                                </tr>

                                <%
                                        }
                                %>
                            </tbody>
                        </table>

                    </form>

                </div>
            </div>
        </section>
    </body>
</html>
