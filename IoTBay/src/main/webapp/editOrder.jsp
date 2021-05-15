<%@page import="com.mycompany.iotbay.model.Order"%>
<%@page import="com.mycompany.iotbay.model.Payment"%>
<%@include file="top.jsp" %>
<%
    Order p = (Order) request.getAttribute("order");
%>
<form action="editOrder" method="post" style="margin: auto; width: 500px">
    <h3 class="text-primary text-center mb-3">Edit Order</h3>
    <table class="table">
        <tr>
            <th scope="col"> Device ID:</th>
            <td scope="col"><%= p.getDeviceId() %></td>
            <input type="hidden" name="deviceId" value="<%= p.getDeviceId()%>">
            <input type="hidden" name="id" value="<%= p.getId()%>">
        </tr>
        <tr>
            <th scope="col">Device Name:</th>
            <td scope="col"><%= p.getName()%></td>
            <input type="hidden" name="deviceName" value="<%= p.getName()%>">
        </tr>
        <tr>
            <th scope="col">Price:</th>
            <td scope="col" name="price"><%= p.getPrice()%></td>
            <input type="hidden" name="price" value="<%= p.getPrice()%>">
        </tr>
        <tr>
            <th scope="col">Quantity:</th>
            <td>
                <input type="text" class="form-control" name="quantity" value="<%= p.getQuantity() %>">
            </td>
        </tr>
        <tr>
            <th scope="col">Name:</th>
            <td>
                <input type="text" class="form-control" name="name" value="<%= p.getName() %>">
            </td>
        </tr>
        <tr>
            <th scope="col">Address:</th>
            <td>
                <input type="text" class="form-control" name="address" value="<%= p.getAddress() %>">
            </td>
        </tr>
        <tr>
            <th scope="col">Phone:</th>
            <td>
                <input type="text" class="form-control" name="phone" value="<%= p.getPhone() %>">
            </td>
        </tr>
    </table>
    <button type="submit" class="btn btn-primary">Update Order</button>
</form>
<%@include file="foot.jsp" %>
