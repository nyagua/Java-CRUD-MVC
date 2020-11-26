package controlador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Employee;
import modeloDAO.EmployeeDAO;

@WebServlet("/controlador")
public class Controlador extends HttpServlet {
	
	String listar="vistas/listar.jsp";
	String add="vistas/agregar.jsp";
	String edit="vistas/editar.jsp";
	Employee emp=new Employee(0, add, add, add, add, 0);
	EmployeeDAO dao=new EmployeeDAO();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String acceso="";
		String action=request.getParameter("accion");
		if(action.equalsIgnoreCase("listar")) {
			acceso=listar;
		}else if(action.equalsIgnoreCase("add")) {
			acceso=add;
		}else if(action.equalsIgnoreCase("Agregar")) {
			int id=Integer.parseInt(request.getParameter("txtId"));;
			String ape=request.getParameter("txtApe");
			String nom=request.getParameter("txtNom");
			String car=request.getParameter("txtCar");
			String sex=request.getParameter("txtSex");
			double sue=Double.parseDouble(request.getParameter("txtSue"));
			emp.setId(id);
			emp.setApe(ape);
			emp.setNom(nom);
			emp.setCar(car);
			emp.setSex(sex);
			emp.setSue(sue);
			dao.add(emp);
			acceso=listar;
		}else if(action.equalsIgnoreCase("editar")) {
			request.setAttribute("idemp", request.getParameter("id"));
			acceso=edit;
		}else if(action.equalsIgnoreCase("Actualizar")) {
			int id=Integer.parseInt(request.getParameter("txtId2"));
			String ape=request.getParameter("txtApe");
			String nom=request.getParameter("txtNom");
			String car=request.getParameter("txtCar");
			String sex=request.getParameter("txtSex");
			double sue=Double.parseDouble(request.getParameter("txtSue"));
			emp.setId(id);
			emp.setApe(ape);
			emp.setNom(nom);
			emp.setCar(car);
			emp.setSex(sex);
			emp.setSue(sue);
			dao.edit(emp);
			acceso=listar;
		}else if(action.equalsIgnoreCase("eliminar")) {
			int id=Integer.parseInt(request.getParameter("id"));
			emp.setId(id);
			dao.eliminar(id);
			acceso=listar;
		}
		RequestDispatcher vista=request.getRequestDispatcher(acceso);
		vista.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
