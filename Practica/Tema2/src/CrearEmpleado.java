public class CrearEmpleado {
	public static void main(String[] args) {
		Empleado empleado1 = new Empleado(
				488755512,
				"Perex",
				"Juanx",
				30000,
				2001);
		Empleado empleado2 = new Empleado(
				984561234,
				"Delfina",
				"Narvaez",
				45000,
				1950);


		empleado1.mostrar();
		System.out.print("\n");
		empleado2.mostrar();
		System.out.print("\n");
		empleado1.mostrarLinea();
		empleado2.mostrarLinea();
	}
}
