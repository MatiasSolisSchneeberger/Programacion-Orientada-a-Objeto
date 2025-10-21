/**
 * TP 2 - Act 4 | TP 4 - Act 5
 * Clase que representa a un Alumno universitario.
 * Se guarda su libreta universitaria (LU), nombre, apellido y dos notas.
 * La clase permite calcular el promedio y evaluar si aprueba o no.
 * @author Matias Solis Schneeberger
 * @version 1.0.1
 */
public class Alumno {
	private int LU;
	private String nombre;
	private String apellido;
	private double nota1;
	private double nota2;

	/**
	 * Constructor del Alumno.
	 * Crea un alumno con LU, nombre y apellido.
	 * Las notas se cargan después con sus setters.
	 *
	 * @param p_lu número de libreta universitaria
	 * @param p_nombre nombre del alumno
	 * @param p_apellido apellido del alumno
	 */
	public Alumno(int p_lu, String p_nombre, String p_apellido) {
		this.setLU(p_lu);
		this.setNombre(p_nombre);
		this.setApellido(p_apellido);
	}

	/**
	 * Devuelve el número de libreta universitaria.
	 *
	 * @return LU
	 */
	public int getLU() {
		return this.LU;
	}

	/**
	 * Cambia el número de libreta universitaria.
	 * @param p_lu nueva LU
	 */
	private void setLU(int p_lu) {
		this.LU = p_lu;
	}

	/**
	 * Devuelve el nombre del alumno.
	 * @return nombre
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * Cambia el nombre del alumno.
	 * @param p_nombre nuevo nombre
	 */
	private void setNombre(String p_nombre) {
		this.nombre = p_nombre;
	}

	/**
	 * Devuelve el apellido del alumno.
	 * @return apellido
	 */
	public String getApellido() {
		return this.apellido;
	}

	/**
	 * Cambia el apellido del alumno.
	 * @param p_apellido nuevo apellido
	 */
	private void setApellido(String p_apellido) {
		this.apellido = p_apellido;
	}

	/**
	 * Devuelve la primera nota.
	 * @return nota1
	 */
	public double getNota1() {
		return this.nota1;
	}

	/**
	 * Cambia la primera nota.
	 * @param p_nota1 nueva nota1
	 */
	public void setNota1(double p_nota1) {
		this.nota1 = p_nota1;
	}

	/**
	 * Devuelve la segunda nota.
	 * @return nota2
	 */
	public double getNota2() {
		return this.nota2;
	}

	/**
	 * Cambia la segunda nota.
	 * @param p_nota2 nueva nota2
	 */
	public void setNota2(double p_nota2) {
		this.nota2 = p_nota2;
	}

	/**
	 * Evalúa si el alumno aprueba.
	 * Condiciones:
	 * - Las dos notas deben ser 6 o más
	 * - El promedio debe ser mayor a 7
	 *
	 * @return true | false
	 */
	private boolean aprueba() {
		return this.getNota1() >= 6 && this.getNota2() >= 6 && (promedio() > 7);
	}

	/**
	 * Devuelve un texto según si aprueba o no.
	 *
	 * @return "APROBADO" | "DESAPROBADO"
	 */
	private String leyendaAprueba() {
		return this.aprueba() ? "APROBADO" : "DESAPROBADO";
	}

	/**
	 * Calcula el promedio de las dos notas.
	 * @return promedio de nota1 y nota2
	 */
	public double promedio() {
		return (this.getNota1() + this.getNota2()) / 2;
	}

	/**
	 * Devuelve el nombre completo en formato "Nombre Apellido".
	 * @return nombre y apellido
	 */
	public String nomYApe() {
		return this.getNombre() + " " + this.getApellido();
	}

	/**
	 * Devuelve el nombre completo en formato "Apellido Nombre".
	 * @return apellido y nombre
	 */
	public String apeYNom() {
		return this.getApellido() + " " + this.getNombre();
	}

	/**
	 * Muestra por pantalla toda la información del alumno:
	 * - Nombre y Apellido
	 * - LU
	 * - Notas
	 * - Promedio y si aprueba o no
	 */
	public void mostrar() {
		System.out.println("Nombre y Apellido: " + this.nomYApe());
		System.out.print("LU: " + this.getLU());
		System.out.println("\tNotas: " + this.getNota1() + " - " + this.getNota2());
		System.out.println("Promedio: " + this.promedio() + " - " + this.leyendaAprueba());
	}
}
