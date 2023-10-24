package gestorAplicacion;
import java.io.Serializable;
import java.util.ArrayList;

public class Grupo implements Serializable {
	private static final long serialVersionUID = 1L;
	private Asignatura asignatura;	
	private int numero;
    private Profesor profesor;
    private ArrayList<String> horario; 
    private int cupos;
    private ArrayList<Estudiante> estudiantes;
    private static ArrayList<Grupo> grupostotales = new ArrayList<Grupo>();
    
 	public Grupo(Asignatura asignatura, int numero, Profesor profesor, ArrayList<String> horario, int cupos,
			ArrayList<Estudiante> estudiantes) {
		super();
		this.asignatura = asignatura;
		this.numero = numero;
		this.profesor = profesor;
		this.horario = horario;
		this.cupos = cupos;
		this.estudiantes = estudiantes;
		grupostotales.add(this);
	}
    
    public Grupo(Asignatura asignatura, int numero, Profesor profesor, ArrayList<String> horario, int cupos){
    	this.asignatura = asignatura;
		this.numero = numero;
		this.profesor = profesor;
		this.horario = horario;
		this.cupos = cupos;
    }
    public Asignatura getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public ArrayList<String> getHorario() {
		return horario;
	}

	public void setHorario(ArrayList<String> horario) {
		this.horario = horario;
	}

	public int getCupos() {
		return cupos;
	}

	public void setCupos(int cupos) {
		this.cupos = cupos;
	}

	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}
	   
    public static ArrayList<Grupo> getGrupostotales() {
		return grupostotales;
	}

	public void setGrupostotales(ArrayList<Grupo> grupostotales) {
		Grupo.grupostotales = grupostotales;
	}



}
