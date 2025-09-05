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
	 * Constructor de la clase Empleado.
	 *
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
		setAnioIngreso(p_anioIngreso);
	}

	/**
	 * Devuelve el CUIL del empleado.
	 *
	 * @return CUIL
	 */
	public long getCuil() {
		return cuil;
	}

	/**
	 * Cambia el CUIL del empleado.
	 *
	 * @param p_cuil nuevo CUIL
	 */
	public void setCuil(long p_cuil) {
		cuil = p_cuil;
	}

	/**
	 * Devuelve el apellido del empleado.
	 *
	 * @return apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * Cambia el apellido del empleado.
	 *
	 * @param p_apellido nuevo apellido
	 */
	public void setApellido(String p_apellido) {
		apellido = p_apellido;
	}

	/**
	 * Devuelve el nombre del empleado.
	 *
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Cambia el nombre del empleado.
	 *
	 * @param p_nombre nuevo nombre
	 */
	public void setNombre(String p_nombre) {
		nombre = p_nombre;
	}

	/**
	 * Devuelve el sueldo básico del empleado.
	 *
	 * @return sueldo básico
	 */
	public double getSueldoBasico() {
		return sueldoBasico;
	}

	/**
	 * Cambia el sueldo básico del empleado.
	 *
	 * @param p_sueldoBasico nuevo sueldo básico
	 */
	public void setSueldoBasico(double p_sueldoBasico) {
		sueldoBasico = p_sueldoBasico;
	}

	/**
	 * Devuelve el año de ingreso del empleado.
	 *
	 * @return año de ingreso
	 */
	public int getAnioIngreso() {
		return anioIngreso;
	}

	/**
	 * Cambia el año de ingreso del empleado.
	 *
	 * @param p_anioIngreso nuevo año de ingreso
	 */
	public void setAnioIngreso(int p_anioIngreso) {
		anioIngreso = p_anioIngreso;
	}

	/**
	 * Calcula la cantidad de años que el empleado lleva en la empresa.
	 *
	 * @return antigüedad en años
	 */
	public int antiguedad() {
		return anioActual - getAnioIngreso();
	}

	/**
	 * Calcula el descuento aplicado al sueldo.
	 * El descuento es el 2% del sueldo básico más un monto fijo de $1500.
	 *
	 * @return descuento total
	 */
	private double descuento() {
		double descuento = getSueldoBasico() * 0.02 + 1500;
		return descuento;
	}

	/**
	 * Calcula el adicional al sueldo según la antigüedad:
	 * - Menos de 2 años: 2%
	 * - Entre 2 y 9 años: 4%
	 * - 10 años o más: 6%
	 *
	 * @return adicional según antigüedad
	 */
	private double adicional() {
		double adicional;
		if (antiguedad() < 2) {
			adicional = getSueldoBasico() * 1.02;
		} else if (antiguedad() < 10) {
			adicional = getSueldoBasico() * 1.04;
		} else {
			adicional = getSueldoBasico() * 1.06;
		}
		return adicional;
	}

	/**
	 * Devuelve el nombre completo en el formato: "Nombre Apellido".
	 *
	 * @return nombre y apellido
	 */
	public String nomYApe() {
		return getNombre() + " " + getApellido();
	}

	/**
	 * Devuelve el nombre completo en el formato: "Apellido Nombre".
	 *
	 * @return apellido y nombre
	 */
	public String apeYNom() {
		return getApellido() + " " + getNombre();
	}

	/**
	 * Calcula el sueldo neto del empleado.
	 * sueldo básico + adicional - descuento.
	 *
	 * @return sueldo neto
	 */
	public double sueldoNeto() {
		return getSueldoBasico() + adicional() - descuento();
	}

	/**
	 * Muestra por consola los datos principales del empleado:
	 * nombre, CUIL, antigüedad y sueldo neto.
	 */
	public void mostrar() {
		System.out.println("Nombre y Apellido: " + nomYApe());
		System.out.print("CUIL: " + getCuil());
		System.out.println("\tAntigüedad: " + antiguedad() + " años de servicio");
		System.out.println("Sueldo Neto: $" + sueldoNeto());
	}

	/**
	 * Muestra los datos del empleado en una sola línea:
	 * CUIL, nombre completo y sueldo neto.
	 */
	public void mostrarLinea() {
		System.out.print(getCuil() + " ");
		System.out.print(nomYApe());
		System.out.print(".........");
		System.out.println(sueldoNeto());
	}
}