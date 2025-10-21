/**
 * TP 3 - Act 8 |TP 4 - Act 3 | TP 4 - Act 4
 * Representa una localidad con su nombre y provincia.
 * Permite acceder y modificar estos datos, y mostrarlos en formato texto.
 *
 * @author Matias Solis Schneeberger
 * @version 1.0.1
 */
public class Localidad {
	private String nombre;
	private String provincia;

	/**
	 * Crea una nueva instancia de Localidad.
	 *
	 * @param p_nombre    Nombre de la localidad.
	 * @param p_provincia Nombre de la provincia.
	 */
	Localidad(String p_nombre, String p_provincia) {
		this.setNombre(p_nombre);
		this.setProvincia(p_provincia);
	}

	/**
	 * Obtiene el nombre de la localidad.
	 *
	 * @return Nombre de la localidad.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre de la localidad.
	 *
	 * @param nombre Nombre de la localidad.
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene el nombre de la provincia.
	 *
	 * @return Nombre de la provincia.
	 */
	public String getProvincia() {
		return provincia;
	}

	/**
	 * Establece el nombre de la provincia.
	 *
	 * @param provincia Nombre de la provincia.
	 */
	private void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	/**
	 * Devuelve una representación en texto de la localidad y su provincia.
	 *
	 * @return Cadena con el nombre de la localidad y la provincia.
	 */
	public String mostrar() {
		return "Localidad: " + this.getNombre() + "\tProvincia: " + this.getProvincia();
	}
}
