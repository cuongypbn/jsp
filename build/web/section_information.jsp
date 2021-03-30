<%-- 
    Document   : section_information
    Created on : Feb 1, 2018, 9:12:08 AM
    Author     : vancuong
--%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="entity.Information_coffe"%>
<%@page import="java.util.Vector"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String context = "",gioithieu="",thanhphan="",nhacungcap="",phanphoi="",mau="",muivi="",img="";
            int khoiluong=0,pid=0;
            float gia=0;
            String congdung="";
            Vector<Information_coffe> vector=(Vector<Information_coffe>)request.getAttribute("ttsanpham");
            for(Information_coffe information_coffe:vector){
                pid=information_coffe.getPid();
                context=information_coffe.getContex();
                gioithieu=information_coffe.getGioithieu();
                thanhphan=information_coffe.getThanhphan();
                nhacungcap=information_coffe.getSanxuattai();
                phanphoi=information_coffe.getPhanphoi();
                khoiluong=information_coffe.getKhoiluong();
                mau=information_coffe.getMau();
                muivi=information_coffe.getMuivi();
                img=information_coffe.getImg();
                gia=information_coffe.getGia();
                congdung=information_coffe.getCongdung();
            }
        %>
         <% DecimalFormat formatter = new DecimalFormat("###,###,###"); %>
            <section class="container " style="background: #ffffff ;">
                
                <div class="row ttsanpham">
                    <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">

                        <div class="row">
                            <p style="color: rgb(2, 2, 2) ; padding: 0px 20px; font-size: 40px"><%=context %></p>
                            <p style="color: rgb(2, 2, 2) ; padding: 0px 20px; font-size: 20px"><%=nhacungcap %></p>
                            <div class="col-xs-12 col-md-4">
                                <div class="box_img" style="width: 100%; padding: 0px 20px;">
                                    <img style="height: 252.5px; width: 302.5333px;" src="<%=img %>" alt="hinh anh">
                                </div>
                            </div>
                            <div class="col-xs-12 col-md-8">
                                <p>Mô tả ngắn:</p>
                                <p>
                                    <%=gioithieu %>
                                </p>
                                <hr>
                                <p style="font-size: 30px;">
                                   <h3><%=formatter.format(gia) + "VND"%></h3>
                                </p>
                                <hr>
                                <form action="Cart_controller" method="post"> 
                                     <input type="hidden" name="id" value="<%=pid %>">
                                     <input type="hidden" name="service" value="dathang">
                                    <div  class="quantity" style="overflow: hidden; height: 50px; width:100%;">
                                        <input style="color: #333" name="soluong" type="number" min="1" max="100" step="1" value="1">
                                        <button style="height: 43px; padding: 0px 20px; margin: 0px 20px" type="submit" class="btn btn-default">Mua hàng</button>
                                    </div>
                                </form>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12">
                                <h3 class="my-4" style="font-family: Trirong, sans-serif!important;">Mô tả sản phẩm</h3> 
                                <div class="container">
                                    <p style="font-size: 20px">
                                        <span style="font-family: Trirong, sans-serif!important;" >
                                            <strong><%=context %></strong>
                                            &nbsp;<%=gioithieu %>
                                        </span>
                                    </p > 

                                    <p style="font-size: 20px">
                                        <strong>–&nbsp;Thành phần: </strong>
                                        &nbsp;<%=thanhphan %>
                                    </p>


                                    <p style="font-size: 20px">
                                        <strong>–&nbsp;Sản xuất tại: </strong>
                                        &nbsp;<%= nhacungcap%>
                                    </p>


                                    <p style="font-size: 20px">
                                        <strong>–&nbsp; Phân phối độc quyền: </strong>
                                        &nbsp;<%=phanphoi%>
                                    </p>

                                    <p style="font-size: 20px">
                                        <strong>–&nbsp;Khối lượng tịnh: </strong>
                                        &nbsp;<%=khoiluong%>g
                                    </p>

                                    <p style="font-size: 20px">
                                        <strong>–&nbsp;màu đẹp: </strong>
                                        &nbsp;<%=mau%>
                                    </p>

                                    <p style="font-size: 20px">
                                        <strong>–&nbsp;mùi vị: </strong>
                                        &nbsp; <%=muivi%>
                                    </p>

                                    <p style="font-size: 20px">
                                        <strong>–&nbsp;Công dụng: </strong>
                                        &nbsp;<%=congdung %>
                                    </p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
    </body>
</html>
