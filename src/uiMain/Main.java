package uiMain;
import datper.Estudiante;
import datper.RegistroyMatricula;

public class Main {
	public static void main(String[] args) {
		Estudiante estudiante1 = new Estudiante(101822, "Ramiro Rancio Ronaldo", "Calle 12+1 #6-9", 5 , 4.8 , 1000000);
		String k = RegistroyMatricula.controlMatriculayTarifas(estudiante1, 1);
		System.out.println(k);
	}
}
