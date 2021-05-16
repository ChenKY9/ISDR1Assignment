<%-- 
    Author     : Hyundong Oh
--%>
<%@page import="com.uts.iotbay.model.Order"%>
<%@page import="com.uts.iotbay.model.Device"%>
<%@page import="java.util.List"%>
<%@include file="top.jsp" %>
<%
    List<Order> list = (List<Order>) request.getAttribute("orderList");
%>
<h3 class="text-primary text-center">Order List</h3>
<table class="table">
    <thead>
        <tr>
            <th scope="col">OrderId</th>
            <th scope="col">DeviceName</th>
            <th scope="col">Price</th>
            <th scope="col">Quantity</th>
            <th scope="col">Status</th>
            <th scope="col">Action</th>

        </tr>
    </thead>
    <tbody>
        <% for (Order a : list) {%>
        <tr>
            <td scope="col"><%= a.getId()%></td>
            <td scope="col"><%= a.getDeviceName() %></td>
            <td scope="col">$<%= a.getPrice()%></td>
            <td scope="col"><%= a.getQuantity()%></td>
            <td scope="col"><%= a.getStatus()%></td>
            <td>
                <a class="btn btn-sm btn-primary" href="orderDetails?id=<%= a.getId()%>">View</a>
            </td>

        </tr>
        <%}%>
    </tbody>
</table>
<%@include file="foot.jsp" %> 
