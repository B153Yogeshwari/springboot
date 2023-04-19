<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>edit page</title>
</head>
<body>
<form action="update">
<table border="2">
<tr>
<td></td>
<td><input type="hidden" name="rollno" value="${s.rollno}"></td>
</tr>
<tr>
<td>Name</td>
<td><input type="text" name="name" value="${s.name}"></td></tr>
<tr>
<td>UserName</td>
<td><input type="text" name="userName" value="${s.userName}"></td>
</tr>
<tr>
<td>Password</td>
<td><input type="text" name="password" value="${s.password}">
</td>
</tr>
<tr>
<td colspan="2" align="center"><input type="submit" value="update"></td></tr>

</table>

</form>
</body>
</html>