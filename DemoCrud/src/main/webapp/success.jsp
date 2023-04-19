<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>success page</title>
<script type="text/javascript">
function adduser() {
	alert("hello");
	document.fn.action="register.jsp";
	document.fn.submit();
	
}
function edituser() {
	document.fn.action="edit";
	document.fn.submit();
	
}
function deleteuser() {
	
	document.fn.action="delete";
	document.fn.submit();
	
}
</script>
</head>
<body>
<form name="fn">
<table border="2">
<tr>
<th>Rollno</th>
<th>Name</th>
<th>Username</th>
<th>Password</th>
<th>Action</th>


</tr>
<c:forEach items="${data}" var="stu">
<tr>

<td>${stu.rollno}</td>
<td>${stu.name}</td>
<td>${stu.userName}</td>
<td>${stu.password}</td>
<td><a href="edit?rollno=${stu.rollno}"><input type="button" value="Edit"></a>
<a href="delete?rollno=${stu.rollno}"><input type="button" value="Delete"></a>
</td>



</tr>
</c:forEach>
</table>


</form>
</body>
</html>