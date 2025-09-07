
/**
 * TP 3 - Act 6
 * Representa una escuela con nombre, domicilio y director.
 * Permite imprimir recibos de sueldo de los docentes asociados.
 *
 * @author Matias Solis Schneeberger
 * @version 1.0
 */
public class Escuela {
	private String nombre;
	private String domicilio;
	private String director;

	/**
	 * Constructor de la clase Escuela.
	 *
	 * @param p_nombre    nombre de la escuela
	 * @param p_domicilio domicilio de la escuela
	 * @param p_director  nombre del director
	 */
	Escuela(String p_nombre, String p_domicilio, String p_director) {
		this.setNombre(p_nombre);
		this.setDomicilio(p_domicilio);
		this.setDirector(p_director);
	}


	/**
	 * Devuelve el nombre de la escuela.
	 *
	 * @return el nombre de la escuela
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * Establece el p_nombre de la escuela.
	 *
	 * @param p_nombre el nuevo p_nombre de la escuela
	 */
	private void setNombre(String p_nombre) {
		this.nombre = p_nombre;
	}

	/**
	 * Devuelve el domicilio de la escuela.
	 *
	 * @return el domicilio de la escuela
	 */
	public String getDomicilio() {
		return this.domicilio;
	}

	/**
	 * Establece el domicilio de la escuela.
	 *
	 * @param p_domicilio el nuevo domicilio de la escuela
	 */
	private void setDomicilio(String p_domicilio) {
		this.domicilio = p_domicilio;
	}

	/**
	 * Devuelve el nombre del director de la escuela.
	 *
	 * @return el nombre del director de la escuela
	 */
	public String getDirector() {
		return this.director;
	}

	/**
	 * Establece el nombre del director de la escuela.
	 *
	 * @param p_director el nuevo nombre del director de la escuela
	 */
	private void setDirector(String p_director) {
		this.director = p_director;
	}

	/**
	 * Muestra por consola un recibo de sueldo para el docente proporcionado.
	 */
	public void imprimirRecibo(Docente p_docente) {
		System.out.println("Escuela: " + this.getNombre() +
				"\t Domicilio: " + this.getDomicilio() +
				"\t Director: " + this.getDirector());

		System.out.println("Docente: .................... $" + p_docente.getNombre());
		System.out.println("Sueldo: ..................... $" + p_docente.calcularSueldo());
		System.out.println("Sueldo Básico: .............. $" + p_docente.getSueldoBasico());
		System.out.println("Asignacion familiar: ........ $" + p_docente.getAsignacionFamiliar());

	}
}
