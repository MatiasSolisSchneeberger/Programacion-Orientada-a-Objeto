/**
 * Representa una persona con datos básicos y métodos para obtener su información.
 * Incluye cálculo de edad considerando solo la diferencia de años.
 *
 * @author Matias Solis Scheeberger
 * @version 1.0
 */
import java.util.*;

public class Persona {
	Calendar fechaHoy = new GregorianCalendar();
	private final int anioActual = fechaHoy.get(Calendar.YEAR);
	private int nroDNI;
	private String nombre;
	private String apellido;
	private int anioNacimiento;

	/**
	 * Construye una nueva persona.* @param p_nroDNI         número de documento de identidad
	 *
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
	 * Establece el número de documento.* @param p_nroDNI número de documento
	 */
	private void setDNI(int p_nroDNI) {
		nroDNI = p_nroDNI;
	}

	/**
	 * Establece el nombre.* @param p_nombre nombre de la persona
	 */
	private void setNombre(String p_nombre) {
		nombre = p_nombre;
	}

	/**
	 * Establece el apellido.* @param p_apellido apellido de la persona
	 */
	private void setApellido(String p_apellido) {
		apellido = p_apellido;
	}

	/**
	 * Establece el año de nacimiento.* @param p_anioNacimiento año de nacimiento
	 */
	private void setAnioNacimiento(int p_anioNacimiento) {
		anioNacimiento = p_anioNacimiento;
	}

	/**
	 * Obtiene el número de documento.* @return número de documento
	 */
	public int getDNI() {
		return nroDNI;
	}

	/**
	 * Obtiene el nombre.* @return nombre de la persona
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Obtiene el apellido.* @return apellido de la persona
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * Obtiene el año de nacimiento.* @return año de nacimiento
	 */
	public int getAnioNacimiento() {
		return anioNacimiento;
	}

	/**
	 * Calcula la edad en años cumplidos.* @return edad actual
	 */
	public int edad() {
		return anioActual - getAnioNacimiento();
	}

	/**
	 * Devuelve el nombre y apellido en formato "Nombre Apellido".* @return nombre y apellido concatenados
	 */
	public String nomYApe() {
		return getNombre() + " " + getApellido();
	}

	/**
	 * Devuelve el apellido y nombre en formato "Apellido Nombre".* @return apellido y nombre concatenados
	 */
	public String apeYNom() {
		return getApellido() + " " + getNombre();
	}

	/**
	 * Muestra por pantalla la información de la persona.
	 */
	public void mostrar() {
		System.out.println("Nombre y Apellido: " + nomYApe());
		System.out.print("DNI: " + getDNI() + "\t");
		System.out.println("Edad: " + edad());
	}
}
