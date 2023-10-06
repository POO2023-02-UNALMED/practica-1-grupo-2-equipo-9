package datper;

public class Estudiante extends Persona {

	private int estrato;
	private double promedio;
	public long valormatricula;
	int numerocreditosmatriculados;
	
	public Estudiante(int cedula, String nombre, String direccion, int estrato, double promedio, long valormatricula) {
		super(cedula, nombre, direccion);
		this.estrato = estrato;
		this.promedio = promedio;
		this.valormatricula = valormatricula;
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
