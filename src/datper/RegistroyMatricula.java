package datper;

public class RegistroyMatricula {

	public String director;
	private Persona[] personas;
	
	public Persona[] personas() {
		return personas;
	}
	
	public static String controlMatriculayTarifas(Estudiante estudiante, int opcion) {
		if (opcion == 1) {
			double valMatest = valorMatricula(estudiante);
			if (valMatest == 0) {
				estudiante.valormatricula = valMatest;
				return "Usted posee matricula 0";
			}
			else if (valMatest > 0){
				String cadena = "Su matricula es: "+ valMatest + " por tanto no es beneficiaro de Matricula 0";
				estudiante.valormatricula = valMatest;
				return cadena;
			}
		}
		else if (opcion == 2) {
			double valMatest = valorMatricula(estudiante);
			if (valMatest!= 0 && valMatest >= 100000) {
				double fraccion = 1/3;
				double valorFraccion = fraccion*valMatest;
				return "El valor de la fraccion es: "+ valorFraccion;
			}
			
			else if (estudiante.valormatricula== 0) {
				return "Usted tiene matricula cero y no se puede fraccionar el 0 mijx";
			}
		}
		
		
		return "Su informacion ha sido cargada y generada";
	}
	public static double valorMatricula(Estudiante estudiante) {
		int estrat = estudiante.getEstrato();
		if (estrat <= 3 || estudiante.getPromedio()>= 4.5) {
			double valorm = 0;
			return valorm;
		}
		else if (estrat > 3 || estudiante.getPromedio()< 4.5){
			double tasa = 1/2;
			double valorm = estudiante.ingresos*tasa;
			return valorm;
		}
		else {return 0;}
	}
	
	
}
