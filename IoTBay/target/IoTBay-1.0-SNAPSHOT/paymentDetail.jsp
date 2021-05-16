<%-- 
    Author     : Ziming Wang
--%>
<%@page import="java.util.List"%>
<%@page import="com.uts.iotbay.model.Payment"%>
<%@include file="top.jsp" %>
<%
    Payment p = (Payment) request.getAttribute("payment");
%>
<div  style="margin: auto; width: 700px">
    <table class="table">
        <tr>
            <th>Payment ID</th>
            <td><%=p.getId()%></th>
        </tr>
        <tr>
            <th>Order ID</th>
            <td><%=p.getOrderId()%></th>
        </tr>
        <tr>
            <th>Amount</th>
            <td>$<%=p.getAmount()%></th>
        </tr>
        <tr>
            <th>Payment Method</th>
            <td><%=p.getMethod()%></th>
        </tr>
        <tr>
            <th>Card Number</th>
            <td><%=p.getCardNumber()%></th>
        </tr>
        <tr>
            <th>Card Name</th>
            <td><%=p.getCardName()%></th>
        </tr>
        <tr>
            <th>CVV</th>
            <td><%=p.getCvv()%></th>
        </tr>
        <tr>
            <th>Status</th>
            <td><%=p.getStatus()%></th>
        </tr>
        <tr>
            <th>Date</th>
            <td><%=p.getTime()%></th>
        </tr>
    </table>
    <div>
        <a href="payments" class="btn btn-secondary">Back</a>
        <%if (p.getStatus().equals("Pending")) {%>
        <a href="editPayment?id=<%=p.getId()%>" class="btn btn-primary">Edit</a>
        <a href="confirmPayment?id=<%=p.getId()%>" class="btn btn-warning">Confirm</a>
        <a href="deletePayment?id=<%=p.getId()%>" class="btn btn-danger">Cancel</a>
        <%}%>
    </div>
</div>

<%@include file="foot.jsp" %> 
