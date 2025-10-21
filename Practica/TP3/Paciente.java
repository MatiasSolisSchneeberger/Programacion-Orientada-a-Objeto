/**
 * TP 3 - Act 8
 * Representa un paciente con su historia clínica, nombre, domicilio y localidades de nacimiento y residencia.
 *
 * @author Matias Solis Schneeberger
 * @version 1.0
 *
 */
public class Paciente {
	private int historiaClinica;
	private String nombre;
	private String domicilio;
	private Localidad localidadNacimiento;
	private Localidad localidadVive;


	/**
	 * Construye un nuevo paciente.
	 *
	 * @param p_historia        número de historia clínica
	 * @param p_nombre          nombre del paciente
	 * @param p_domicilio       domicilio del paciente
	 * @param p_localidadNacido localidad donde nació el paciente
	 * @param p_localidadVive   localidad donde vive el paciente
	 *
	 */
	Paciente(int p_historia,
			 String p_nombre,
			 String p_domicilio,
			 Localidad p_localidadNacido,
			 Localidad p_localidadVive) {
		this.setHistoriaClinica(p_historia);
		this.setNombre(p_nombre);
		this.setDomicilio(p_domicilio);
		this.setLocalidadNacimiento(p_localidadNacido);
		this.setLocalidadVive(p_localidadVive);
	}

	/**
	 * Obtiene el número de historia clínica del paciente.
	 *
	 * @return número de historia clínica
	 *
	 */
	public int getHistoriaClinica() {
		return historiaClinica;
	}

	/**
	 * Establece el número de historia clínica del paciente.
	 *
	 * @param historiaClinica número de historia clínica
	 *
	 */
	public void setHistoriaClinica(int historiaClinica) {
		this.historiaClinica = historiaClinica;
	}

	/**
	 * Obtiene el nombre del paciente.
	 *
	 * @return nombre del paciente
	 *
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre del paciente.
	 *
	 * @param nombre nombre del paciente
	 *
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene el domicilio del paciente.
	 *
	 * @return domicilio del paciente
	 *
	 */
	public String getDomicilio() {
		return domicilio;
	}

	/**
	 * Establece el domicilio del paciente.
	 *
	 * @param domicilio domicilio del paciente
	 *
	 */
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	/**
	 * Obtiene la localidad de nacimiento del paciente.
	 *
	 * @return localidad de nacimiento del paciente
	 *
	 */
	public Localidad getLocalidadNacimiento() {
		return localidadNacimiento;
	}

	/**
	 * Establece la localidad de nacimiento del paciente.
	 *
	 * @param localidadNacimiento localidad de nacimiento del paciente
	 *
	 */
	public void setLocalidadNacimiento(Localidad localidadNacimiento) {
		this.localidadNacimiento = localidadNacimiento;
	}

	/**
	 * Obtiene la localidad donde vive el paciente.
	 *
	 * @return localidad donde vive el paciente
	 *
	 */
	public Localidad getLocalidadVive() {
		return localidadVive;
	}

	/**
	 * Establece la localidad donde vive el paciente.
	 *
	 * @param localidadVive localidad donde vive el paciente
	 *
	 */
	public void setLocalidadVive(Localidad localidadVive) {
		this.localidadVive = localidadVive;
	}

	/**
	 * Muestra los datos del paciente en pantalla.
	 *
	 */
	public void mostrarDatosPantall() {
		System.out.println("Paciente: " + this.getNombre() +
				"\tHistoria Clínica: " + this.getHistoriaClinica() +
				"\tDomicilio: " + this.getDomicilio());
		this.getLocalidadVive().mostrar();
	}

	/**
	 * Muestra los datos del paciente en una cadena de texto.
	 *
	 */
	public void cadenaDeDatos() {
		System.out.println(this.getNombre() + "......." +
				this.getHistoriaClinica() + "......." +
				this.getDomicilio() + " - " +
				this.getLocalidadNacimiento().mostrar() + " - " +
				this.getLocalidadVive().mostrar());
	}

}
