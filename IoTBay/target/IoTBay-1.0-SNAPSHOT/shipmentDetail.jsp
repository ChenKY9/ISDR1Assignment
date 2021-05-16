<%-- 
    Author     : Neng Ye
--%>
<%@page import="com.uts.iotbay.model.Shipment"%>
<%@page import="java.util.List"%>
<%@page import="com.uts.iotbay.model.Payment"%>
<%@include file="top.jsp" %>
<%
    Shipment p = (Shipment) request.getAttribute("shipment");
%>
<h3 class="text-primary text-center mb-3">Shipment Detail</h3>
<div  style="margin: auto; width: 700px">
    <table class="table">
        <tr>
            <th>Shipment ID</th>
            <td><%=p.getId()%></th>
        </tr>
        <tr>
            <th>Order ID</th>
            <td><%=p.getOrderId()%></th>
        </tr>
        <tr>
            <th>Receiver Name</th>
            <td><%= p.getReceiverName() %></th>
        </tr>
        <tr>
            <th>Shipment Address</th>
            <td><%=p.getShipmentAddress() %></th>
        </tr>
        <tr>
            <th>Receiver Phone</th>
            <td><%=p.getReceiverPhone() %></th>
        </tr>
        
        <tr>
            <th>Status</th>
            <td><%=p.getStatus()%></th>
        </tr>
        <tr>
            <th>Date</th>
            <td><%=p.getTime() %></th>
        </tr>
    </table>
    <div>
        <a href="shipments" class="btn btn-secondary">Back</a>
        <%if (p.getStatus().equals("Pending")) {%>
        <a href="editShipment?id=<%=p.getId()%>" class="btn btn-primary">Edit</a>
        <a href="confirmShipment?id=<%=p.getId()%>" class="btn btn-warning">Confirm</a>
        <a href="deleteShipment?id=<%=p.getId()%>" class="btn btn-danger">Delete</a>
        <%}%>
        
    </div>
</div>

<%@include file="foot.jsp" %> 
