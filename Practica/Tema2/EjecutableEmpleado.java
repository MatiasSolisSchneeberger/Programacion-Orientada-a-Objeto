public class EjecutableEmpleado {
	public static void main(String[] args) {
		long cuil = Long.parseLong(args[0]);
		String apellido = args[1];
		String nombre = args[2];
		double sueldoBasico = Double.parseDouble(args[3]);
		int anioIngreso = Integer.valueOf(args[4]);

		Empleado empleado1 = new Empleado(cuil, apellido, nombre, sueldoBasico, anioIngreso);

		empleado1.mostrar();
		System.out.print("\n");

		empleado1.mostrarLinea();
	}
}
