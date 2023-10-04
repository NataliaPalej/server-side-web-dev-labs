<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Details</title>
</head>
<body>
    Book Title: <c:out value="${book.title}"/> <br>
    Book Author: <c:out value="${book.author}"/> <br>
</body>
</html>