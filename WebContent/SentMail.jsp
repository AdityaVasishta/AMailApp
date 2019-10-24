<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<jsp:include page="Header.jsp"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
 <h1>Outbox</h1>
   <sql:setDataSource var="conn" driver="com.mysql.jdbc.Driver"
   url="jdbc:oracle:thin:@localhost:1521:xe"
   user="system" password/>
 
</div>

</body>
</html>