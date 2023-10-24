package gestorAplicacion;

public class Profesor extends Persona {
	public int horasdeclasesemanal;
	private String tipodeafiliacion;
	private long salario;
	
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
	
	
}
