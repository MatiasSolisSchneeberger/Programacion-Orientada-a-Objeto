import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class AplicacionBanco {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1. Crear banco
		System.out.println("=== Creación del Banco ===");
		System.out.print("Nombre del banco: ");
		String nombreBanco = sc.nextLine();

		System.out.println();

		System.out.println("Datos de la localidad:");
		System.out.print("Ciudad: ");
		String ciudad = sc.nextLine();

		System.out.print("Provincia: ");
		String provincia = sc.nextLine();

		Localidad loc = new Localidad(ciudad, provincia);

		Banco banco = new Banco(nombreBanco, loc, 1, new ArrayList<>(), new ArrayList<>());

		System.out.println();

		int opcion;
		do {
			System.out.println("--- MENÚ BANCO ---");
			System.out.println("1. Agregar empleado");
			System.out.println("2. Quitar empleado");
			System.out.println("3. Agregar cliente (cuenta bancaria)");
			System.out.println("4. Quitar cliente (cuenta bancaria)");
			System.out.println("5. Mostrar empleados");
			System.out.println("6. Mostrar clientes");
			System.out.println("7. Mostrar resumen del banco");
			System.out.println("8. Salir");
			System.out.print("Seleccione una opción: ");
			opcion = sc.nextInt();
			sc.nextLine();

			System.out.println();

			switch (opcion) {
				case 1:
					System.out.println("--- Agregar Empleado ---");
					System.out.print("CUIL: ");
					long cuilEmp = sc.nextLong();
					sc.nextLine();
					System.out.print("Apellido: ");
					String apeEmp = sc.nextLine();

					System.out.print("Nombre: ");
					String nomEmp = sc.nextLine();

					System.out.print("Sueldo básico: ");
					double sueldo = sc.nextDouble();

					sc.nextLine();

					Empleado emp = new Empleado(cuilEmp, apeEmp, nomEmp, sueldo, Calendar.getInstance());
					banco.agregarEmpleado(emp);
					System.out.println("Empleado agregado");
					break;

				case 2:
					System.out.println("--- Eliminar Empleado ---");
					System.out.print("\nCUIL: ");
					long cuilEliminar = sc.nextLong();
					sc.nextLine();

					boolean encontrado = false;

					for (Empleado e : new ArrayList<>(banco.getEmpleados())) {
						if (e.getCuil() == cuilEliminar) {
							banco.quitarEmpleado(e);
							System.out.println("Empleado eliminado");
							encontrado = true;
							break;
						}
					}

					if (!encontrado) System.out.println("Empleado no encontrado");

					break;

				case 3:
					System.out.println("--- Agregar Cliente / Cuenta ---");

					System.out.print("Número de cuenta: ");
					int nroCuenta = sc.nextInt();
					sc.nextLine();

					System.out.print("Numero de DNI del titular: ");
					int DNICli = sc.nextInt();

					sc.nextLine();

					System.out.print("Apellido del titular: ");
					String apeCli = sc.nextLine();

					System.out.print("Nombre del titular: ");
					String nomCli = sc.nextLine();

					// Fecha de nacimiento
					System.out.println("Fecha de nacimiento del titular:");
					System.out.print("\tDía: ");
					int diaNac = sc.nextInt();

					System.out.print("\tMes (1-12): ");
					int mesNac = sc.nextInt();

					System.out.print("\tAño: ");
					int anioNac = sc.nextInt();

					sc.nextLine();

					// Crear Calendar
					Calendar fechaNacimiento = Calendar.getInstance();
					fechaNacimiento.set(anioNac, mesNac - 1, diaNac);

					// Crear Persona con Calendar
					Persona titular = new Persona(DNICli, nomCli, apeCli, fechaNacimiento);

					CuentaBancaria cuenta = new CuentaBancaria(nroCuenta, titular);
					banco.agregarCuentaBancaria(cuenta);
					System.out.println("Cuenta agregada");
					break;

				case 4:
					System.out.print("\nNúmero de cuenta a eliminar: ");
					int nroQuitar = sc.nextInt();
					sc.nextLine();

					boolean encontrada = false;

					for (CuentaBancaria cuentaBancaria : new ArrayList<>(banco.getCuentasBancarias())) {
						if (cuentaBancaria.getNroCuenta() == nroQuitar) {
							encontrada = true;
							banco.quitarCuentaBancaria(cuentaBancaria);

							break;
						}
					}

					System.out.println(encontrada ? "Cuenta eliminada" : "Cuenta no encontrada");

					break;

				case 5:
					System.out.println("--- Empleados ---");
					banco.listarSueldos();
					break;

				case 6:
					System.out.println("--- Clientes / Cuentas ---");
					for (CuentaBancaria c : banco.getCuentasBancarias()) {
						System.out.println("Cuenta: " + c.getNroCuenta() + " Titular: " + c.getTitular().nomYApe());
					}
					break;

				case 7:
					System.out.println("--- Resumen del Banco ---");
					banco.mostrarResumen();
					break;

				case 8:
					System.out.println("Saliendo...");
					break;

				default:
					System.out.println("Opción inválida");
			}

		} while (opcion != 8);

		sc.close();
	}
}
