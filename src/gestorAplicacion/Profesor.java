package gestorAplicacion;

import java.util.ArrayList;
import java.io.Serializable;

public class Profesor extends Persona implements Serializable {
	private static final long serialVersionUID = 1L;
	public int horasdeclasesemanal;
	private String tipodeafiliacion;
	private long salario;
	private static ArrayList<Profesor> profesoresconlau = new ArrayList<Profesor>();
		
	public Profesor(int cedula, String nombre, String direccion, String tipodeafiliacion, long salario) {
		super(cedula, nombre, direccion);
		this.setTipodeafiliacion(tipodeafiliacion);
		this.salario = salario;
	}
	public void setTipoDeAfiliacion(String tda) {
		this.setTipodeafiliacion(tda);
	}
	public void setSalario (long salario) {
		this.salario = salario;
	}
	public String getTipodeafiliacion() {
		return tipodeafiliacion;
	}
	public void setTipodeafiliacion(String tipodeafiliacion) {
		this.tipodeafiliacion = tipodeafiliacion;
	}

	public int getHorasdeclasesemanal() {
		return horasdeclasesemanal;
	}
	public void setHorasdeclasesemanal(int horasdeclasesemanal) {
		this.horasdeclasesemanal = horasdeclasesemanal;
	}
	public long getSalario() {
		return salario;
	}

	public static ArrayList<Profesor> getProfesoresconlau() {
		return profesoresconlau;
	}
	public static void setProfesoresconlau(ArrayList<Profesor> profesoresconlau) {
		Profesor.profesoresconlau = profesoresconlau;
	}
}
