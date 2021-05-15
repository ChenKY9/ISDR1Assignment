<%@include file="top.jsp" %>
<form action="profile" method="post" style="margin: auto; width: 500px">
    <input type="hidden" class="form-control" name="id" value="<%=currentUser.getId()%>">
    <h3 class="text-primary text-center mb-3">Update Profile</h3>
    <div class="row mb-3">
        <label for="inputEmail3" class="col-sm-2 col-form-label">Username</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" name="username" value="<%=currentUser.getUsername()%>">
        </div>
    </div>
    <div class="row mb-3">
        <label class="col-sm-2 col-form-label">Email</label>
        <div class="col-sm-10">
            <input type="email" class="form-control" name="email" value="<%=currentUser.getEmail()%>">
        </div>
    </div>
    <div class="row mb-3">
        <label class="col-sm-2 col-form-label">Password</label>
        <div class="col-sm-10">
            <input type="password" class="form-control" name="password" value="<%=currentUser.getPassword()%>">
        </div>
    </div>
    <div class="row mb-3">
        <label class="col-sm-2 col-form-label">Phone</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" name="phone" value="<%=currentUser.getPhone()%>">
        </div>
    </div>
    <div class="row mb-3">
        <label class="col-sm-2 col-form-label">Role</label>
        <div class="col-sm-10">
            <select class="form-select" name="role">
                <option selected>Customer</option>
                <option>Staff</option>
            </select>
        </div>
    </div>
    <a class="btn btn-danger" href="profile?cancel=true&userId=<%=currentUser.getId()%>">Cancel Register</a>
    <button type="submit" class="btn btn-primary">Update</button>
</form>
<%@include file="foot.jsp" %>
