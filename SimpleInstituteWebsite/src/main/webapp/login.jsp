<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login page</title>
</head>
<body>
<form action="login">
<table border="2">
<tr><td colspan="2"><h2>Login Form</h2></td>
</tr>
<tr><td><label for="choice">Select choice</label></td>
<td><select name="choice" id="choice" required>
    <option value="Admin">Admin</option>
    <option value="Student">Student</option>
    <option value="Faculty">Faculty</option>
    
  </select>
</td>
</tr>
<tr><td><label for="userName">UserName</label></td>
<td><input type="text" name="userName" id="userName" required>
</td>
</tr>
<tr><td><label for="password">Password</label></td>
<td><input type="text" name="password" id="password" required>
</td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="LOGIN"></td>
</tr>


</table>
</form>
</body>
</html>