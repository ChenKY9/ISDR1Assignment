<%-- 
    Author     : Ziming Wang
--%>
<%@page import="com.uts.iotbay.model.Payment"%>
<%@include file="top.jsp" %>
<%
    Payment p = (Payment) request.getAttribute("payment");
%>
<form action="editPayment" method="post" style="margin: auto; width: 500px">
    <h3 class="text-primary text-center mb-3">Update Payment</h3>
    <div class="row mb-3">
        <label for="inputEmail3" class="col-sm-2 col-form-label">Order ID</label>
        <div class="col-sm-10">
             <input type="hidden" readonly class="form-control" name="id" value="<%=p.getId() %>">
            <input type="text" readonly class="form-control" name="orderId" value="<%=p.getOrderId() %>">
        </div>
    </div>
    <div class="row mb-3">
        <label class="col-sm-2 col-form-label">Amount($)</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" name="amount" readonly value="<%=p.getAmount() %>">
        </div>
    </div>
    <div class="row mb-3">
        <label class="col-sm-2 col-form-label">Card Number</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" name="cardNumber" value="<%=p.getCardNumber() %>">
        </div>
    </div>
    <div class="row mb-3">
        <label class="col-sm-2 col-form-label">Card Name</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" name="cardName" value="<%=p.getCardName()%>">
        </div>
    </div>
    <div class="row mb-3">
        <label class="col-sm-2 col-form-label">CVV</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" name="cvv" value="<%=p.getCvv()%>">
        </div>
    </div>
    <div class="row mb-3">
        <label class="col-sm-2 col-form-label" value="<%=p.getMethod()%>">Method</label>
        <div class="col-sm-10">
            <select class="form-select" name="method">
                <option selected>Credit Card</option>
                <option>Master Card</option>
                <option>Visa Card</option>
            </select>
        </div>
    </div>
    <button type="submit" class="btn btn-primary">Update Payment</button>
</form>
<%@include file="foot.jsp" %>
