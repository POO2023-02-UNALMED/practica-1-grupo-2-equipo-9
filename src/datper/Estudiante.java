package datper;

public class Estudiante extends Persona {

	private int estrato;
	private double promedio;
	public double valormatricula;
	int numerocreditosmatriculados;
	int ingresos;
	boolean matriculacero;
	
	public Estudiante(int cedula, String nombre, String direccion, int estrato, double promedio, int ingresos) {
		super(cedula, nombre, direccion);
		this.estrato = estrato;
		this.promedio = promedio;
		this.ingresos = ingresos;
		this.valormatricula = ingresos*0.2;
	}
	
	public int getEstrato() {
		return estrato;
	}
	public void setEstrato(int estrato) {
		this.estrato = estrato;
	}
	public double getPromedio() {
		return promedio;
	}
	
}
