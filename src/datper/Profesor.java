package datper;

public class Profesor extends Persona {
	public int horasdeclasesemanal;
	private String tipodeafiliacion;
	private long salario;
	
	public Profesor(int cedula, String nombre, String direccion, String tipodeafiliacion, long salario) {
		super(cedula, nombre, direccion);
		this.tipodeafiliacion = tipodeafiliacion;
		this.salario = salario;
	}
	public void setTipoDeAfiliacion(String tda) {
		this.tipodeafiliacion = tda;
	}
	public void setSalarion(long salario) {
		this.salario = salario;
	}
}
