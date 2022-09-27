<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Contador de peticiones.</h2>
	<form action="contadorPeticiones" method="post">
		<p>Petición número: <input type="text" id="numeroPeticion" name="numeroPeticion" size="40" value="${numeroPeticion}"></p>
		<input type="submit" value="contador" name="Logout">
	</form>
</body>
</html>