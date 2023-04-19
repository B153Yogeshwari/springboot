<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login page</title>

</head>
<script type="text/javascript">
function login() {
	
alert("hi");

var un = document.getElementById("un").value;
var pass = document.getElementById("pw").value;

alert(un);
alert(pass);

var req = new XMLHttpRequest();
var url = "http://localhost:9090/getdata";
req.open("GET", url, true);
req.send();

alert("send successfully..");

req.onreadystatechange = function()
{
	alert("ready state"+req.readyState);
	if(req.readyState ==4 && req.status==200)
	{
	alert(req.responseText);
}
}
}
</script>
<body>
<form action="log">
<table>
<tr>
<td>USERNAME:</td>
<td><input type="text" name="username" id="un"></td>
</tr>
<tr>
<td>PASSWORD:</td>
<td><input type="text" name="password" id="pw"></td>
</tr>
<tr>
<td><input type="submit" value="LOGIN" onClick="login()"></td>
</tr>
</table>
</form>
</body>
</html>