<%@page import="com.mycompany.iotbay.model.Device"%>
<%@page import="java.util.List"%>
<%@include file="top.jsp" %>
<%
    Device device = (Device)request.getAttribute("device");
%>
<form action="editDevice" method="post" style="margin:auto; width: 300px;">
    <h3 class="text-primary text-center">Edit Item</h3>
    <div class="mb-3">
        <label class="form-label">Name</label>
        <input type="text" class="form-control" name="name" value="<%= device.getName() %>">
        <input type="hidden" class="form-control" name="id" value="<%= device.getId() %>">
    </div>
    <div class="mb-3">
        <label class="form-label">Type</label>
        <input type="text" class="form-control" name="type" value="<%= device.getType() %>">
    </div>
    <div class="mb-3">
        <label class="form-label">Price</label>
        <input type="text" class="form-control" name="price" value="<%= device.getPrice() %>">
    </div>
    <div class="mb-3">
        <label class="form-label">Stock</label>
        <input type="text" class="form-control" name="stock" value="<%= device.getStock() %>">
    </div>
    <div class="text-center">
        <button type="submit" class="btn btn-primary w-100">Submit</button>
    </div>
</form>

<%@include file="foot.jsp" %> 
