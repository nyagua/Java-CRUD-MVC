package interfaces;

import java.util.List;
import modelo.Employee;

public interface CRUD {
	public List listar();
	public Employee list(int id);
	public boolean add(Employee emp);
	public boolean edit(Employee emp);
	public boolean eliminar(int id);
}
