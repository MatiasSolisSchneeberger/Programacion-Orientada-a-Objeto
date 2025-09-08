import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * TP 2 - Act 1
 * TP 3 - Act 7 - Act 9
 * Representa una persona con datos básicos y métodos para obtener su información.
 * Incluye cálculo de edad considerando solo la diferencia de años.
 *
 * @author Matias Solis Schneeberger
 * @version 2.0
 */
public class Persona {
	Calendar fechaHoy = new GregorianCalendar();
	private final int anioActual = fechaHoy.get(Calendar.YEAR);
	private int nroDNI;
	private String nombre;
	private String apellido;
	private Calendar fechaNacimiento;

	/**
	 * Construye una nueva persona.
	 *
	 * @param p_nroDNI         número de documento de identidad
	 * @param p_nombre         nombre de la persona
	 * @param p_apellido       apellido de la persona
	 * @param p_anioNacimiento año de nacimiento
	 */
	Persona(int p_nroDNI, String p_nombre, String p_apellido, int p_anioNacimiento) {
		setDNI(p_nroDNI);
		setNombre(p_nombre);
		setApellido(p_apellido);
		setAnioNacimiento(p_anioNacimiento);
	}

	/**
	 * Construye una nueva persona.
	 *
	 * @param p_nroDNI          número de documento de identidad
	 * @param p_nombre          nombre de la persona
	 * @param p_apellido        apellido de la persona
	 * @param p_fechaNacimiento fecha de nacimiento
	 */
	Persona(int p_nroDNI, String p_nombre, String p_apellido, Calendar p_fechaNacimiento) {
		this.setDNI(p_nroDNI);
		this.setNombre(p_nombre);
		this.setApellido(p_apellido);
		this.setFechaNacimiento(p_fechaNacimiento);
	}


	/**
	 * Establece el número de documento.
	 *
	 * @param p_nroDNI número de documento
	 */
	private void setDNI(int p_nroDNI) {
		nroDNI = p_nroDNI;
	}

	/**
	 * Establece el nombre.
	 *
	 * @param p_nombre nombre de la persona
	 */
	private void setNombre(String p_nombre) {
		nombre = p_nombre;
	}

	/**
	 * Establece el apellido.
	 *
	 * @param p_apellido apellido de la persona
	 */
	private void setApellido(String p_apellido) {
		apellido = p_apellido;
	}

	/**
	 * Establece el año de nacimiento.
	 *
	 * @param p_anioNacimiento año de nacimiento
	 */
	private void setAnioNacimiento(int p_anioNacimiento) {
		this.setFechaNacimiento(new GregorianCalendar(p_anioNacimiento, Calendar.JANUARY, 1));
	}

	/**
	 * Devuelve el número de documento.
	 *
	 * @return número de documento
	 */
	public int getDNI() {
		return nroDNI;
	}

	/**
	 * Devuelve el nombre.
	 *
	 * @return nombre de la persona
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Devuelve el apellido.
	 *
	 * @return apellido de la persona
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * Devuelve el año de nacimiento.
	 *
	 * @return año de nacimiento
	 */
	public int getAnioNacimiento() {
		return getFechaNacimiento().get(Calendar.YEAR);
	}

	/**
	 * Devuelve la fecha de nacimiento.
	 *
	 * @return fecha de nacimiento
	 */
	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * Establece la fecha de nacimiento.
	 *
	 * @param fechaNacimiento fecha de nacimiento
	 */
	public void setFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	/**
	 * Calcula la edad en años cumplidos.
	 *
	 * @return edad actual
	 */
	public int edad() {
		return anioActual - getAnioNacimiento();
	}

	/**
	 * Devuelve el nombre y apellido en formato "Nombre Apellido".
	 *
	 * @return nombre y apellido concatenados
	 */
	public String nomYApe() {
		return getNombre() + " " + getApellido();
	}

	/**
	 * Devuelve el apellido y nombre en formato "Apellido Nombre".
	 *
	 * @return apellido y nombre concatenados
	 */
	public String apeYNom() {
		return getApellido() + " " + getNombre();
	}

	/**
	 * Muestra por pantalla la información de la persona.
	 *
	 */
	public void mostrar() {
		System.out.println("Nombre y Apellido: " + nomYApe());
		System.out.print("DNI: " + getDNI() + "\t");
		System.out.println("Edad: " + edad() + " años");
	}

	public boolean esCumpleanios() {

		return fechaHoy.get(Calendar.DAY_OF_MONTH) == fechaNacimiento.get(Calendar.DAY_OF_MONTH)
				&& fechaHoy.get(Calendar.MONTH) == fechaNacimiento.get(Calendar.MONTH);

	}
}
