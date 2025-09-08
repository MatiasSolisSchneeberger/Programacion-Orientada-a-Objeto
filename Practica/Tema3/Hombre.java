/**
 * TP 3 - Act 10
 * Clase que representa a un Hombre, con sus datos personales y
 * su relación de matrimonio/divorcio con una Mujer.
 *
 * @author Matias Solis Scheeberger
 * @version 1.0
 */
public class Hombre {
	private String nombre;
	private String apellido;
	private int edad;
	private String estadoCivil;
	private Mujer esposa;

	/**
	 * Constructor de Hombre soltero.
	 *
	 * @param p_nombre   nombre del hombre
	 * @param p_apellido apellido del hombre
	 * @param p_edad     edad del hombre
	 */
	Hombre(String p_nombre, String p_apellido, int p_edad) {
		this.setNombre(p_nombre);
		this.setApellido(p_apellido);
		this.setEdad(p_edad);
		this.setEstadoCivil("Soltero");
		this.setEsposa(null);
	}

	/**
	 * Constructor de Hombre casado.
	 *
	 * @param p_nombre   nombre del hombre
	 * @param p_apellido apellido del hombre
	 * @param p_edad     edad del hombre
	 * @param p_esposa   esposa del hombre
	 */
	Hombre(String p_nombre, String p_apellido, int p_edad, Mujer p_esposa) {
		this.setNombre(p_nombre);
		this.setApellido(p_apellido);
		this.setEdad(p_edad);
		this.setEstadoCivil("Casado");
		this.setEsposa(p_esposa);
	}


	// ----- Setters y Getters  -----

	/**
	 * Establece el nombre.
	 *
	 * @param p_nombre nombre del hombre
	 */
	private void setNombre(String p_nombre) {
		nombre = p_nombre;
	}

	/**
	 * Devuelve el nombre.
	 *
	 * @return nombre del hombre
	 */
	public String getNombre() {
		return this.nombre;
	}


	/**
	 * Establece el apellido.
	 *
	 * @param p_apellido apellido del hombre
	 */
	private void setApellido(String p_apellido) {
		apellido = p_apellido;
	}

	/**
	 * Devuelve el apellido.
	 *
	 * @return apellido del hombre
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
	 * @param p_estadoCivil estado civil del hombre
	 *
	 */
	private void setEstadoCivil(String p_estadoCivil) {
		this.estadoCivil = p_estadoCivil;
	}

	/**
	 * Devuelve el estado civil.
	 *
	 * @return estado civil del hombre
	 */
	public String getEstadoCivil() {
		return this.estadoCivil;
	}


	/**
	 * Establece la esposa del hombre.
	 *
	 * @param p_esposa objeto Mujer si está casado, null si no
	 */
	private void setEsposa(Mujer p_esposa) {
		this.esposa = p_esposa;
	}

	/**
	 * Devuelve la esposa del hombre.
	 *
	 * @return objeto Mujer si está casado, null si no
	 */
	public Mujer getEsposa() {
		return this.esposa;
	}


	// ------------------------------

	// acciones

	/**
	 * Casa al hombre con una mujer, actualizando a ambos.
	 *
	 * @param p_mujer mujer con la que se casa
	 */
	public void casarseCon(Mujer p_mujer) {
		if (this.getEsposa() == null) {
			this.setEsposa(p_mujer);
			this.setEstadoCivil("Casada");
		}
	}

	/**
	 * Divorcia al hombre, actualizando a ambos.
	 */
	public void divorcio() {
		if (this.getEsposa() != null) {
			this.setEsposa(null);
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
		return (getNombre() + " " + getApellido() + " de " +
				getEdad() + " años");
	}

	/**
	 * Muestra el estado civil en formato:
	 * "Nombre Apellido de X años - EstadoCivil".
	 */
	public void mostrarEstadoCivil() {
		System.out.println(getNombre() + " " + getApellido() +
				" - " + getEstadoCivil());
	}

	/**
	 * Muestra con quién está casado el hombre.
	 */
	public void casadoCon() {
		if (getEsposa() != null) {
			System.out.println(this.datos() +
					" está casado con " +
					this.getEsposa().getNombre() +
					" de " + this.getEsposa().getEdad() + " años");
		} else {
			System.out.println(this.datos() + " no está casado");
		}

	}

}
