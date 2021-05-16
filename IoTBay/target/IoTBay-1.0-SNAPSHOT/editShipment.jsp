<%-- 
    Author     : Neng Ye
--%>
<%@page import="com.uts.iotbay.model.Shipment"%>
<%@page import="com.uts.iotbay.model.Payment"%>
<%@include file="top.jsp" %>
<%
    Shipment p = (Shipment) request.getAttribute("shipment");
%>
<form action="editShipment" method="post" style="margin: auto; width: 500px">
    <h3 class="text-primary text-center mb-3">Update Shipment</h3>
    <div class="row mb-3">
        <label for="inputEmail3" class="col-sm-2 col-form-label">Shipment ID</label>
        <div class="col-sm-10">
             <input type="text" readonly class="form-control" name="id" value="<%=p.getId() %>">
        </div>
    </div>
        
        <div class="row mb-3">
        <label for="inputEmail3" class="col-sm-2 col-form-label">Order ID</label>
        <div class="col-sm-10">
            <input type="text" readonly class="form-control" name="orderId" value="<%=p.getOrderId() %>">
        </div>
    </div>
        
    <div class="row mb-3">
        <label class="col-sm-2 col-form-label">Receiver Name</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" name="receiverName" value="<%=p.getReceiverName() %>">
        </div>
    </div>
    <div class="row mb-3">
        <label class="col-sm-2 col-form-label">Shipment Address</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" name="shipmentAddress" value="<%=p.getShipmentAddress()%>">
        </div>
    </div>
    <div class="row mb-3">
        <label class="col-sm-2 col-form-label">Receiver Phone</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" name="receiverPhone" value="<%=p.getReceiverPhone()%>">
        </div>
    </div>
    <button type="submit" class="btn btn-primary">Update Shipment</button>
</form>
<%@include file="foot.jsp" %>
