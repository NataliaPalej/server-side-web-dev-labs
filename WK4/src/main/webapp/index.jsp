<!DOCTYPE html>
<html>

<head>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<meta charset="ISO-8859-1">
<title>Forms with Servlet</title>
</head>

<body background="minion-pink.jpg">
<h1 class="w3-center w3-black">Forms with Servlet and Controller View</h1>

<div class="w3-container w3-half w3-padding-large">
	<form method="post" action="HelloControllerServlet1" class="w3-container w3-border w3-padding-16 w3-white" style="opacity: 0.8;">

	<div class="w3-container w3-half">Enter Name: </div> <input type="text" name="name" class="w3-container w3-half w3-margin-bottom" style="width:250px;">
	<div class="w3-container w3-half">Enter Address:</div> <input type="text" name="address" class="w3-container w3-half w3-margin-bottom" style="width:250px;">
	
	<input type="submit" value="Submit" class="w3-container w3-center w3-padding-large w3-hover-pink w3-right">
	
	</form>
</div>

<div class="w3-container w3-half w3-padding-large">
	<form method="post" action="BookControllerServlet" class="w3-container w3-border w3-padding-16 w3-white" style="opacity: 0.8;">
	
	<div class="w3-container w3-half">Enter Book Title: </div> <input type="text" name="title" class="w3-container w3-half w3-margin-bottom"  style="width:250px;">
	<div class="w3-container w3-half"> Enter Book Author: </div> <input type="text" name="author" class="w3-container w3-half w3-margin-bottom" style="width:250px;">
	
	<input type="submit" value="Submit" class="w3-container w3-center w3-padding-large w3-hover-pink w3-right">
	
	</form>
	</div>
</div>

</body>
</html>