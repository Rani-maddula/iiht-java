<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Student Login</h1>
<form action="student/studentLogim" method="post">
UserName:<input type="text" name ="uname">
Password:<input type="password" name ="password">
<br>
<input type="submit" value="login">
</form>
new student<a href="/student/registerstudent">Register here</a>


</body>
</html>
