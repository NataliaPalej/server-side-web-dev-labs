<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Forms with Servlet</title>
</head>
<body>
	<h2>Servlets - Exercise</h2>
	<p>Write a JSP page containing a FORM which has texfield to enter a name and address.
	The form should return a message like "Hello -name- from -town-".
	</p>
	<p></p>
	<form method = "post" action="HelloFormsServlet">
		Enter name: <input type="text" name="name">
		Enter city: <input type="text" name="city">
		<input type="submit" value="Submit">
	</form>
</body>