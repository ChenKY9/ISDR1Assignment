<%-- 
    Author     : Chenkun Ye
--%>
<%@page import="com.uts.iotbay.model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    User currentUser = null;
    if (request.getSession().getAttribute("currentUser") == null) {
        response.sendRedirect("login.jsp");
    } else {
        currentUser = (User) request.getSession().getAttribute("currentUser");
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>IoTBay</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-wEmeIV1mKuiNpC+IOBjI7aAzPcEZeedi5yW5f2yOq55WWLwNGmvvx4Um1vskeMj0" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-p34f1UUtsS3wqzfto5wAAmdvj+osOnFyQFpp4Ua3gs/ZVWx6oOypYoCJhGGScy+8" crossorigin="anonymous"></script>
    </head>
    <body class="bg-light">
        <nav class="navbar navbar-dark bg-dark navbar-expand-lg">
            <div class="container-fluid">
                <a class="navbar-brand" href="./">IoTBay</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNavDropdown">
                    <ul class="navbar-nav">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="device">Devices</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="orderList">Orders</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="payments">My Payments</a>
                        </li>
                    </ul>
                </div>
                <% if (currentUser != null) {%>
                <div class="text-white dropdown">
                    <a class="nav-link dropdown-toggle" href="#" data-bs-toggle="dropdown">
                        Hello <%= currentUser.getRole()%> <%= currentUser.getUsername()%>
                    </a>
                    <ul class="dropdown-menu">
                        <li><a class="dropdown-item" href="profile">Update Profile</a></li>
                        <li><a class="dropdown-item" href="accessLog">Access Logs</a></li>
                    </ul>
                </div>
                <a href="logout" class="btn btn-warning ms-3">Logout</a>
                <%}%>
            </div>
        </nav>
        <div class="container-md mt-4 bg-white shadow p-3">


