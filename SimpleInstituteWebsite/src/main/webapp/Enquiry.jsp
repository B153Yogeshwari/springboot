<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enquiry page</title>
</head>
<body>
<form action="enquiry">
<h2 align="center">Enquiry Form</h2>
<table border="2" align="center">
<tr><td>FirstName</td><td><input type="text" name="firstName"></td></tr>
<tr><td>LastName</td><td><input type="text" name="lastName"></td></tr>
<tr><td>Address</td><td><input type="text" name="address"></td></tr>
<tr><td>Mobile No</td><td><input type="tel" name="mobileNo"></td></tr>
<tr><td>Adhar No</td><td><input type="number" name="adharno"></td></tr>
<tr><td>Education</td><td><input type="text" name="education"></td></tr>
<tr><td>Pass out year</td><td><input type="number" name="passoutyear"></td></tr>
<tr><td>Course</td><td><input type="text" name="course"></td></tr>
<tr><td colspan="2" align="center"><input type="submit" value="SUBMIT"></td></tr>

</table>
</form>
</body>
</html>