<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<jsp:include page="Header.jsp"></jsp:include>
<body>
<div class="container">

  <h1>Profile Details</h1>
  <hr/>
  User Name : ${sessionScope.userObj.userName }<br>
  Password : ${sessionScope.userObj.password }<br>
  First Name :${sessionScope.userObj.firstName }<br>
  Last Name :${sessionScope.userObj.lastName }<br>
</div>


</body>
</html>