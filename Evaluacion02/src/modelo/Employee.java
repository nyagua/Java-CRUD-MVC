package modelo;

public class Employee {
	private int id;
	private String ape;
	private String nom;
	private String car;
	private String sex;
	private double sue;
	
	public Employee(int id, String ape, String nom, String car, String sex, double sue) {
		super();
		this.id = id;
		this.ape = ape;
		this.nom = nom;
		this.car = car;
		this.sex = sex;
		this.sue = sue;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getApe() {
		return ape;
	}
	public void setApe(String ape) {
		this.ape = ape;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCar() {
		return car;
	}
	public void setCar(String car) {
		this.car = car;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public double getSue() {
		return sue;
	}
	public void setSue(double sue) {
		this.sue = sue;
	}
	
}
