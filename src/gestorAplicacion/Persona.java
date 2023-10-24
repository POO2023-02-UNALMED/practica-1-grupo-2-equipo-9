package gestorAplicacion;

import java.io.Serializable;
import java.util.ArrayList;

public class Persona implements Serializable {
	private static final long serialVersionUID = 1L;
	protected int cedula;
	public String nombre;
	protected String direccion;
	public static long cantidadpersonas;
	private static ArrayList<Persona> personasensistema = new ArrayList<Persona>();
		
	public static ArrayList<Persona> getPersonasensistema() {
		return personasensistema;
	}

	public static void setPersonasensistema(ArrayList<Persona> personasensistema) {
		Persona.personasensistema = personasensistema;
	}

	public Persona(int cedula , String nombre, String direccion) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.direccion = direccion;
		cantidadpersonas++;
		personasensistema.add(this);
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

