package datper;

public class Asignatura {

	public String nombreasignatura;
	public int creditos;
	public String horario;
	private String[] estudiantesmatriculados;
	public Profesor profesor;
	
	public Asignatura (String nombreasignatura, int creditos, String horario,Profesor profesor) {
		this.nombreasignatura = nombreasignatura;
		this.creditos = creditos;
		this.horario = horario;
		this.profesor = profesor;
	}
	public void setEstudiantesMatriculados(String[] estudiantes) {
		this.estudiantesmatriculados = estudiantes;
	}
	
	
}
