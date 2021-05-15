<%@page import="com.uts.iotbay.model.Device"%>
<%@page import="java.util.List"%>
<%@include file="top.jsp" %>
<%
    Device device = (Device) request.getAttribute("device");
%>
<form action="order" method="post" style="margin: auto; width: 500px">
    <h3 class="text-primary text-center">Order Item</h3>
    <table class="table">
        <tr>
            <th scope="col"> Device ID:</th>
            <td scope="col"><%= device.getId()%></td>
        <input type="hidden" name="deviceId" value="<%= device.getId()%>">
        </tr>
        <tr>
            <th scope="col">Device Name:</th>
            <td scope="col"><%= device.getName()%></td>
            <input type="hidden" name="deviceName" value="<%= device.getName()%>">
        </tr>
        <tr>
            <th scope="col">Price:</th>
            <td scope="col" name="price"><%= device.getPrice()%></td>
            <input type="hidden" name="price" value="<%= device.getPrice()%>">
        </tr>
        <tr>
            <th scope="col">Quantity:</th>
            <td>
                <input type="text" class="form-control" name="quantity" value="1">
            </td>
        </tr>
        <tr>
            <th scope="col">Name:</th>
            <td>
                <input type="text" class="form-control" name="name">
            </td>
        </tr>
        <tr>
            <th scope="col">Address:</th>
            <td>
                <input type="text" class="form-control" name="address">
            </td>
        </tr>
        <tr>
            <th scope="col">Phone:</th>
            <td>
                <input type="text" class="form-control" name="phone">
            </td>
        </tr>
    </table>
    <div>
        <button type="submit" class="btn btn-primary btn-sm" >Save</button>
    </div>
</form>
<%@include file="foot.jsp" %> 
