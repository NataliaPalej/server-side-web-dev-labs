<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<meta charset="ISO-8859-1">
<title>CCV and Expiry</title>
</head>

<body>
<h1 class="w3-margin w3-center w3-container w3-purple">CCV and Expiry Year </h1>

	<form method="post" action="GatherData3.jsp">
		<input type="hidden" name="name" value="${param.name}">
		<input type="hidden" name="address" value="${param.address}">
		Enter Credit Card Number: <input type="text" name="card"> <br>
		Enter CCV: <input type ="text" name ="ccv"> <br>
		Enter Expiry Year: <input type="text" name="expiry"> <br>
		<input type="submit" value="Submit">
	</form>
</body>
</html>