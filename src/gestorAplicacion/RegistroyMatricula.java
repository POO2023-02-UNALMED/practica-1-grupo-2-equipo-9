package gestorAplicacion;
import java.util.ArrayList;

public class RegistroyMatricula {

	public String director;
	public static ArrayList<Estudiante> estudiantes = Estudiante.estudiantesregistrados;
	
    
	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}
	public static void agregarEstudiante (Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

	
	public static String controlMatriculaytarifa(String opcion) {
		if (opcion == "Informacion Estudiantes") {
			for (Estudiante estudiante : estudiantes) {
				String cadena = "Estudiante: " + estudiante.nombre+ "\nCréditos: " + estudiante.numerocreditosmatriculados 
						+"\nMatrícula a pagar: $" + estudiante.valormatricula+ "\nEstrato: "+estudiante.getEstrato();
				return cadena;
			}
		}
		else if (opcion == "Estudiantes con matricula cero") {
			for (Estudiante estudiante : estudiantes) {
				if (estudiante.valormatricula == 0) {
					return "El estudiante: " + estudiante.nombre + " tiene matricula cero"; 
				}
				else  {return "El estudiante: " + estudiante.nombre + " NO posee matricula cero";}
			}
		}
		else if (opcion == "Crear nueva asignatura por defecto") {
			Asignatura asignaturapordefecto = new Asignatura("Basicas", 3,"LM10-12",null);
			return asignaturapordefecto.toString();
		}
		return "Registro y matricula no tiene respuesta a lo pedido";
	}
	
	
	
	
}
