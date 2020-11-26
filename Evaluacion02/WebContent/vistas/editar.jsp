<%@ page import="modelo.Employee"%>
<%@ page import="modeloDAO.EmployeeDAO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit - Employee</title>
</head>
<body>
<div>
	<%
		EmployeeDAO dao=new EmployeeDAO();
		int id=Integer.parseInt((String)request.getAttribute("idemp"));
		Employee emp=(Employee)dao.list(id);
	%>
	<h2>Edit Employee</h2>
	<form action="controlador">
		<label>Apellido:</label>
		<br>
		<input type="text" name="txtApe" value="<%= emp.getApe()%>">
		<br>
		<label>Nombre:</label>
		<br>
		<input type="text" name="txtNom" value="<%= emp.getNom()%>">
		<br>
		<label>Cargo:</label>
		<br>
		<input type="text" name="txtCar" value="<%= emp.getCar()%>">
		<br>
		<label>Sexo:</label>
		<br>
		<input type="text" name="txtSex" value="<%= emp.getSex()%>">
		<br>
		<label>Sueldo:</label>
		<br>
		<input type="text" name="txtSue" value="<%= emp.getSue()%>">
		<br>
		<br>
		<input type="hidden" name="txtId2" value="<%= emp.getId()%>">
		<input type="submit" name="accion" value="Actualizar">
		<br>
		<br>
		<a href="controlador?accion=listar">List employees</a>
	</form>
</div>
</body>
</html>