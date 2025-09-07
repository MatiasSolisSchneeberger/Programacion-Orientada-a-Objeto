import java.util.Scanner;
import java.util.Random;


/**
 * TP 3 - Act 5
 *
 * @author Matias Solis Schneeberger
 * @version 1.0
 */
public class EjecutableCuentaBancaria {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		boolean salir = false;
		int opcion;
		final int MAX_ARRAY = 5;
		CuentaBancaria[] cuentas = new CuentaBancaria[MAX_ARRAY];

		Persona persona1 = new Persona(46516214, "Matias", "Solis Schneeberger", 2005);
		Persona persona2 = new Persona(48685387, "Nicolas", "Solis Schneeberger", 2008);
		cuentas[0] = new CuentaBancaria(455874, persona1, 2500);
		cuentas[1] = new CuentaBancaria(985698, persona2, 5200);

		int cantidadCuentas = 2;
		while (!salir) {
			System.out.println("\n=== Menú ===");
			System.out.println("[1] Crear cuenta");
			System.out.println("[2] Realizar un deposito");
			System.out.println("[3] Realizar una extraccion");
			System.out.println("[4] Mostrar una cuenta");
			System.out.println("[5] Mostrar todas las cuentas");
			System.out.println("[0] Salir");
			System.out.print("Ingresar opcion: ");
			opcion = teclado.nextInt();

			switch (opcion) {
				case 1:
					System.out.println("--- Crear Cuenta ---");
					if (cantidadCuentas >= MAX_ARRAY) {
						System.out.println("No se pueden crear más cuentas (límite alcanzado).");
						break;
					}

					// Creando persona
					System.out.print("Ingresar DNI: ");
					int DNI = teclado.nextInt();
					teclado.nextLine(); // limpiar el salto de línea pendiente

					System.out.print("Ingresar nombre: ");
					String nombre = teclado.nextLine();

					System.out.print("Ingresar apellido: ");
					String apellido = teclado.nextLine();

					System.out.print("Ingresar año de nacimiento: ");
					int anio = teclado.nextInt();

					Persona persona = new Persona(DNI, nombre, apellido, anio);

					// Ingresar monto
					System.out.print("Ingresar monto inicial: ");
					double monto = teclado.nextDouble();

					Random random = new Random();
					int nro = 1000 + random.nextInt(9000); // número aleatorio de 4 cifras
					// Creando cuenta
					// 0 -> constructor sin monto; !0 -> constructor con monto
					if (monto == 0) {
						cuentas[cantidadCuentas] = new CuentaBancaria(nro, persona);
					} else {
						cuentas[cantidadCuentas] = new CuentaBancaria(nro, persona, monto);
					}
					cantidadCuentas++;
					System.out.println("Cuenta creada con éxito.");
					break;

				case 2: // Depositar
					if (cantidadCuentas == 0) {
						System.out.println("No hay cuentas disponibles. Cree una cuenta primero.");
						break;
					}

					System.out.println("--- Ingresar dinero ---");
					for (int i = 0; i < cantidadCuentas; i++) {
						System.out.println((i + 1) + "- " + cuentas[i].toStrinf());
					}

					System.out.print("Ingresar número de cuenta deseada: ");
					int nCuenta = teclado.nextInt() - 1;

					if (nCuenta < 0 || nCuenta >= cantidadCuentas) {
						System.out.println("Cuenta inválida.");
						break;
					}

					System.out.println("Cuenta seleccionada: " + cuentas[nCuenta].toStrinf());
					System.out.print("Ingresar monto a depositar (0 para cancelar): ");
					double deposito = teclado.nextDouble();
					if (deposito == 0) {
						System.out.println("Depósito cancelado");
						break;
					}

					System.out.println("+ " + cuentas[nCuenta].depositar(deposito));
					System.out.println("Depósito exitoso.");
					break;

				case 3: // Extraer
					if (cantidadCuentas == 0) {
						System.out.println("No hay cuentas disponibles. Cree una cuenta primero.");
						break;
					}

					System.out.println("--- Extraer dinero ---");
					for (int i = 0; i < cantidadCuentas; i++) {
						System.out.println((i + 1) + "- " + cuentas[i].toStrinf());
					}

					System.out.print("Ingresar número de cuenta deseada: ");
					nCuenta = teclado.nextInt() - 1;

					if (nCuenta < 0 || nCuenta >= cantidadCuentas) {
						System.out.println("Cuenta inválida.");
						break;
					}

					System.out.println("Cuenta seleccionada: " + cuentas[nCuenta].toStrinf());
					System.out.print("Ingresar monto a extraer (0 para cancelar): ");
					double extraccion = teclado.nextDouble();
					if (extraccion == 0) {
						System.out.println("Extracción cancelada");
						break;
					}

					System.out.println("- " + cuentas[nCuenta].extraer(extraccion));
					System.out.println("Extracción realizada.");
					break;

				case 4: // Mostrar una cuenta
					if (cantidadCuentas == 0) {
						System.out.println("No hay cuentas para mostrar.");
						break;
					}

					System.out.println("--- Mostrar una cuenta ---");
					for (int i = 0; i < cantidadCuentas; i++) {
						System.out.println((i + 1) + "- " + cuentas[i].toStrinf());
					}

					System.out.print("Ingresar número de cuenta deseada: ");
					nCuenta = teclado.nextInt() - 1;

					if (nCuenta < 0 || nCuenta >= cantidadCuentas) {
						System.out.println("Cuenta inválida.");
						break;
					}

					cuentas[nCuenta].mostrar();
					break;

				case 5: // Mostrar todas
					if (cantidadCuentas == 0) {
						System.out.println("No hay cuentas para mostrar.");
					} else {
						System.out.println("--- Todas las cuentas ---");
						for (int i = 0; i < cantidadCuentas; i++) {
							System.out.println(cuentas[i].toStrinf());
						}
					}
					break;

				case 0:
					salir = true;
					System.out.println("Saliendo del sistema...");
					break;

				default:
					System.out.println("Opción inválida.");
					break;
			}
		}
		teclado.close();
	}
}
