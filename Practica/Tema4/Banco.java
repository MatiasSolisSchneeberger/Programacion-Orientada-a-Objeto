import java.util.ArrayList;

public class Banco {
	private String nombre;
	private int nroSucursal;
	private Localidad localidad;
	private ArrayList<Empleado> empleados;

	// constructor para 1 empleado
	Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, Empleado p_empleado) {
		this.setNombre(p_nombre);
		this.setLocalidad(p_localidad);
		this.setNroSucursal(p_nroSucursal);
		this.setEmpleados(new ArrayList<>());
		this.agregarEmpleado(p_empleado);
	}

	// constructor para n empleados
	Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList<Empleado> p_empleados) {
		this.setNombre(p_nombre);
		this.setLocalidad(p_localidad);
		this.setNroSucursal(p_nroSucursal);
		this.setEmpleados(p_empleados);
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNroSucursal() {
		return nroSucursal;
	}

	private void setNroSucursal(int nroSucursal) {
		this.nroSucursal = nroSucursal;
	}

	public Localidad getLocalidad() {
		return localidad;
	}

	private void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	private void setEmpleados(ArrayList<Empleado> empleaods) {
		this.empleados = empleaods;
	}

	public boolean agregarEmpleado(Empleado p_empleado) {
		return this.getEmpleados().add(p_empleado);
	}

	public boolean quitarEmpleado(Empleado p_empleado) {
		return this.getEmpleados().remove(p_empleado);
	}

	public double sueldoAPagar() {
		double total = 0;
		for (Empleado empleado : empleados) {
			total += empleado.sueldoNeto();
		}
		return total;
	}

	public void listarSueldos() {
		for (Empleado empleado : empleados) {
			System.out.printf("%-15s %-20s $%9.2f%n",
					empleado.getCuil(),
					empleado.getApellido() + ", " + empleado.getNombre(),
					empleado.sueldoNeto());
		}

	}

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

