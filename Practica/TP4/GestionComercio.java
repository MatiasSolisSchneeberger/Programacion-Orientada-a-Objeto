import java.util.Calendar;
import java.util.Scanner;

public class GestionComercio {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("*******************************");
		System.out.println("***** GESTION DE COMERCIO *****");
		System.out.println("*******************************");

		System.out.println();
		System.out.println();
		System.out.println();

		System.out.print("- Ingresar Nombre del comercio: ");
		String nombreComercio = teclado.nextLine();

		Comercio comercio1 = new Comercio(nombreComercio);
		comercio1.altaEmpleado(new Empleado(2046516214,
				"Solis",
				"Matias",
				50000,
				Calendar.getInstance()));
		int opcion;
		do {
			System.out.println("------ Menu de opciones | "
					+ comercio1.getNombre()
					+ " ------");
			System.out.println("\t[1] Alta Empleado");
			System.out.println("\t[2] Baja Empleado");
			System.out.println("\t[3] Verificar Empleado");
			System.out.println("\t[4] Sueldo Neto");
			System.out.println("\t[5] Cantidad de empleados");
			System.out.println("\t[6] Mostrar Nomina");
			System.out.println("\t[0] Salir");
			System.out.print("\tOpcion: ");

			opcion = teclado.nextInt();

			switch (opcion) {
				case 1:
					System.out.println("--- Alta Empleado ---");
					System.out.print("Ingresar CUIL: ");
					long cuil = teclado.nextLong();
					System.out.println("Ingresar Apellido: ");
					String apellido = teclado.nextLine();
					teclado.nextLine();
					System.out.println("Ingresar Nombre: ");
					String nombre = teclado.nextLine();

					System.out.print("Ingresar Sueldo Basico: ");
					double sueldoBasico = teclado.nextDouble();
					System.out.print("Ingresar la fecha del ingreso: ");
					// tendría que verificar que la fecha no sea mayor a la actual
					// y que el anio no sea menor a 1900
					// ademas de verificar que el dia y mes sean correctos
					// no la quiero complicar tanto
					// si me sobra el tiempo si (mentira nunca lo voy a hacer)
					System.out.print("\tDia (numero): ");
					int dia = teclado.nextInt();
					System.out.print("\tMes (en numero): ");
					int mes = teclado.nextInt();
					System.out.print("\tAnio: ");
					int anio = teclado.nextInt();
					Calendar fechaIngreso = Calendar.getInstance();
					// supuestamente se recomienda usar Calendar.`MES`
					// pero nosé como cambiarlo de numero a ese formato
					fechaIngreso.set(anio, mes - 1, dia);

					// creando Empleado
					Empleado nuevoEmpleado = new Empleado(cuil, apellido, nombre, sueldoBasico, fechaIngreso);

					comercio1.altaEmpleado(nuevoEmpleado);

					break;
				case 2:
					System.out.println("--- Baja Empleado ---");
					System.out.println("Ingresar CUIL del empleado a dar de baja: ");
					long cuilBaja = teclado.nextLong();
					// confirmacion
					System.out.print("¿Desea eliminar a: "
							+ comercio1.buscarEmpleado(cuilBaja).nomYApe() + "? S/N");
					String respuesta = teclado.next().toUpperCase();

					if (respuesta.equals("S")) {
						System.out.println("Empleado \""
								+ comercio1.bajaEmpleado(cuilBaja).nomYApe()
								+ "\" eliminado.");
						comercio1.bajaEmpleado(cuilBaja);
					} else {
						System.out.println("Operacion cancelada.");
					}
					break;
				case 3:
					System.out.println("--- Verificar Empleado ---");
					System.out.println("Ingresar CUIL del empleado a verificar: ");
					long cuilVerificar = teclado.nextLong();

					if (comercio1.esEmpleado(cuilVerificar)) {
						System.out.println("Es empleado");
					} else {
						System.out.println("No es empleado");
					}
					break;
				case 4:
					System.out.println("--- Sueldo Neto ---");
					System.out.println("Ingresar CUIL del empleado a calcular el sueldo neto: ");
					long cuilSueldo = teclado.nextLong();
					comercio1.sueldoNeto(cuilSueldo);
					break;
				case 5:
					System.out.println("--- Cantidad de empleados ---");
					System.out.println("Hay" + comercio1.cantidadDeEmpleados() +
							" empleados en el comercio.");
					break;

				case 6:
					System.out.println("--- Mostrar Nomina ---");
					comercio1.nomina();
				case 0:
					System.out.println("Salir");
					break;
				default:
					System.out.println("Opcion no valida");
					break;
			}
		} while (opcion != 0);

	}
}