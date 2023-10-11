package datper;
public class RegistroyMatricula {

	public String director;
	private Estudiante[] estudiantes;
	private static final double matbase = 100000;
    private static final double descuento = 0.2;
	
	public Estudiante[] getEstudiantes() {
		return estudiantes;
	}
	public double getMatbase () {
		return RegistroyMatricula.matbase;
	}

	public double calcularMatricula (Estudiante estudiante) {
        double matriculaSinDescuento = matbase * estudiante.numerocreditosmatriculados;
        if (estudiante.getPromedio()>= 4.5) {
        	double matriculaConDescuento = matriculaSinDescuento *descuento;
        	estudiante.valormatricula = matriculaConDescuento;
        	return matriculaConDescuento;}
        else {
        	estudiante.valormatricula = matriculaSinDescuento;
        	return matriculaSinDescuento;}
    }
	
	public String controlMatriculaytarifa(String opcion) {
		if (opcion == "Informacion Estudiantes") {
			for (Estudiante estudiante : estudiantes) {
				String cadena = "Estudiante: " + estudiante.nombre+ "Créditos: " + estudiante.numerocreditosmatriculados 
						+"Matrícula a pagar: $" + estudiante.valormatricula;
				return cadena;
			}
		}
		else if (opcion == "Estudiantes con matricula cero") {
			for (Estudiante estudiante : estudiantes) {
				if (estudiante.valormatricula == 0) {return "El estudiante: " + estudiante.nombre + "tienen matricula cero"; }
				else {return "El estudiante: " + estudiante.nombre + "NO posee matricula cero";}
			}
		}
		return "Registro y matricula no tiene respuesta a lo pedido";
	}
	
	
	
	
}
