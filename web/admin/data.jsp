<%-- 
    Document   : data
    Created on : Feb 12, 2018, 1:19:49 AM
    Author     : vancuong
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page import="entity.BillDetail"%>
<%@page import="java.util.Vector"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% Vector<BillDetail> vector = (Vector<BillDetail>) request.getAttribute("BillDetail"); %>
<% DecimalFormat formatter = new DecimalFormat("###,###,###"); %>
<% for (BillDetail x : vector) {
    double tongtien=x.getProducMoney()*x.getQuantity();
%>
<tr>
    <td><%=x.getProducName()%></td>
    <td><%=x.getQuantity()%></td>
    <td><%=formatter.format(x.getProducMoney()) + " VND"%></td>
    <td><%=formatter.format(tongtien) + " VND"%></td>
</tr>
<%}%>



