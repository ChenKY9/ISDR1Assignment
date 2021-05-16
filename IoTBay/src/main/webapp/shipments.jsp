<%-- 
    Author     : Neng Ye
--%>
<%@page import="com.uts.iotbay.model.Shipment"%>
<%@page import="java.util.List"%>
<%@page import="com.uts.iotbay.model.Payment"%>
<%@include file="top.jsp" %>
<%
    List<Shipment> list = (List<Shipment>) request.getAttribute("list");
%>
<h3 class="text-primary text-center mb-3">Shipment List</h3>
<form action="shipments">
    Shipment ID: <input class="form-control d-inline" type="text" name="shipmentId"/> Date: <input class="form-control d-inline" type="date" name="date"/>
    <div class="my-3">
        <button class="btn btn-primary">Search</button>
        
    </div>
</form>
<table class="table">
    <thead>
        <tr>
            <th scope="col">ID</th>
            <th scope="col">Order ID</th>
            <th scope="col">Receiver Name</th>
            <th scope="col">Shipment Address</th>
            <th scope="col">Receiver Phone</th>
            <th scope="col">Status</th>
            <th scope="col">Time</th>
            <th scope="col">Actions</th>
        </tr>
    </thead>
    <tbody>
        <% for (Shipment p : list) {%>
        <tr>
            <td scope="col"><%= p.getId()%></td>
            <td scope="col"><%= p.getOrderId()%></td>
            <td scope="col"><%= p.getReceiverName() %></td>
            <td scope="col"><%= p.getShipmentAddress() %></td>
            <td scope="col"><%= p.getReceiverPhone() %></td>
            <td scope="col"><%= p.getStatus()%></td>
            <td scope="col"><%= p.getTime()%></td>
            <td scope="col">
                <a href="shipmentDetail?id=<%= p.getId()%>" class="btn btn-sm btn-primary">View</a>
            </td>
        </tr>
        <%}%>
    </tbody>
</table>
<%@include file="foot.jsp" %> 
