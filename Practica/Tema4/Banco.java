import java.util.ArrayList;

/**
 * TP 4 - Act 4
 * La clase Banco representa una entidad bancaria con información sobre
 * su nombre, número de la sucursal, localidad y lista de empleados.
 * Permite gestionar empleados, calcular nóminas y mostrar información relacionada.
 *
 * @author Matias Solis Schneeberger
 * @version 1.0
 */
public class Banco {
	private String nombre;
	private int nroSucursal;
	private Localidad localidad;
	private ArrayList<Empleado> empleados;

	/**
	 * Construye un objeto Banco con un empleado inicial.
	 *
	 * @param p_nombre      Nombre del banco
	 * @param p_localidad   Localidad donde se encuentra el banco
	 * @param p_nroSucursal Número de identificación de la sucursal
	 * @param p_empleado    Primer empleado asignado al banco
	 */
	Banco(String p_nombre,
		  Localidad p_localidad,
		  int p_nroSucursal,
		  Empleado p_empleado) {
		this.setNombre(p_nombre);
		this.setLocalidad(p_localidad);
		this.setNroSucursal(p_nroSucursal);
		this.setEmpleados(new ArrayList<>());
		this.agregarEmpleado(p_empleado);
	}

	/**
	 * Construye un objeto Banco con una lista existente de empleados.
	 *
	 * @param p_nombre      Nombre del banco
	 * @param p_localidad   Localidad donde se encuentra el banco
	 * @param p_nroSucursal Número de identificación de la sucursal
	 * @param p_empleados   Lista de empleados asignados al banco
	 */
	Banco(String p_nombre,
		  Localidad p_localidad,
		  int p_nroSucursal,
		  ArrayList<Empleado> p_empleados) {
		this.setNombre(p_nombre);
		this.setLocalidad(p_localidad);
		this.setNroSucursal(p_nroSucursal);
		this.setEmpleados(p_empleados);
	}

	/**
	 * Obtiene el nombre del banco.
	 *
	 * @return Nombre actual del banco
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre del banco.
	 *
	 * @param p_nombre Nuevo nombre para el banco
	 */
	private void setNombre(String p_nombre) {
		this.nombre = p_nombre;
	}

	/**
	 * Obtiene el número de sucursal.
	 *
	 * @return Número de identificación de la sucursal
	 */
	public int getNroSucursal() {
		return nroSucursal;
	}

	/**
	 * Establece el número de sucursal.
	 *
	 * @param p_nroSucursal Nuevo número de sucursal
	 */
	private void setNroSucursal(int p_nroSucursal) {
		this.nroSucursal = p_nroSucursal;
	}

	/**
	 * Obtiene la localidad del banco.
	 *
	 * @return Objeto Localidad asociado al banco
	 */
	public Localidad getLocalidad() {
		return localidad;
	}

	/**
	 * Establece la localidad del banco.
	 *
	 * @param p_localidad Nueva localidad para el banco
	 */
	private void setLocalidad(Localidad p_localidad) {
		this.localidad = p_localidad;
	}

	/**
	 * Obtiene la lista de empleados del banco.
	 *
	 * @return ArrayList con todos los empleados
	 */
	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	/**
	 * Establece la lista de empleados del banco.
	 *
	 * @param p_empleados Nueva lista de empleados
	 */
	private void setEmpleados(ArrayList<Empleado> p_empleaods) {
		this.empleados = p_empleaods;
	}

	/**
	 * Agrega un empleado a la lista del banco.
	 *
	 * @param p_empleado Empleado a agregar
	 * @return true si se agregó correctamente, false en caso contrario
	 */
	public boolean agregarEmpleado(Empleado p_empleado) {
		return this.getEmpleados().add(p_empleado);
	}

	/**
	 * Elimina un empleado de la lista del banco.
	 *
	 * @param p_empleado Empleado a eliminar
	 * @return true si se eliminó correctamente, false en caso contrario
	 */
	public boolean quitarEmpleado(Empleado p_empleado) {
		return this.getEmpleados().remove(p_empleado);
	}

	/**
	 * Calcula el total de sueldos netos a pagar a todos los empleados.
	 *
	 * @return Sumatoria de todos los sueldos netos
	 */
	public double sueldoAPagar() {
		double total = 0;
		for (Empleado empleado : empleados) {
			total += empleado.sueldoNeto();
		}
		return total;
	}

	/**
	 * Muestra en consola un listado formateado de los sueldos de todos los empleados,
	 * incluyendo CUIL, apellido y nombre, y sueldo neto.
	 */
	public void listarSueldos() {
		for (Empleado empleado : empleados) {
			System.out.printf("%-15s %-20s $%9.2f%n",
					empleado.getCuil(),
					empleado.getApellido() + ", " + empleado.getNombre(),
					empleado.sueldoNeto());
		}
	}

	/**
	 * Muestra información completa del banco incluyendo:
	 * - Nombre y número de la sucursal
	 * - Detalles de la localidad
	 * - Listado de sueldos de empleados
	 * - Total general de sueldos a pagar
	 */
	public void mostrar() {
		System.out.println("Banco: " + this.getNombre() +
				"\tSucursal: " + this.getNroSucursal());
		System.out.println(getLocalidad().mostrar());

		System.out.println();
		this.listarSueldos();
		System.out.println();

		System.out.printf("\u001B[1mTotal a Pagar\u001B[0m ---------------------- $%9.2f",
				this.sueldoAPagar());
	}
}