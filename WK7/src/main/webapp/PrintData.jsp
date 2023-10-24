<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<meta charset="ISO-8859-1">
<title>Print Data</title>
</head>

<body>
<h1 class="w3-margin w3-center w3-container w3-purple">Print Data Page</h1>

<table>

<tr>
	<th>Name:</th>
	<td>${param.name}</td>
</tr>

<tr>
	<th>Address:</th>
	<td>${param.address}</td>
</tr>

<tr>
	<th>Address:</th>
	<td>${param.addressLine1}</td>
</tr>

<tr>
	<th>Address:</th>
	<td>${param.addressLine2}</td>
</tr>

<tr>
	<th>Card Number:</th>
	<td>${param.card}</td>
</tr>

<tr>
	<th>Card CCV:</th>
	<td>${param.ccv}</td>
</tr>

<tr>
	<th>Expiry:</th>
	<td>${param.expiry}</td>
</tr>

</table>


</body>
</html>