<%-- 
    Document   : index
    Created on : Feb 7, 2018, 4:54:54 PM
    Author     : vancuong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">

        <title>ADMIN</title>


        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

        <link rel="stylesheet" href="<%=request.getContextPath()%>/admin/css/style5.css">

    </head>
    <body>
        <%
            String tg = request.getParameter("service");
//            String tg1 = request.getParameter("service1");

            if (tg == null) {
                tg = "display";
            }
        %>
        <div class="wrapper">
            <!-- Sidebar Holder -->
            <jsp:include page="menu.jsp"></jsp:include>
                <!-- Page Content Holder -->
                <div id="content" style="width: 100%">
                <jsp:include page="navbar.jsp"/>
                <% if (tg.equalsIgnoreCase("display")) {%>
                <jsp:include page="content_khachang.jsp"></jsp:include>
                <%} else if (tg.equalsIgnoreCase("hd_display")) {%>
                <jsp:include page="content_hoadon.jsp"></jsp:include>
                  <%} else if (tg.equalsIgnoreCase("ttsp")) {%>
                   <%--<jsp:include page="content_thongke.jsp"></jsp:include>--%>
            <jsp:include page="content_hoadon.jsp"></jsp:include>
                <%} else {%>
                <jsp:include page="content_thongke.jsp"></jsp:include>
                <jsp:include page="content_sanpham.jsp"></jsp:include>
                <%}%>
            </div>
        </div>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

        <script type="text/javascript">
            $(document).ready(function () {
                $('#sidebarCollapse').on('click', function () {
                    $('#sidebar').toggleClass('active');
                    $(this).toggleClass('active');
               });
           
            });
            
            $('.MyModal').click(function (){
                var idd = $(this).attr('data-id');
                 $.ajax({
                url: "Admin_controller?id=b1&service=ttsp",
                type: 'POST'
            }).done(function(res) {
               
                $('#mdid').html(res);
                <%  String md =(String) session.getAttribute("modal");
                    if (md != null)%>
                 <%=md%>
                 <% session.removeAttribute("modal");   %>
            });
                
            });
           
        </script>
        <!-- jQuery CDN -->



    </body>
</html>
