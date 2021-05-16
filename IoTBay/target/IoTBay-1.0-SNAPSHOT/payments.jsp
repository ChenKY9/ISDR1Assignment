<%-- 
    Author     : Ziming Wang
--%>
<%@page import="java.util.List"%>
<%@page import="com.uts.iotbay.model.Payment"%>
<%@include file="top.jsp" %>
<%
    List<Payment> list = (List<Payment>) request.getAttribute("list");
%>
<h3 class="text-primary text-center mb-3">Payment List</h3>
<form action="payments">
    Payment ID: <input class="form-control d-inline" type="text" name="paymentId"/> Date: <input class="form-control d-inline" type="date" name="date"/>
    <div class="my-3">
        <button class="btn btn-primary">Search</button>
        <a class="btn btn-success" href="addPayment">Add Payment</a>
    </div>
</form>
<table class="table">
    <thead>
        <tr>
            <th scope="col">ID</th>
            <th scope="col">Order ID</th>
            <th scope="col">Method</th>
            <th scope="col">Amount</th>
            <th scope="col">Card Number</th>
            <th scope="col">Card Name</th>
            <th scope="col">CVV</th>
            <th scope="col">Status</th>
            <th scope="col">Time</th>
            <th scope="col">Actions</th>
        </tr>
    </thead>
    <tbody>
        <% for (Payment p : list) {%>
        <tr>
            <td scope="col"><%= p.getId()%></td>
            <td scope="col"><%= p.getOrderId()%></td>
            <td scope="col"><%= p.getMethod()%></td>
            <td scope="col">$<%= p.getAmount()%></td>
            <td scope="col"><%= p.getCardNumber()%></td>
            <td scope="col"><%= p.getCardName()%></td>
            <td scope="col"><%= p.getCvv()%></td>
            <td scope="col"><%= p.getStatus()%></td>
            <td scope="col"><%= p.getTime()%></td>
            <td scope="col">
                <a href="paymentDetail?id=<%= p.getId()%>" class="btn btn-sm btn-primary">View</a>
            </td>
        </tr>
        <%}%>
    </tbody>
</table>
<%@include file="foot.jsp" %> 
