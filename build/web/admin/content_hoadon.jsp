<%-- 
    Document   : content_hoadon
    Created on : Feb 8, 2018, 10:14:50 AM
    Author     : vancuong
--%>

<%@page import="entity.BillDetail"%>
<%@page import="entity.Bill"%>
<%@page import="java.util.Vector"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <!--       table-hover-->
        <%
            Vector<Bill> vector_bill = (Vector<Bill>) request.getAttribute("bill");
//            Vector<BillDetail> vector = (Vector<BillDetail>) request.getAttribute("BillDetail");
        %>
        <div >
            <table class="table table-responsive table-hover">
                <thead>
                    <tr>
                        <th>Tên khác hàng</th>
                        <th>Số điện thoại</th>
                        <th>Thời gian</th>
                        <th>Tổng Tiền</th>
                        <th>Trạng thái</th>
                        <th colspan="1">Controll</th>

                    </tr>
                </thead>
                <tbody>
                    <%for (Bill bill : vector_bill) {%>
                    <tr>
                        <td><%=bill.getCname()%></td>
                        <td><%=bill.getPhone()%></td>
                        <td><%=bill.getCreateDate()%></td>
                        <td><%=bill.getTotal()%></td>
                        <td><%=bill.getStatus()%></td>
                        <td class="btn-group">
                            <a href="#" class="btn btn-primary" >Xóa</a>
                            <a href="#" class="btn btn-primary" >update</a>
                            <a href="#" data-id="<%=bill.getBid()%>" class="btn btn-primary MyModal" >Chi tiết sản phẩm</a>
<!--                            <a class="btn btn-primary" data-toggle="modal" data-target="#myModal" >Chi tiết sản phẩm</a>-->
                        </td>

                    </tr>

                    <%}%>
                    <tr>
                        <td><a href="#" class="btn btn-primary" >Xóa tất cả</a></td>
                    </tr>
                </tbody>

            </table>
        </div>
        <div id="myModal" class="modal fade" role="dialog">
            <div class="modal-dialog">

                <!-- Modal content-->
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                        <h4 class="modal-title">Sản phẩm của đơn hàng</h4>
<!--                        <form>
                            <input type="hidden" name="ttsp" value="ttsp">
                            <input type="hidden" name="service" value="hd_display">
                            <input type="submit" value="thongtinsanpham">
                        </form>-->
                    </div>
                    <div class="modal-body">
                        <div >
                            <table class="table table-responsive table-hover">
                                <thead>
                                    <tr>
                                        <th>Tên sản phẩm</th>
                                        <th>Số lượng</th>
                                        <th>giá tiền</th>
                                        <th>Tổng Tiền</th>
                                        <th colspan="1">Controll</th>

                                    </tr>
                                </thead>
                                <tbody id="mdid">

                                </tbody>

                            </table>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    </div>
                </div>

            </div>
        </div>
    </body>
</html>
