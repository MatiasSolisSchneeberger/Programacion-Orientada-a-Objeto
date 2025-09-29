import java.util.Calendar;

/**
 * Clase que representa a un Alumno universitario.
 * Se guarda su libreta universitaria (LU), nombre, apellido y dos notas.
 * La clase permite calcular el promedio y evaluar si aprueba o no.
 * TP 2 - Act 4
 * TP 5 - Act 1
 *
 * @author Matias Solis Schneeberger
 * @version 1.0
 */
public class Alumno extends Persona {
	private int LU;
	private double nota1;
	private double nota2;

	/**
	 * Constructor del Alumno.
	 * Crea un alumno con LU, nombre y apellido.
	 * Las notas se cargan después con sus setters.
	 *
	 * @param p_lu       número de libreta universitaria
	 * @param p_nombre   nombre del alumno
	 * @param p_apellido apellido del alumno
	 */
	public Alumno(int p_lu,
				  String p_nombre,
				  String p_apellido,
				  int p_nroDNI,
				  Calendar p_fechaNacimiento) {
		super(p_nroDNI,
				p_nombre,
				p_apellido,
				p_fechaNacimiento);
		this.setLU(p_lu);
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
	 *
	 * @param p_lu nueva LU
	 */
	public void setLU(int p_lu) {
		this.LU = p_lu;
	}

	/**
	 * Devuelve la primera nota.
	 *
	 * @return nota1
	 */
	public double getNota1() {
		return this.nota1;
	}

	/**
	 * Cambia la primera nota.
	 *
	 * @param p_nota1 nueva nota1
	 */
	public void setNota1(double p_nota1) {
		this.nota1 = p_nota1;
	}

	/**
	 * Devuelve la segunda nota.
	 *
	 * @return nota2
	 */
	public double getNota2() {
		return this.nota2;
	}

	/**
	 * Cambia la segunda nota.
	 *
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
		return getNota1() >= 6 && getNota2() >= 6 && (promedio() > 7);
	}

	/**
	 * Devuelve un texto según si aprueba o no.
	 *
	 * @return "APROBADO" | "DESAPROBADO"
	 */
	private String leyendaAprueba() {
		return aprueba() ? "APROBADO" : "DESAPROBADO";
	}

	/**
	 * Calcula el promedio de las dos notas.
	 *
	 * @return promedio de nota1 y nota2
	 */
	public double promedio() {
		return (getNota1() + getNota2()) / 2;
	}



	/**
	 * Muestra por pantalla toda la información del alumno:
	 * - Nombre y Apellido
	 * - LU
	 * - Notas
	 * - Promedio y si aprueba o no
	 */
	public void mostrar() {
		super.mostrar();
		System.out.print("LU: " + getLU());
		System.out.println("\tNotas: " + getNota1() + " - " + getNota2());
		System.out.println("Promedio: " + promedio() + " - " + leyendaAprueba());
	}
}
