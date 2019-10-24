<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> View Profile </title>
<meta charset="utf-8">

  <meta name="viewport" content="width=device-width, initial-scale=1">

  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


</head>
<body style="background-color:aqua; ">
<nav class="navbar navbar-inverse" style="color:white">

<div class="container-fluid">
  <div class="navbar-header">
  <a class="navbar-brand" href="#">Cmail</a>
  </div>


  <u1 class="nav navbar-nav">
    <li><a href="ViewProfile.jsp" style="color:aqua" >View Profile</a></li>
    <li><a href="ChangePasswordForm.jsp" style="color:lime">Change Password</a></li>
  </u1>

  <u1 class="nav navbar-nav navbar-right">
    <li>Welcome:${sessionScope.userObj.firstName} ${sessionScope.userObj.lastName }</li>
  </u1>

</div>
</nav>
</body>
</html>