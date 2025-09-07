/**
 * TP 3 - Act 6
 * Representa un docente con nombre, grado, sueldo básico y asignación familiar.
 * Permite calcular el sueldo total sumando sueldo básico y asignación.
 *
 * @author Matias Solis Schneeberger
 * @version 1.0
 */
public class Docente {
	private String nombre;
	private String grado;
	private double sueldoBasico;
	private double asignacionFamiliar;

	/**
	 * Constructor de la clase Docente.
	 *
	 * @param p_nombre             nombre del docente
	 * @param p_grado              grado del docente
	 * @param p_sueldoBasico       sueldo básico del docente
	 * @param p_asignacionFamiliar monto de la asignación familiar
	 */
	Docente(String p_nombre, String p_grado, double p_sueldoBasico, double p_asignacionFamiliar) {
		this.setNombre(p_nombre);
		this.setGrado(p_grado);
		this.setSueldoBasico(p_sueldoBasico);
		this.setAsignacionFamiliar(p_asignacionFamiliar);
	}

	/**
	 * Calcula el sueldo total del docente sumando sueldo básico y asignación familiar.
	 *
	 * @return sueldo total
	 */
	public double calcularSueldo() {
		return this.getSueldoBasico() + this.getAsignacionFamiliar();
	}

	/**
	 * @return nombre del docente
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre nombre del docente
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return grado del docente
	 */
	public String getGrado() {
		return grado;
	}

	/**
	 * @param grado grado del docente
	 */
	public void setGrado(String grado) {
		this.grado = grado;
	}

	/**
	 * @return sueldo básico del docente
	 */
	public double getSueldoBasico() {
		return sueldoBasico;
	}

	/**
	 * @param sueldoBasico nuevo sueldo básico
	 */
	public void setSueldoBasico(double sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}

	/**
	 * @return asignación familiar del docente
	 */
	public double getAsignacionFamiliar() {
		return asignacionFamiliar;
	}

	/**
	 * @param asignacionFamiliar nuevo valor de asignación familiar
	 */
	public void setAsignacionFamiliar(double asignacionFamiliar) {
		this.asignacionFamiliar = asignacionFamiliar;
	}
}
