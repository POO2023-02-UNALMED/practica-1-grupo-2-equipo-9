package uiMain;
import datper.Estudiante;
import datper.RegistroyMatricula;

public class Main {
	public static void main(String[] args) {
		Estudiante estudiante1 = new Estudiante(101822, "Ramiro Rancio Ronaldo", "Calle 12+1 #6-9", 5 , 2.0, 1000000);
		double t = RegistroyMatricula.valorMatricula(estudiante1);
		System.out.println(t);
		System.out.println(estudiante1.getEstrato());
		System.out.println(estudiante1.getPromedio());
		String k = RegistroyMatricula.controlMatriculayTarifas(estudiante1, 2);
		System.out.println(k);
	}
}
