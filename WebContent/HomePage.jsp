<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta charset="utf-8">

  <meta name="viewport" content="width=device-width, initial-scale=1">

  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


</head>
<body style="background-color: powderblue">
<div class="container-fluid" style="background-color:aqua"> 

<h1>Amail.com</h1>
<hr>
</div>
<br><br>
<div class="container">
<form action="UserLoginController">

 <div class="form-group">
   <label for="userName">User Name :</label>
   <input type="text" class="form-control" name="t1">
 </div>

 <div class="form-group">
   <label for="pwd">Password :</label>
   <input type="password" class="form-control" name="t2">
 </div>

 <div class="checkbox">
   <label><input type="checkbox" >Remember Me</label>
</div>
<button type="submit" class="btn btn-info">Login</button>

</form>
New User .<a href="Register.jsp">Register Here </a>
</div>

</body>
</html>