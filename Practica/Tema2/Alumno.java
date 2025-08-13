/**
 * @author Matias Solis Schneeberger
 * @version 1.0
 */
public class Alumno {
	private int LU;
	private String nombre;
	private String apellido;
	private double nota1;
	private double nota2;

	/**
	 * @param p_lu
	 * @param p_nombre
	 * @param p_apellido
	 */
	public Alumno(int p_lu, String p_nombre, String p_apellido) {
		setLU(p_lu);
		setNombre(p_nombre);
		setApellido(p_apellido);
	}

	public int getLU() {
		return this.LU;
	}

	/**
	 * @param p_lu
	 */
	public void setLU(int p_lu) {
		this.LU = p_lu;
	}

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * @param p_nombre
	 */
	public void setNombre(String p_nombre) {
		this.nombre = p_nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	/**
	 * @param p_apellido
	 */
	public void setApellido(String p_apellido) {
		this.apellido = p_apellido;
	}

	public double getNota1() {
		return this.nota1;
	}

	/**
	 * @param p_nota1
	 */
	public void setNota1(double p_nota1) {
		this.nota1 = p_nota1;
	}

	public double getNota2() {
		return this.nota2;
	}

	/**
	 * @param p_nota2
	 */
	public void setNota2(double p_nota2) {
		this.nota2 = p_nota2;
	}

	/**
	 * evalua si el alumno está en condiciones de aprobar* @return true | false
	 */
	private boolean aprueba() {
		if (getNota1() >= 6 && getNota2() >= 6 && (promedio() > 7)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Muestra como string la salida de aprueba()* @return "APROBADO" o "DESAPROBADO"
	 */
	private String leyendaAprueba() {
		return aprueba() ? "APROBADO" : "DESAPROBADO";
		/*if (aprueba()) {
			return "APROBADO";
		} else {
			return "DESAPROBADO";
		}*/
	}

	public double promedio() {
		double promedio = (getNota1() + getNota2()) / 2;
		return promedio;
	}

	public String nomYApe() {
		return getNombre() + " " + getApellido();
	}

	public String apeYNom() {
		return getApellido() + " " + getNombre();
	}

	public void mostrar() {
		System.out.println("Nombre y Apellido: " + nomYApe());
		System.out.print("LU: " + getLU());
		System.out.println("Notas: " + getNota1() + " - " + getNota2());
		System.out.println("Promedio: " + promedio() + " - " + leyendaAprueba());
	}
}
