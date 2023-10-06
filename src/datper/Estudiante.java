package datper;

public class Estudiante extends Persona {

	private int estrato;
	private double promedio;
	public double valormatricula;
	int numerocreditosmatriculados;
	long ingresos;
	
	public Estudiante(int cedula, String nombre, String direccion, int estrato, double promedio, long ingresos) {
		super(cedula, nombre, direccion);
		this.estrato = estrato;
		this.promedio = promedio;
		this.ingresos = ingresos;
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
