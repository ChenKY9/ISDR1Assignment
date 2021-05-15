<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
            </div>
        </nav>
        <div class="container-md mt-4 bg-white shadow p-3">
            <form action="login" method="post" style="margin:auto; width: 300px;">
                <h3 class="text-primary text-center">Please Sign In</h3>
                <div class="mb-3">
                    <label class="form-label">Username</label>
                    <input type="text" class="form-control" name="username">
                </div>
                <div class="mb-3">
                    <label class="form-label">Password</label>
                    <input type="password" class="form-control" name="password">
                </div>
                <a class="d-block mb-3" href="register.jsp">Sign Up</a>
                <div class="text-center">
                    <button type="submit" class="btn btn-primary w-100">Submit</button>
                </div>
            </form>
            <%@include file="foot.jsp" %>
