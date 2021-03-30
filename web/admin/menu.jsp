<%-- 
    Document   : menu
    Created on : Feb 8, 2018, 9:55:53 AM
    Author     : vancuong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
              <nav id="sidebar">
                <div class="sidebar-header">
                    <h3>Hello Acount</h3>
                </div>

                <ul class="list-unstyled components">
                    <p>Controller</p>
                    <li class="active">
                        <a href="#homeSubmenu" data-toggle="collapse" aria-expanded="false"><span class="glyphicon glyphicon-list"></span> Thống kê</a>
                        <ul class="collapse list-unstyled" id="homeSubmenu">
                            <!--/webbanhang-->
                            <li><a href="<%=request.getContextPath() %>/Admin_controller?service=khtt_display">Khác hàng tiềm năng</a></li>
                            <li><a href="<%=request.getContextPath() %>/Admin_controller?service=product_display">Sản phẩm ưa chuộng</a></li>
                            <li><a href="<%=request.getContextPath() %>/Admin_controller?service=producttk_display">Sản phẩm tồn kho</a></li>
                        </ul>
                    </li>
                    <li>
                        
                        <a href="#pageSubmenu" data-toggle="collapse" aria-expanded="false"><span  class="glyphicon glyphicon-user"></span> Khác hàng</a>
                        <ul class="collapse list-unstyled" id="pageSubmenu">
                            <li><a href="<%=request.getContextPath() %>/Admin_controller?service=qlkh_display">Quản lý khác hàng</a></li>
                            <li><a href="<%=request.getContextPath() %>/Admin_controller?service=display"></a></li>
                            <li><a href="<%=request.getContextPath() %>/Admin_controller?service=3">Page 3</a></li>
                        </ul>
                    </li>
                    <li>
                        <a href="<%=request.getContextPath() %>/Admin_controller?service=hd_display"><span class="glyphicon glyphicon-list-alt"></span> Hóa đơn</a>
                    </li>
                    <li>
                        <a href="<%=request.getContextPath() %>/Admin_controller?service=sp_display"><span class="glyphicon glyphicon-glass"></span> Sản phẩm</a>
                    </li>
                    <li>
                        <a href="<%=request.getContextPath() %>/Admin_controller?service=dm_display"><span class="glyphicon glyphicon-qrcode"></span> Danh mục</a>
                    </li>
                </ul>

                <ul class="list-unstyled CTAs">
                   
                </ul>
            </nav>
    </body>
</html>
