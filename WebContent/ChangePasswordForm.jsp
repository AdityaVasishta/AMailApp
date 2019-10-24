<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:include page="Header.jsp"></jsp:include>

<body>
<div class="container">
  <h1>Change Password</h1>
  <form action="ChangePasswordController">

 <div class ="form-group">
  <label for="password">New Password :</label>
  <input type="password" class="form-control" name="password1">
 </div>
 <div class="form-group">
  <label for="password">Confirm Password</label>
  <input type="password" class="form-control" name="password2"> 
 </div>
 
 <button type="submit" class="btn btn-default" >Change Password</button>
  </form>

</div>

</body>
</html>