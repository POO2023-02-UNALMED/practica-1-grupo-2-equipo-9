package datper;

public class RegistroyMatricula {

	public String director;
	private Persona[] personas;
	
	public Personas[] personas() {
		return personas;
	}
	
	public  String controlMatriculayTarifas(Estudiante estudiante, int opcion) {
		int estrat = estudiante.getEstrato();
		if (opcion == 1) {
			String matricula = "";
			if (estrat <= 3) {
				estudiante.valormatricula = 0;
				matricula = "Matricula cero";
			}
			else if (estrat > 3){
				double tasa = 1/2;
				double matr = estrat*estudiante.ingresos*tasa;
				String cadena = "Su matricula es: "+ matr;
				estudiante.valormatricula = matr;
				matricula = cadena;
			}
			return matricula;
		}
		else if (opcion == 2) {
			if (estudiante.valormatricula != 0 && estudiante.valormatricula >= 1000000) {
				double fraccion = 1/3;
				double valorFraccion = fraccion*estudiante.valormatricula;
				return "El valor de la fraccion es: "+ valorFraccion;
			}
			
			else if (estudiante.valormatricula== 0) {
				return "Usted tiene matricula cero y no se puede fraccionar el 0 mijx";
			}
		}
		
		
		return "Su informacion ha sido cargada y generada";
	}	
	
}
