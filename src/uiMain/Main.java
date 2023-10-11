package uiMain;
import datper.Estudiante;
import datper.RegistroyMatricula;

public class Main {
	public static void main(String[] args) {
		Estudiante estudiante1 = new Estudiante(101822, "Ramiro Rancio Ronaldo", "Calle 12+1 #6-9", 5 , 2.0, 1000000);
		RegistroyMatricula.agregarEstudiante(estudiante1);
		System.out.println(RegistroyMatricula.controlMatriculaytarifa("Informacion Estudiantes"));
	}
}
