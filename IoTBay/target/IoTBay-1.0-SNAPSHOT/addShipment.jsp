<%-- 
    Author     : Neng Ye
--%>
<%@include file="top.jsp" %>
<form action="addShipment" method="post" style="margin: auto; width: 500px">
    <h3 class="text-primary text-center mb-3">New Shipment</h3>
    <div class="row mb-3">
        <label for="inputEmail3" class="col-sm-2 col-form-label">Order ID</label>
        <div class="col-sm-10">
            <input type="text" readonly class="form-control" name="orderId" value="<%=request.getAttribute("orderId")%>">
        </div>
    </div>
    
    <div class="row mb-3">
        <label class="col-sm-2 col-form-label">Receiver Name</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" name="receiverName">
        </div>
    </div>
    <div class="row mb-3">
        <label class="col-sm-2 col-form-label">Shipment Address</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" name="shipmentAddress">
        </div>
    </div>
    <div class="row mb-3">
        <label class="col-sm-2 col-form-label">Receiver Phone</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" name="receiverPhone">
        </div>
    </div>
    
    <button type="submit" class="btn btn-primary">Save</button>
</form>
<%@include file="foot.jsp" %>
