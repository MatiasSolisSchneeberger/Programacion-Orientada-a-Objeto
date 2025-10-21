import java.util.HashMap;

public class Comercio {
	private String nombre;
	private HashMap<Long, Empleado> empleados;


	Comercio(String p_nombre, HashMap<Long, Empleado> p_empleados) {
		this.setNombre(p_nombre);
		this.setEmpleados(p_empleados);
	}

	Comercio(String p_nombre) {
		this.setNombre(p_nombre);
		this.setEmpleados(new HashMap<>());
	}

	public HashMap<Long, Empleado> getEmpleados() {
		return empleados;
	}

	private void setEmpleados(HashMap<Long, Empleado> empleados) {
		this.empleados = empleados;
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void altaEmpleado(Empleado p_empleado) {
		if (this.esEmpleado(p_empleado.getCuil())) {
			System.out.println("El empleado ya existe");
		} else {
			this.getEmpleados().put(p_empleado.getCuil(), p_empleado);
			System.out.println("Empleado agregado");
		}
	}

	public Empleado bajaEmpleado(long p_cuil) {
		if (this.esEmpleado(p_cuil)) {
			return this.getEmpleados().remove(p_cuil);
		} else {
			System.out.println("El empleado no existe");
			return null;
		}
	}

	public int cantidadDeEmpleados() {
		return this.getEmpleados().size();
	}

	public boolean esEmpleado(long p_cuil) {
		return this.getEmpleados().containsKey(p_cuil);
	}

	public Empleado buscarEmpleado(long p_cuil) {
		if (this.esEmpleado(p_cuil)) {
			return this.getEmpleados().get(p_cuil);
		} else {
			System.out.println("El empleado no existe");
			return null;
		}
	}

	public void sueldoNeto(long p_cuil) {
		Empleado empleado = this.buscarEmpleado(p_cuil);
		if (empleado != null) {
			System.out.println("El sueldo neto de " + empleado.getNombre() + " " + empleado.getApellido() + " es: " + empleado.sueldoNeto());
		} else {
			System.out.println("No existe empleado con ese CUIL");
		}

	}

	public void nomina() {
		System.out.println("**** Nomina de empleados de " + this.getNombre() + " ****");
		for (Empleado empleado : this.getEmpleados().values()) {
			System.out.println(empleado.mostrarLinea());
		}
	}
}
