package modeloDAO;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import config.Conexion;
import interfaces.CRUD;
import modelo.Employee;

public class EmployeeDAO implements CRUD{
	
	Conexion cn=new Conexion();
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	Employee e=new Employee(0, null, null, null, null, 0);
	
	@Override
	public List listar() {
		ArrayList<Employee>list=new ArrayList<>();
		String sql="select * from empleado";
		try {
			con=cn.getConnection();
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				Employee emp=new Employee(0, sql, sql, sql, sql, 0);
				emp.setId(rs.getInt("idEmpleado"));
				emp.setApe(rs.getString("apellido"));
				emp.setNom(rs.getString("nombre"));
				emp.setCar(rs.getString("cargo"));
				emp.setSex(rs.getString("sexo"));
				emp.setSue(rs.getInt("sueldo"));
				list.add(emp);
			}
		} catch (Exception e) {
			
		}
		return list;
	}

	@Override
	public Employee list(int id) {
		String sql="select * from empleado where idEmpleado="+id;
		try {
			con=cn.getConnection();
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				e.setId(rs.getInt("idEmpleado"));
				e.setApe(rs.getString("apellido"));
				e.setNom(rs.getString("nombre"));
				e.setCar(rs.getString("cargo"));
				e.setSex(rs.getString("sexo"));
				e.setSue(rs.getInt("sueldo"));
			}
		} catch (Exception e) {
			
		}
		return e;
	}

	@Override
	public boolean add(Employee emp) {
		String sql="insert into empleado()values('"+emp.getId()+"','"+emp.getApe()+"','"+emp.getNom()+"','"+emp.getCar()+"','"+emp.getSex()+"','"+emp.getSue()+"')";
		try {
			con=cn.getConnection();
			ps=con.prepareStatement(sql);
			ps.executeUpdate();
		} catch (Exception e) {
			
		}
		return false;
	}

	@Override
	public boolean edit(Employee emp) {
		String sql="update empleado set idEmpleado='"+emp.getId()+"',apellido='"+emp.getApe()+"',nombre='"+emp.getNom()+"',cargo='"+emp.getCar()+"',sexo='"+emp.getSex()+"',sueldo='"+emp.getSue()+"'where idEmpleado="+emp.getId();
		try {
			con=cn.getConnection();
			ps=con.prepareStatement(sql);
			ps.executeUpdate();
		}catch (Exception e) {
			
		}
		return false;
	}

	@Override
	public boolean eliminar(int id) {
		String sql="delete from empleado where idEmpleado="+id;
		try {
			con=cn.getConnection();
			ps=con.prepareStatement(sql);
			ps.executeUpdate();
		}catch (Exception e) {

		}
		return false;
	}
	
}
