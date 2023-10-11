<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<title>Display Books</title>
</head>

<body background="minion-pink.jpg">
	<h1 class="w3-center w3-black">List of Books</h1>
	
	<table class="w3-border w3-padding w3-margin w3-white" style="opacity: 0.8;"> 
		<tr>
			<th class="w3-panel w3-border-right w3-border-bottom">Title</th>
			<th class="w3-panel w3-border-right w3-border-bottom">Author</th>
			<th class="w3-panel w3-border-right w3-border-bottom">Year</th>
			<th class="w3-panel w3-border-bottom">Type</th>
		</tr>
		
		<c:forEach items="${bookList}" var="bookObj">
		<tr>
			<td class="w3-panel w3-border-right w3-border-bottom"> <c:out value="${bookObj.title}"/> </td>
			<td class="w3-panel w3-border-right w3-border-bottom"> <c:out value="${bookObj.author}"/> </td>
			<td class="w3-panel w3-border-right w3-border-bottom"> <c:out value="${bookObj.year}"/> </td>
			<td class="w3-panel w3-border-bottom"> <c:out value="${bookObj.type}"/> </td>
		</tr>
		</c:forEach>
	</table>

</body>

</html>