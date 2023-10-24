<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<meta charset="ISO-8859-1">
<title>Address Line 1 and Line 2</title>
</head>

<body>
<h1 class="w3-margin w3-center w3-container w3-purple">CCV and Expiry Year </h1>

	<form method="post" action="PrintData.jsp">
		<input type="hidden" name="name" value="${param.name}">
		<input type="hidden" name="address" value="${param.address}">
		<input type="hidden" name="card" value="${param.card}">
		<input type="hidden" name="ccv" value="${param.ccv}">
		<input type="hidden" name="expiry" value="${param.expiry}">
		Enter Address Line 1: <input type="text" name="addressLine1">
		Enter Address Line 2: <input type="text" name="addressLine2">
		<input type="submit" value="Submit">
	</form>
</body>
</html>