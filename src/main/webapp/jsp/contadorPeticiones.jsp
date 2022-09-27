<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Contador de peticiones de la sesión.</h2>
	<form action="contadorPeticiones" method="post">
		<c:set var = "numero" scope = "session" value = "${numeroPeticion}"/>
		<p>Petición número: ${numeroPeticion}
			<c:if test="${numero == null}">0</c:if>
		</p>
		<input type="submit" value="contador" name="Logout">
	</form>
</body>
</html>