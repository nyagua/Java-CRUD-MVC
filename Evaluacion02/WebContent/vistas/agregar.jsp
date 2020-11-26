<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register - Employee</title>
</head>
<body>
<div>
	<h2>Register Employee</h2>
	<form action="controlador">
		<label>Id:</label>
		<br>
		<input type="text" name="txtId">
		<br>
		<label>Apellido:</label>
		<br>
		<input type="text" name="txtApe">
		<br>
		<label>Nombre:</label>
		<br>
		<input type="text" name="txtNom">
		<br>
		<label>Cargo:</label>
		<br>
		<input type="text" name="txtCar">
		<br>
		<label>Sexo:</label>
		<br>
		<input type="text" name="txtSex">
		<br>
		<label>Sueldo:</label>
		<br>
		<input type="text" name="txtSue">
		<br>
		<br>
		<input type="submit" name="accion" value="Agregar">
		<br>
		<br>
		<a href="controlador?accion=listar">List employees</a>
	</form>
</div>
</body>
</html>