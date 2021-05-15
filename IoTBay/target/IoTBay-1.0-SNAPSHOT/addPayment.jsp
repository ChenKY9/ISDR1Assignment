<%@include file="top.jsp" %>
<form action="addPayment" method="post" style="margin: auto; width: 500px">
    <h3 class="text-primary text-center mb-3">New Payment</h3>
    <div class="row mb-3">
        <label for="inputEmail3" class="col-sm-2 col-form-label">Order ID</label>
        <div class="col-sm-10">
            <input type="text" readonly class="form-control" name="orderId" value="<%=request.getAttribute("orderId")%>">
        </div>
    </div>
    <div class="row mb-3">
        <label class="col-sm-2 col-form-label">Amount($)</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" name="amount" readonly value="<%=request.getAttribute("amount")%>">
        </div>
    </div>
    <div class="row mb-3">
        <label class="col-sm-2 col-form-label">Card Number</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" name="cardNumber">
        </div>
    </div>
    <div class="row mb-3">
        <label class="col-sm-2 col-form-label">Card Name</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" name="cardName">
        </div>
    </div>
    <div class="row mb-3">
        <label class="col-sm-2 col-form-label">CVV</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" name="cvv">
        </div>
    </div>
    <div class="row mb-3">
        <label class="col-sm-2 col-form-label">Method</label>
        <div class="col-sm-10">
            <select class="form-select" name="method">
                <option selected>Credit Card</option>
                <option>Master Card</option>
                <option>Visa Card</option>
            </select>
        </div>
    </div>
    <button type="submit" class="btn btn-primary">Create Payment</button>
</form>
<%@include file="foot.jsp" %>
