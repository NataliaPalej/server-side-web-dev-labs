<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<title>Display List Database</title>
</head>

<body>
<h1 class="w3-center w3-black">Display Database List</h1>
	<!-- listOfUsers must match the name from UserController -->
	
	
		<table class="w3-border">
			<tr class="w3-border">
				<th>Name</th>
				<th>Address</th>
			</tr>
			<c:forEach items="${listOfUsers}" var="user">
			<tr >
				<td ><c:out value="${user.name}"/></td>
				<td><c:out value="${user.address}"/></td>	
			</tr>
			</c:forEach>
		</table>

	
	
</body>

</html>