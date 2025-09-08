/**
 * TP 3 - Act 10
 * Clase que representa a una Mujer, con sus datos personales y
 * su relación de matrimonio/divorcio con un Hombre.
 *
 * @author Matias Solis Scheeberger
 * @version 1.0
 */
public class Mujer {
	private String nombre;
	private String apellido;
	private int edad;
	private String estadoCivil;
	private Hombre esposo;

	/**
	 * Constructor de Mujer soltera.
	 *
	 * @param p_nombre   nombre de la mujer
	 * @param p_apellido apellido de la mujer
	 * @param p_edad     edad de la mujer
	 */
	Mujer(String p_nombre, String p_apellido, int p_edad) {
		this.setNombre(p_nombre);
		this.setApellido(p_apellido);
		this.setEdad(p_edad);
		this.setEstadoCivil("Soltera");
		this.setEsposo(null);
	}

	/**
	 * Constructor de Mujer casada.
	 *
	 * @param p_nombre   nombre de la mujer
	 * @param p_apellido apellido de la mujer
	 * @param p_edad     edad de la mujer
	 * @param p_esposa   esposo de la mujer
	 */
	Mujer(String p_nombre, String p_apellido, int p_edad, Hombre p_esposa) {
		this.setNombre(p_nombre);
		this.setApellido(p_apellido);
		this.setEdad(p_edad);
		this.setEstadoCivil("Casada");
		this.setEsposo(p_esposa);
	}


	// ----- Setters y Getters  -----

	/**
	 * Establece el nombre.
	 *
	 * @param p_nombre nombre de la mujer
	 */
	private void setNombre(String p_nombre) {
		nombre = p_nombre;
	}

	/**
	 * Devuelve el nombre.
	 *
	 * @return nombre de la mujer
	 */
	public String getNombre() {
		return this.nombre;
	}


	/**
	 * Establece el apellido.
	 *
	 * @param p_apellido apellido de la mujer
	 */
	private void setApellido(String p_apellido) {
		apellido = p_apellido;
	}

	/**
	 * Devuelve el apellido.
	 *
	 * @return apellido de la mujer
	 */
	public String getApellido() {
		return this.apellido;
	}


	/**
	 * Establece el año de nacimiento.
	 *
	 * @param p_edad año de nacimiento
	 */
	private void setEdad(int p_edad) {
		edad = p_edad;
	}

	/**
	 * Devuelve el año de nacimiento.
	 *
	 * @return año de nacimiento
	 */
	public int getEdad() {
		return this.edad;
	}


	/**
	 * Establece el estado civil.
	 *
	 * @param p_estadoCivil estado civil de la mujer
	 *
	 */
	private void setEstadoCivil(String p_estadoCivil) {
		this.estadoCivil = p_estadoCivil;
	}

	/**
	 * Devuelve el estado civil.
	 *
	 * @return estado civil de la mujer
	 */
	public String getEstadoCivil() {
		return this.estadoCivil;
	}


	/**
	 * Establece la esposo de la mujer.
	 *
	 * @param p_esposa objeto Hombre si está casada, null si no
	 */
	private void setEsposo(Hombre p_esposa) {
		this.esposo = p_esposa;
	}

	/**
	 * Devuelve la esposo de la mujer.
	 *
	 * @return objeto Hombre si está casada, null si no
	 */
	public Hombre getEsposo() {
		return this.esposo;
	}


	// ------------------------------

	// acciones

	/**
	 * Casa al hombre con una mujer, actualizando a ambos.
	 *
	 * @param p_hombre mujer con la que se casa
	 */
	public void casarseCon(Hombre p_hombre) {
		if (this.getEsposo() == null) {
			this.setEsposo(p_hombre);
			this.setEstadoCivil("Casada");
		}
	}

	/**
	 * Divorcia al hombre, actualizando a ambos.
	 */
	public void divorcio() {
		if (this.getEsposo() != null) {
			this.setEsposo(null);
			this.setEstadoCivil("Divorciado");
		}
	}


	// mostrar

	/**
	 * Retorna los datos en formato:
	 * "Nombre Apellido de X años".
	 *
	 * @return cadena con los datos
	 */
	public String datos() {
		return (getNombre() + " " + getApellido() + " de " + getEdad() + " años");
	}

	/**
	 * Muestra el estado civil en formato:
	 * "Nombre Apellido de X años - EstadoCivil".
	 */
	public void mostrarEstadoCivil() {
		System.out.println(getNombre() + " " + getApellido() + " - " + getEstadoCivil());
	}

	/**
	 * Muestra con quién está casada el hombre.
	 */
	public void casadaCon() {

		if (this.getEsposo() != null) {
			System.out.println(this.datos() +
					" está casado con " +
					this.getEsposo().getNombre() +
					" de " + this.getEsposo().getEdad() + " años");
		} else {
			System.out.println(this.datos() + " no está casado");
		}
	}

}
