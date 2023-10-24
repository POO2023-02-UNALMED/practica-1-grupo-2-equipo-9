package gestorAplicacion;

import java.io.Serializable;
import java.util.ArrayList;

public class Estudiante extends Persona implements Serializable {
	private static final long serialVersionUID = 1L;
	private int estrato = 3;
	private double promedio;
	public double valormatricula;
	int numerocreditosmatriculados = 11;
	int ingresos = 400000;
	boolean matriculacero;
	private static final double MATBASE = 100000;
    private static final double descuento = 0.2;
    public static ArrayList<Estudiante> estudiantesregistrados = new ArrayList<Estudiante>();
	
	public Estudiante(int cedula, String nombre, String direccion, int estrato, double promedio, int ingresos, int numerocreditosmatriculados) {
		super(cedula, nombre, direccion);
		this.estrato = estrato;
		this.promedio = promedio;
		this.ingresos = ingresos;
		this.numerocreditosmatriculados = numerocreditosmatriculados;
		this.valormatricula = calcularMatricula(this);
		estudiantesregistrados.add(this);
	}
	public Estudiante(int cedula, String nombre, String direccion) {
		super(cedula, nombre, direccion);
		estudiantesregistrados.add(this);
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
	public static boolean encontrarEstudianteconCC(int cedula) {
		for (Estudiante estudiante : estudiantesregistrados) {
			if (estudiante.getCedula() == cedula) {
				return true;
			}
		}
		return false;
	}
	public String toString() {
		return "\nNombre: "+ this.nombre + "\nCedula: "+ this.cedula + "\nDireccion: "+ this.direccion;
	}

}
