<%-- 
    Document   : modal
    Created on : Feb 11, 2018, 11:58:50 PM
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
        <div id="myModal" class="modal fade" role="dialog">
            <div class="modal-dialog">

                <!-- Modal content-->
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                        <h4 class="modal-title">Sản phẩm của đơn hàng</h4>
                        <form>
                            <input type="hidden" name="ttsp" value="ttsp">
                            <input type="hidden" name="service" value="hd_display">
                            <input type="submit" value="thongtinsanpham">
                        </form>
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
                                <tbody>
                               
                                    
                                    <tr>
                                        <td><a href="#" class="btn btn-primary" >Xóa tất cả</a></td>
                                    </tr>
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
