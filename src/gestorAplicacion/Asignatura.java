package gestorAplicacion;
import java.util.ArrayList;

public class Asignatura {

	public String nombreasignatura;
	public int creditos;
	public String horario;
	private int cupos;
	private String[] estudiantesmatriculados;
	public Profesor profesor;
	private ArrayList<Grupo> grupos;
	private ArrayList<Asignatura> prerrequisitos;
    public static ArrayList<Asignatura> materiastotales = new ArrayList<Asignatura>();
	
	public Asignatura (String nombreasignatura, int creditos, String horario,Profesor profesor) {
		this.nombreasignatura = nombreasignatura;
		this.creditos = creditos;
		this.horario = horario;
		this.profesor = profesor;
		materiastotales.add(this);
		
		
	}
	public Asignatura(String nombreasignatura, int creditos,Profesor profesor, ArrayList<Asignatura> prerrequisitos) {
		this(nombreasignatura,creditos,"Por definir",profesor );
		this.prerrequisitos = prerrequisitos;
	}
	public Asignatura(String nombreasignatura, int creditos, String horario) {
		this(nombreasignatura, creditos, horario,null);
		
	}
	public Asignatura(String nombreasignatura, int creditos) {
		this(nombreasignatura, creditos, "Por asignar");
	}
	public void setEstudiantesMatriculados(String[] estudiantes) {
		this.estudiantesmatriculados = estudiantes;
	}
	public ArrayList<Grupo> getGrupos() {
		return grupos;
	}
	public void setGrupos(ArrayList<Grupo> grupos) {
		this.grupos = grupos;
	}
	public int getCupos() {
		return cupos;
	}
	public void setCupos(int cupos) {
		this.cupos = cupos;
	}
	public ArrayList<Asignatura> getPrerrequisitos() {
		return prerrequisitos;
	}
	public void setPrerrequisitos(ArrayList<Asignatura> prerrequisitos) {
		this.prerrequisitos = prerrequisitos;
	}
	public int cuposHabilitados(){
        int cantidad = 0;
        for (Grupo pGrupo:getGrupos()){
            cantidad+=pGrupo.getCupos();
        }
        return cantidad;
    }
	public Grupo crearGrupo(int numero, Profesor profesor, ArrayList<String> horario, int cupos){

    	Grupo grupo = new Grupo(this, numero, profesor, horario, cupos);
    	
    	cuposHabilitados();
    	this.grupos.add(grupo);
    	
    	return grupo;
    }
	public String toString() {
		return "Estos son los datos esenciales de la materia: "+ "\n1. Nombre: "+ this.nombreasignatura + "\n2. Creditos: "+ this.creditos
				+"\n3. Horario: "+ this.horario+"\n4. Profesor: "+this.profesor;
	}
	
}
