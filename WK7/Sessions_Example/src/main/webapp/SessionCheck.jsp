<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
 
 <!-- user method -->
<c:out value="${sessionScope.user.name}"/>​
<c:out value="${sessionScope.user.address}"/>

<!-- strings method
<c:out value="${sessionScope.name}"/>​
<c:out value="${sessionScopeaddress}"/>

 -->


</body>
</html>