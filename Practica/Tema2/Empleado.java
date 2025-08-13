import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * TP 2 - Act 5
 *
 * @author Matias Solis Schneeberger
 * @version 1.0
 */
public class Empleado {
	private long cuil;
	private String apellido;
	private String nombre;
	private double sueldoBasico;
	private int anioIngreso;
	Calendar calendario = new GregorianCalendar();
	int anioActual = calendario.get(Calendar.YEAR);

	/**
	 * @param p_cuil
	 * @param p_apellido
	 * @param p_nombre
	 * @param p_sueldoBasico
	 * @param p_anioIngreso
	 */
	public Empleado(long p_cuil, String p_apellido, String p_nombre, double p_sueldoBasico, int p_anioIngreso) {
		setCuil(p_cuil);
		setApellido(p_apellido);
		setNombre(p_nombre);
		setSueldoBasico(p_sueldoBasico);
	}

	public long getCuil() {
		return cuil;
	}

	public void setCuil(long p_cuil) {
		cuil = p_cuil;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String p_apellido) {
		apellido = p_apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String p_nombre) {
		nombre = p_nombre;
	}

	public double getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(double p_sueldoBasico) {
		sueldoBasico = p_sueldoBasico;
	}

	public int getAnioIngreso() {
		return anioIngreso;
	}

	public void setAnioIngreso(int p_anioIngreso) {
		anioIngreso = p_anioIngreso;
	}

	public int antiguedad() {
		return anioActual - getAnioIngreso();
	}

	private double descuento() {
		double descuento = getSueldoBasico() * 0.02 + 1500;
		return descuento;
	}

	private double adicional() {
		double adicional;
		if (antiguedad() < 2) {
			adicional = getSueldoBasico() * 1.02;
		} else if (antiguedad() >= 2 && antiguedad() < 10) {
			adicional = getSueldoBasico() * 1.04;
		} else {
			adicional = getSueldoBasico() * 1.06;
		}
		return adicional;
	}

	public String nomYApe() {
		return getNombre() + " " + getApellido();
	}

	public String apeYNom() {
		return getApellido() + " " + getNombre();
	}

	public double sueldoNeto() {
		return getSueldoBasico() - descuento() + adicional();
	}

	public void mostrar() {
		System.out.println("Nombre y Apellido: " + nomYApe());
		System.out.print("CUIL: " + getCuil());
		System.out.println("\tAntigüedad: " + antiguedad());
		System.out.println("Sueldo Neto: " + sueldoNeto());
	}

	public void mostrarLinea() {
		System.out.print(getCuil() + " ");
		System.out.print(nomYApe());
		System.out.print(".........");
		System.out.println(sueldoNeto());
	}
}