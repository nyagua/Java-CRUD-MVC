<%@ page import="modelo.Employee"%>
<%@ page import="modeloDAO.EmployeeDAO"%>
<%@ page import="java.util.List" %>
<%@page import="java.util.Iterator"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employees - List</title>
</head>
<body>
<div>     
	<h2>Employees - List</h2>
	<table border="1">
		<thead>
			<tr>
				<th>ID</th>
				<th>APELLIDO</th>
				<th>NOMBRE</th>
				<th>CARGO</th>
				<th>SEXO</th>
				<th>SUELDO</th>
			</tr>
		</thead>
		<%
			EmployeeDAO dao=new EmployeeDAO();
			List<Employee>list=dao.listar();
			Iterator<Employee>iter=list.iterator();
			Employee emp=null;
			while(iter.hasNext()) {
				emp=iter.next();
		%>
		<tbody>
			<tr>
				<td><%= emp.getId()%></td>
				<td><%= emp.getApe()%></td>
				<td><%= emp.getNom()%></td>
				<td><%= emp.getCar()%></td>
				<td><%= emp.getSex()%></td>
				<td><%= emp.getSue()%></td>
				<td>
					<a href="controlador?accion=editar&id=<%= emp.getId()%>">Edit</a>
					<a href="controlador?accion=eliminar&id=<%= emp.getId()%>">Remove</a>
				</td>
			</tr>
			<%} %>
		</tbody>
	</table>
</div>
</body>
</html>