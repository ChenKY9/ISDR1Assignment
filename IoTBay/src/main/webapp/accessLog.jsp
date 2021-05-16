<%@page import="java.util.List"%>
<%@page import="com.uts.iotbay.model.AccessLog"%>
<%@include file="top.jsp" %>
<%
    List<AccessLog> list = (List<AccessLog>) request.getAttribute("alist");
%>
<form action="accessLog" class="my-3">
    Date: <input class="form-control w-50 d-inline" type="date" name="date"/>
    <button class="btn btn-primary">Search</button>
</form>
<table class="table">
    <thead>
        <tr>
            <th scope="col">ID</th>
            <th scope="col">Time</th>
        </tr>
    </thead>
    <tbody>
        <% for (AccessLog a : list) {%>
        <tr>
            <th scope="col"><%= a.getId() %></th>
            <th scope="col"><%= a.getTime() %></th>
        </tr>
        <%}%>
    </tbody>
</table>
<%@include file="foot.jsp" %> 
