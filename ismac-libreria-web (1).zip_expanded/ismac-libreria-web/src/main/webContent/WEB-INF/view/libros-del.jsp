<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ELIMINAR LIBROS</title>
</head>
<body>
<h1>ELIMINAR LIBRO</h1>
		<form action ="del" method="GET">
		
			<input type="hidden" id="idlibro" name="idLibro"  value="${libro.idLibro }">
			<strong>�Desea elminar el dato?</strong>
			<br/><br/>
			<button type="submit">Aceptar</button>
			<button type="button" onclick="window.location.href='/ismac-libreria-web/libros/findAll;return false;'">Cancelar</button>
				
		
		</form>
</body>
</html>