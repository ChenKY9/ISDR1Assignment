<%-- 
    Author     : Jianhao Huang
--%>
<%@page import="com.uts.iotbay.model.Device"%>
<%@page import="java.util.List"%>
<%@include file="top.jsp" %>
<%
    List<Device> list = (List<Device>) request.getAttribute("deviceList");
%>
<h3 class="text-primary text-center mb-3">Device List</h3>
<form action="device" class="my-3">
    Name: <input class="form-control w-25 d-inline" name="name"/>
    Type: <input class="form-control w-25 d-inline" name="type"/>
    <button class="btn btn-primary">Search</button>
    <%
        if (currentUser.getRole().equals("Staff")) {
    %>
    <a class="btn btn-primary" href="createItem.jsp">Add Item</a>
    <%
        }
    %>

</form>
<table class="table">
    <thead>
        <tr>
            <th scope="col">ID</th>
            <th scope="col">Name</th>
            <th scope="col">Type</th>
            <th scope="col">Price</th>
            <th scope="col">Stock</th>
            <th scope="col">Actions</th>

        </tr>
    </thead>
    <tbody>
        <% for (Device a : list) {%>
        <tr>
            <td scope="col"><%= a.getId()%></td>
            <td scope="col"><%= a.getName()%></td>
            <td scope="col"><%= a.getType()%></td>
            <td scope="col">$<%= a.getPrice()%></td>
            <td scope="col"><%= a.getStock()%></td>
            <td>
                <%
                    if (currentUser.getRole().equals("Staff")) {
                %>
                <a class="btn btn-sm btn-primary" href="editDevice?id=<%= a.getId()%>">Edit</a>
                <a class="btn btn-sm btn-danger" href="removeDevice?id=<%= a.getId()%>">Remove</a>
                <%
                    }
                %>
                <%
                    if (currentUser.getRole().equals("Customer")) {
                %>
                <a class="btn btn-sm btn-warning" href="order?id=<%= a.getId()%>">Buy</a>
                <%
                    }
                %>
            </td>

        </tr>
        <%}%>
    </tbody>
</table>
<%@include file="foot.jsp" %> 
