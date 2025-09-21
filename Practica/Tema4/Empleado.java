import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * TP 3 - Act 11 | TP 4 - Act 3 | TP 4 - Act 4
 * La clase Empleado representa a un empleado con atributos como CUIL,
 * nombre, apellido, sueldo básico y fecha de ingreso.
 * Proporciona métodos para calcular la antigüedad, sueldo neto,
 * y mostrar información relevante del empleado.
 *
 * @author Matias Solis Schneeberger
 * @version 1.1
 */
public class Empleado {
	private final Calendar calendario = new GregorianCalendar();
	private final int anioActual = calendario.get(Calendar.YEAR);


	private long cuil;
	private String apellido;
	private String nombre;
	private double sueldoBasico;
	private Calendar fechaIngreso;

	/**
	 * Constructor de la clase Empleado.
	 *
	 * @param p_cuil         cuil del empleado
	 * @param p_apellido     apellido del empleado
	 * @param p_nombre       nombre del empleado
	 * @param p_sueldoBasico sueldo básico del empleado
	 * @param p_anioIngreso  año de ingreso del empleado
	 */
	public Empleado(long p_cuil, String p_apellido,
					String p_nombre, double p_sueldoBasico,
					int p_anioIngreso) {
		setCuil(p_cuil);
		setApellido(p_apellido);
		setNombre(p_nombre);
		setSueldoBasico(p_sueldoBasico);
		setAnioIngreso(p_anioIngreso);
	}

	/**
	 * Constructor de la clase Empleado.
	 *
	 * @param p_cuil         cuil del empleado
	 * @param p_apellido     apellido del empleado
	 * @param p_nombre       nombre del empleado
	 * @param p_sueldoBasico sueldo básico del empleado
	 * @param p_fechaIngreso fecha de ingreso del empleado
	 */
	public Empleado(long p_cuil, String p_apellido,
					String p_nombre, double p_sueldoBasico,
					Calendar p_fechaIngreso) {
		setCuil(p_cuil);
		setApellido(p_apellido);
		setNombre(p_nombre);
		setSueldoBasico(p_sueldoBasico);
		setFechaIngreso(p_fechaIngreso);
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
	private void setCuil(long p_cuil) {
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
	private void setApellido(String p_apellido) {
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
	private void setNombre(String p_nombre) {
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
	private void setSueldoBasico(double p_sueldoBasico) {
		sueldoBasico = p_sueldoBasico;
	}

	/**
	 * Devuelve el año de ingreso del empleado.
	 *
	 * @return año de ingreso
	 */
	public int getAnioIngreso() {
		return getFechaIngreso().get(Calendar.YEAR);
	}

	/**
	 * Cambia el año de ingreso del empleado.
	 *
	 * @param p_anioIngreso nuevo año de ingreso
	 */
	private void setAnioIngreso(int p_anioIngreso) {
		Calendar fechaIngreso = new GregorianCalendar();
		fechaIngreso.set(Calendar.YEAR, p_anioIngreso);
		fechaIngreso.set(Calendar.MONTH, Calendar.JANUARY);
		fechaIngreso.set(Calendar.DAY_OF_MONTH, 1);
		setFechaIngreso(fechaIngreso);
	}

	/**
	 * Obtiene la fecha de ingreso del empleado.
	 *
	 * @return fecha de ingreso
	 *
	 */
	public Calendar getFechaIngreso() {
		return fechaIngreso;
	}

	/**
	 * Cambia la fecha de ingreso del empleado.
	 *
	 * @param fechaIngreso nueva fecha de ingreso
	 *
	 */
	private void setFechaIngreso(Calendar fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
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
		return getSueldoBasico() * 0.02 + 1500;
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
			adicional = getSueldoBasico() * 0.02;
		} else if (antiguedad() < 10) {
			adicional = getSueldoBasico() * 0.04;
		} else {
			adicional = getSueldoBasico() * 0.06;
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
	 * Sueldo básico + adicional - descuento.
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
	 *
	 * @return línea con datos resumidos
	 */
	public String mostrarLinea() {
		return getCuil() + " " +
				nomYApe() +
				"\t\t\t\t" +
				sueldoNeto();
	}


	// nuevo:

	/**
	 * Evalua si hoy es el aniversario de ingreso del empleado.
	 *
	 * @return true si es el aniversario, false en caso contrario.
	 */
	public boolean esAniversario() {
		Calendar hoy = new GregorianCalendar();
		return (hoy.get(Calendar.DAY_OF_YEAR) == getFechaIngreso().get(Calendar.DAY_OF_YEAR));
	}
}