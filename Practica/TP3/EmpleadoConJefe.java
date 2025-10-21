import java.util.Calendar;

/**
 * TP 3 - Act 11
 * Representa a un empleado que puede tener un jefe.
 * Permite calcular antigüedad, sueldo neto, mostrar datos y conocer la jerarquía.
 *
 * @author Matias Solis Schneeberger
 * @version 2.0
 */
public class EmpleadoConJefe {
	private long cuil;
	private String apellido;
	private String nombre;
	private double sueldoBasico;
	private Calendar fechaIngreso;
	private EmpleadoConJefe jefe;

	/**
	 * Constructor que inicializa todos los datos del empleado, incluyendo el jefe.
	 *
	 * @param p_cuil         CUIL del empleado
	 * @param p_apellido     Apellido del empleado
	 * @param p_nombre       Nombre del empleado
	 * @param p_sueldoBasico Sueldo básico del empleado
	 * @param p_fechaIngreso Fecha de ingreso del empleado
	 * @param p_jefe         Jefe del empleado
	 */
	EmpleadoConJefe(long p_cuil,
					String p_apellido,
					String p_nombre,
					double p_sueldoBasico,
					Calendar p_fechaIngreso,
					EmpleadoConJefe p_jefe) {
		this.setCuil(p_cuil);
		this.setApellido(p_apellido);
		this.setNombre(p_nombre);
		this.setSueldoBasico(p_sueldoBasico);
		this.setFechaIngreso(p_fechaIngreso);
		this.setJefe(p_jefe);
	}

	/**
	 * Constructor que inicializa los datos del empleado sin jefe.
	 *
	 * @param p_cuil         CUIL del empleado
	 * @param p_apellido     Apellido del empleado
	 * @param p_nombre       Nombre del empleado
	 * @param p_sueldoBasico Sueldo básico del empleado
	 * @param p_fechaIngreso Fecha de ingreso del empleado
	 */
	EmpleadoConJefe(long p_cuil,
					String p_apellido,
					String p_nombre,
					double p_sueldoBasico,
					Calendar p_fechaIngreso) {
		this.setCuil(p_cuil);
		this.setApellido(p_apellido);
		this.setNombre(p_nombre);
		this.setSueldoBasico(p_sueldoBasico);
		this.setFechaIngreso(p_fechaIngreso);
	}

	/**
	 * Constructor que inicializa los datos del empleado usando solo el año de ingreso.
	 * El día y mes se fijan en 1 de enero.
	 *
	 * @param p_cuil         CUIL del empleado
	 * @param p_apellido     Apellido del empleado
	 * @param p_nombre       Nombre del empleado
	 * @param p_sueldoBasico Sueldo básico del empleado
	 * @param p_anio         Año de ingreso del empleado
	 */
	EmpleadoConJefe(long p_cuil,
					String p_apellido,
					String p_nombre,
					double p_sueldoBasico,
					int p_anio) {
		this.setCuil(p_cuil);
		this.setApellido(p_apellido);
		this.setNombre(p_nombre);
		this.setSueldoBasico(p_sueldoBasico);
		this.setAnioIngreso(p_anio);
	}

	/**
	 * Establece la fecha de ingreso a partir del año.
	 * El día y mes se fijan en 1 de enero.
	 *
	 * @param p_anio Año de ingreso
	 */
	private void setAnioIngreso(int p_anio) {
		Calendar fechaIngreso = Calendar.getInstance();
		fechaIngreso.set(p_anio, Calendar.JANUARY, 1);
		this.setFechaIngreso(fechaIngreso);
	}

	/**
	 * Obtiene el año de ingreso del empleado.
	 *
	 * @return Año de ingreso
	 */
	public int getAnioIngreso() {
		return this.getFechaIngreso().get(Calendar.YEAR);
	}

	/**
	 * Obtiene el CUIL del empleado.
	 *
	 * @return CUIL
	 */
	public long getCuil() {
		return cuil;
	}

	/**
	 * Asigna el CUIL del empleado.
	 *
	 * @param cuil CUIL del empleado
	 */
	private void setCuil(long cuil) {
		this.cuil = cuil;
	}

	/**
	 * Obtiene el apellido del empleado.
	 *
	 * @return Apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * Asigna el apellido del empleado.
	 *
	 * @param apellido Apellido del empleado
	 */
	private void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * Obtiene el nombre del empleado.
	 *
	 * @return Nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Asigna el nombre del empleado.
	 *
	 * @param nombre Nombre del empleado
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene el sueldo básico del empleado.
	 *
	 * @return Sueldo básico
	 */
	public double getSueldoBasico() {
		return sueldoBasico;
	}

	/**
	 * Asigna el sueldo básico del empleado.
	 *
	 * @param sueldoBasico Sueldo básico a asignar
	 */
	private void setSueldoBasico(double sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}

	/**
	 * Obtiene la fecha de ingreso del empleado.
	 *
	 * @return Fecha de ingreso
	 */
	public Calendar getFechaIngreso() {
		return fechaIngreso;
	}

	/**
	 * Asigna la fecha de ingreso del empleado.
	 *
	 * @param fechaIngreso Fecha de ingreso
	 */
	private void setFechaIngreso(Calendar fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	/**
	 * Obtiene el jefe directo del empleado.
	 *
	 * @return Jefe (EmpleadoConJefe) o null si no tiene
	 */
	public EmpleadoConJefe getJefe() {
		return jefe;
	}

	/**
	 * Asigna el jefe directo del empleado.
	 *
	 * @param jefe Jefe directo
	 */
	private void setJefe(EmpleadoConJefe jefe) {
		this.jefe = jefe;
	}

	/**
	 * Calcula la antigüedad del empleado en años.
	 *
	 * @return Antigüedad en años
	 */
	public int antiguedad() {
		Calendar hoy = Calendar.getInstance();
		int anioActual = hoy.get(Calendar.YEAR);
		return anioActual - this.getFechaIngreso().get(Calendar.YEAR);
	}

	/**
	 * Calcula el descuento aplicado al sueldo.
	 * El descuento es del 2% del sueldo básico más $1500.
	 *
	 * @return Descuento total
	 */
	private double descuento() {
		return this.getSueldoBasico() * 0.02 + 1500;
	}

	/**
	 * Calcula el adicional por antigüedad según la siguiente regla:
	 * - Menos de 2 años: 2%
	 * - Entre 2 y 10 años: 4%
	 * - Más de 10 años: 6%
	 * @return Adicional calculado
	 */
	private double adicional() {
		double adicional;
		if (antiguedad() < 2) {
			adicional = this.getSueldoBasico() * 0.02;
		} else if (antiguedad() < 10) {
			adicional = this.getSueldoBasico() * 0.04;
		} else {
			adicional = this.getSueldoBasico() * 0.06;
		}
		return adicional;
	}

	/**
	 * Calcula el sueldo neto del empleado: sueldo básico + adicional - descuento.
	 *
	 * @return Sueldo neto
	 */
	public double sueldoNeto() {
		return this.getSueldoBasico() + this.adicional() - this.descuento();
	}

	/**
	 * Devuelve el nombre completo en formato "Nombre Apellido".
	 *
	 * @return Nombre y apellido
	 */
	public String nomYApe() {
		return this.getNombre() + " " + this.getApellido();
	}

	/**
	 * Devuelve el nombre completo en formato "Apellido Nombre".
	 *
	 * @return Apellido y nombre
	 */
	public String apeYNom() {
		return this.getApellido() + " " + this.getNombre();
	}

	/**
	 * Muestra los datos completos del empleado por consola,
	 * incluyendo nombre, CUIL, antigüedad, sueldo neto y jefe.
	 */
	public void mostrar() {
		System.out.println("Nombre y Apellido: " + this.nomYApe());
		System.out.println("CUIL: " + this.getCuil() +
							" Antigüedad: " + this.antiguedad() +
							" años de servicio");
		System.out.println("Sueldo Neto: $" + this.sueldoNeto());
		System.out.println("Responde a: " +
							(this.getJefe() != null ?
								this.getJefe().nomYApe() :
								"GERENTE GENERAL"));
	}

	/**
	 * Devuelve los datos resumidos del empleado en una sola línea.
	 *
	 * @return Línea con CUIL, nombre completo y sueldo neto
	 */
	public String mostrarLinea() {
		return this.getCuil() + " " +
				this.nomYApe() +
				"........." +
				this.sueldoNeto();
	}
}
