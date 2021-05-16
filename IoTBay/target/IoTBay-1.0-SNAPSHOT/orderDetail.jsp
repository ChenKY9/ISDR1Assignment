<%-- 
    Author     : Hyundong Oh
--%>
<%@page import="com.uts.iotbay.model.Order"%>
<%@page import="java.util.List"%>
<%@page import="com.uts.iotbay.model.Payment"%>
<%@include file="top.jsp" %>
<%
    Order p = (Order) request.getAttribute("orderDetail");
%>
<h3 class="text-primary text-center">Order Details</h3>
<div  style="margin: auto; width: 700px">
    <table class="table">
        <tr>
            <th>Order ID</th>
            <td><%=p.getId()%></th>
        </tr>
        <tr>
            <th>Device ID</th>
            <td><%=p.getDeviceId() %></th>
        </tr>
        <tr>
            <th>Device Name</th>
            <td><%=p.getDeviceName() %></th>
        </tr>
        <tr>
            <th>Price</th>
            <td><%=p.getPrice()%></th>
        </tr>
        <tr>
            <th>Quantity</th>
            <td><%=p.getQuantity()%></th>
        </tr>
        <tr>
            <th>Name</th>
            <td><%=p.getName()%></th>
        </tr>
        <tr>
            <th>Address</th>
            <td><%=p.getAddress()%></th>
        </tr>
        <tr>
            <th>Phone</th>
            <td><%=p.getPhone()%></th>
        </tr>
        <tr>
            <th>Status</th>
            <td>Pending</th>
        </tr>
    </table>
    <div>
         <a href="orderList" class="btn btn-secondary">Back</a>
        <%if (p.getStatus().equals("Pending")) {%>
        <a href="editOrder?id=<%=p.getId()%>" class="btn btn-primary">Edit</a>
        <a href="confirmOrder?id=<%=p.getId()%>" class="btn btn-warning">Confirm</a>
        <a href="deleteOrder?id=<%=p.getId()%>" class="btn btn-danger">Cancel</a>
        <%}%>
        <%if (p.getStatus().equals("Confirmed")) {%>
        <a href="addPayment?orderId=<%=p.getId()%>&amount=<%=p.getPrice()*p.getQuantity()%>" class="btn btn-warning">Pay</a>
        <%}%>
    </div>
</div>

<%@include file="foot.jsp" %> 
