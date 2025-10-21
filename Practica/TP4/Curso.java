import java.util.HashMap;

/**
 * TP 4 - Act 5
 * Esta clase representa un curso que puede tener varios alumnos inscriptos.
 * Permite inscribir y quitar alumnos, buscar un alumno por su LU,
 * verificar si un alumno está inscripto, y mostrar información sobre los alumnos.
 * Utiliza un HashMap para almacenar los alumnos, donde la clave es el LU del alumno
 * y el valor es el objeto Alumno correspondiente.
 *
 * @author Matias Solis Schneeberger
 * @version 1.0
 */
public class Curso {
	private String nombre;
	private HashMap<Integer, Alumno> alumnos;

	// Constructores

	/**
	 * Crea un nuevo curso con el nombre dado y sin alumnos inscriptos.
	 *
	 * @param p_nombre Nombre del curso.
	 */
	Curso(String p_nombre) {
		this.setNombre(p_nombre);
		this.setAlumnos(new HashMap<>());
	}

	/**
	 * Crea un nuevo curso con el nombre dado y los alumnos inscriptos proporcionados.
	 *
	 * @param p_nombre  Nombre del curso.
	 * @param p_alumnos HashMap de alumnos inscriptos, donde la clave es el LU del alumno.
	 */
	Curso(String p_nombre, HashMap<Integer, Alumno> p_alumnos) {
		this.setNombre(p_nombre);
		this.setAlumnos(p_alumnos);
	}

	// Getters y Setters

	/**
	 * Obtiene el nombre del curso.
	 *
	 * @return Nombre del curso.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre del curso.
	 *
	 * @param nombre Nombre del curso.
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene el HashMap de alumnos inscriptos en el curso.
	 *
	 * @return HashMap de alumnos, donde la clave es el LU del alumno.
	 */
	public HashMap<Integer, Alumno> getAlumnos() {
		return alumnos;
	}

	/**
	 * Establece el HashMap de alumnos inscriptos en el curso.
	 *
	 * @param alumnos HashMap de alumnos, donde la clave es el LU del alumno.
	 */
	private void setAlumnos(HashMap<Integer, Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	// Metodos

	/**
	 * Inscribe un alumno en el curso si no está ya inscripto.
	 *
	 * @param p_alumno Alumno a inscribir.
	 * @return true si elalumno fue inscripto exitosamente, false si ya estaba inscripto.
	 */
	public boolean inscribirAlumno(Alumno p_alumno) {
		if (this.getAlumnos().containsKey(p_alumno.getLU())) {
			return false;
		} else {
			this.getAlumnos().put(p_alumno.getLU(), p_alumno);
			return true;
		}
	}

	/**
	 * Quita un alumno del curso por su LU si está inscripto.
	 *
	 * @param p_LU LU del alumno a quitar.
	 * @return true si el alumno fue quitado exitosamente, false si no estaba inscripto.
	 */
	public boolean quitarAlumno(int p_LU) {
		if (this.getAlumnos().containsKey(p_LU)) {
			this.getAlumnos().remove(p_LU);
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Devuelve la cantidad de alumnos inscriptos en el curso.
	 *
	 * @return Cantidad de alumnos inscriptos.
	 */
	public int cantidadDeAlumnos() {
		return this.getAlumnos().size();
	}

	//sobrecarga del metodo

	/**
	 * Verifica si un alumno con el LU dado está inscripto en el curso.
	 *
	 * @param p_LU LU del alumno a verificar.
	 * @return true si el alumno está inscripto, false en caso contrario.
	 */
	public boolean estaInscripto(int p_LU) {
		return this.getAlumnos().containsKey(p_LU);
	}

	/**
	 * Verifica si un alumno dado está inscripto en el curso.
	 *
	 * @param p_alumno Alumno a verificar.
	 * @return true si el alumno está inscripto, false en caso contrario.
	 */
	public boolean estaInscripto(Alumno p_alumno) {
		return this.getAlumnos().containsKey(p_alumno.getLU());
	}

	/**
	 * Busca y devuelve un alumno por su LU.
	 *
	 * @param p_LU LU del alumno a buscar.
	 * @return Objeto Alumno si se encuentra, null si no está inscripto.
	 */
	public Alumno buscarAlumno(int p_LU) {
		return this.getAlumnos().get(p_LU);
	}

	/**
	 * Imprime el promedio de un alumno por su LU.
	 *
	 * @param p_LU LU del alumno cuyo promedio se desea imprimir.
	 */
	public void imprimirPromedioDelAlumno(int p_LU) {
		Alumno alumno = this.buscarAlumno(p_LU);
		if (alumno != null) {
			alumno.mostrar();
		} else {
			System.out.println("El alumno con LU " + p_LU +
					" no está inscripto en el curso.");
		}
	}

	/**
	 * Muestra por pantalla la lista de alumnos inscriptos en el curso,
	 * incluyendo su LU y nombre completo.
	 */
	public void mostrarInscriptos() {
		System.out.println("-- Alumnos inscriptos acualmente: " +
				this.cantidadDeAlumnos());
		for (Alumno alumno : this.getAlumnos().values()) {
			System.out.println(alumno.getLU() + " " + alumno.nomYApe());
		}
	}

}
