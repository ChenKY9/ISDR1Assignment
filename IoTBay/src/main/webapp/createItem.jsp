<%-- 
    Author     : Jianhao Huang
--%>
<%@page import="com.uts.iotbay.model.Device"%>
<%@page import="java.util.List"%>
<%@include file="top.jsp" %>

<form action="device" method="post" style="margin:auto; width: 300px;">
    <h3 class="text-primary text-center">Add Item</h3>
    <div class="mb-3">
        <label class="form-label">Name</label>
        <input type="text" class="form-control" name="name">
    </div>
    <div class="mb-3">
        <label class="form-label">Type</label>
        <input type="text" class="form-control" name="type">
    </div>
    <div class="mb-3">
        <label class="form-label">Price</label>
        <input type="text" class="form-control" name="price">
    </div>
    <div class="mb-3">
        <label class="form-label">Stock</label>
        <input type="text" class="form-control" name="stock">
    </div>
    <div class="text-center">
        <button type="submit" class="btn btn-primary w-100">Submit</button>
    </div>
</form>

<%@include file="foot.jsp" %> 
