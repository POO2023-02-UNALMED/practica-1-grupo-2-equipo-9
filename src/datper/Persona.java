package datper;

public class Persona {

	protected int cedula; //protected funciona para heredar
	public String nombre;
	protected String direccion;
		
	public Persona(int cedula , String nombre, String direccion) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	public int getCedula() {
		return cedula;
	}
	
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}

