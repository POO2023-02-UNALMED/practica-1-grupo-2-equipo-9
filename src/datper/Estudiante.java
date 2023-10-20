package datper;

public class Estudiante extends Persona {

	private int estrato;
	private double promedio;
	public double valormatricula;
	int numerocreditosmatriculados;
	int ingresos;
	boolean matriculacero;
	private static final double MATBASE = 100000;
    private static final double descuento = 0.2;
	
	public Estudiante(int cedula, String nombre, String direccion, int estrato, double promedio, int ingresos, int numerocreditosmatriculados) {
		super(cedula, nombre, direccion);
		this.estrato = estrato;
		this.promedio = promedio;
		this.ingresos = ingresos;
		this.numerocreditosmatriculados = numerocreditosmatriculados;
		this.valormatricula = calcularMatricula(this);
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

	public static double calcularMatricula (Estudiante estudiante) {
        double matriculaSinDescuento = MATBASE * estudiante.numerocreditosmatriculados;
        if (estudiante.getEstrato() <= 3) {
        	double matriculacero = 0;
        	estudiante.valormatricula = matriculacero;
        	return matriculacero;}
        else if (estudiante.getPromedio()>= 4.5) {
        	double matriculaConDescuento = matriculaSinDescuento *descuento;
			return matriculaConDescuento;
        }
        else {
        	estudiante.valormatricula = matriculaSinDescuento;
        	return matriculaSinDescuento;}
    }
}
