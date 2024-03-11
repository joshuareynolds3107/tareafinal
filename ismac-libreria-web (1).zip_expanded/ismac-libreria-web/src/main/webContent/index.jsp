<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Portada</title>
</head>
<body>
<h1>HOLA MUNDO DESDE APACHE Y JSP </h1>
<ul><a href="${pageContext.request.contextPath }/">HOME</a></ul>
<ul><a href="${pageContext.request.contextPath }/clientes/findAll">CLIENTES</a></ul>
<ul><a href="${pageContext.request.contextPath }/libros/findAll">LIBROS</a></ul>
<ul><a href="${pageContext.request.contextPath }/reportes">REPORTES</a></ul>


</body>
</html>