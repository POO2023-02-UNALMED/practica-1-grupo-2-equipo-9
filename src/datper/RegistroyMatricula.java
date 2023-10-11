package datper;
import java.util.ArrayList;
public class RegistroyMatricula {

	public String director;
	public static ArrayList<Estudiante> estudiantes = new ArrayList<>();
	private static final double MATBASE = 100000;
    private static final double descuento = 0.2;
	
    
	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}
	public double getMatbase () {
		return RegistroyMatricula.MATBASE;
	}

	public static double calcularMatricula (Estudiante estudiante) {
        double matriculaSinDescuento = MATBASE * estudiante.numerocreditosmatriculados;
        if (estudiante.getPromedio()>= 4.5) {
        	double matriculaConDescuento = matriculaSinDescuento *descuento;
        	estudiante.valormatricula = matriculaConDescuento;
        	return matriculaConDescuento;}
        else {
        	estudiante.valormatricula = matriculaSinDescuento;
        	return matriculaSinDescuento;}
    }
	
	public static String controlMatriculaytarifa(String opcion) {
		if (opcion == "Informacion Estudiantes") {
			for (Estudiante estudiante : estudiantes) {
				RegistroyMatricula.calcularMatricula(estudiante);
				String cadena = "Estudiante: " + estudiante.nombre+ "\nCréditos: " + estudiante.numerocreditosmatriculados 
						+"\nMatrícula a pagar: $" + estudiante.valormatricula;
				return cadena;
			}
		}
		else if (opcion == "Estudiantes con matricula cero") {
			for (Estudiante estudiante : estudiantes) {
				if (estudiante.valormatricula == 0) {return "El estudiante: " + estudiante.nombre + "tienen matricula cero"; }
				else {return "El estudiante: " + estudiante.nombre + " NO posee matricula cero";}
			}
		}
		
		return "Registro y matricula no tiene respuesta a lo pedido";
	}
	
	
	
	
}
