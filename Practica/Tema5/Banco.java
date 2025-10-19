import java.util.Random;
import java.util.Scanner;

/**
 * TP 3 - Act 5
 * TP 5 - Act 6
 * Prueba la jerarquia de clases Cuenta, CajaDeAhorro y CuentaCorriente.
 *
 * @author Matias Solis Schneeberger
 * @version 2.0.0
 */
public class Banco {
    public static void main(String[] p_args) {
        Scanner teclado = new Scanner(System.in);

        boolean salir = false;
        int opcion;
        final int MAX_ARRAY = 5;

        Cuenta[] cuentas = new Cuenta[MAX_ARRAY];

        Persona persona1 = new Persona(46516214, "Matias", "Solis Schneeberger", 2005);
        Persona persona2 = new Persona(48685387, "Nicolas", "Solis Schneeberger", 2008);

        cuentas[0] = new CajaDeAhorro(455874, persona1, 2500);
        cuentas[1] = new CuentaCorriente(985698, persona2, 5200);

        int cantidadCuentas = 2;
        while (!salir) {
            System.out.println("\n=== Menu Banco ===");
            System.out.println("[1] Crear Caja de Ahorro");
            System.out.println("[2] Crear Cuenta Corriente");
            System.out.println("[3] Realizar un deposito");
            System.out.println("[4] Realizar una extraccion");
            System.out.println("[5] Mostrar una cuenta");
            System.out.println("[6] Mostrar todas las cuentas");
            System.out.println("[0] Salir");
            System.out.print("Ingresar opcion: ");
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1: // Crear Caja de Ahorro
                case 2: // Crear Cuenta Corriente
                    System.out.println("--- Crear Cuenta ---");
                    if (cantidadCuentas >= MAX_ARRAY) {
                        System.out.println("No se pueden crear mas cuentas (limite alcanzado).");
                        break;
                    }

                    // Creando la persona
                    System.out.print("Ingresar DNI: ");
                    int DNI = teclado.nextInt();
                    teclado.nextLine();
                    System.out.print("Ingresar nombre: ");
                    String nombre = teclado.nextLine();
                    System.out.print("Ingresar apellido: ");
                    String apellido = teclado.nextLine();
                    System.out.print("Ingresar anio de nacimiento: ");
                    int anio = teclado.nextInt();
                    teclado.nextLine();
                    Persona persona = new Persona(DNI, nombre, apellido, anio);

                    System.out.print("Ingresar monto inicial: ");
                    double monto = teclado.nextDouble();
                    teclado.nextLine();

                    Random random = new Random();
                    int nro = 1000 + random.nextInt(9000);

                    if (opcion == 1) {
                        cuentas[cantidadCuentas] = new CajaDeAhorro(nro, persona, monto);
                        System.out.println("Caja de Ahorro creada con exito.");
                    } else {
                        cuentas[cantidadCuentas] = new CuentaCorriente(nro, persona, monto);
                        System.out.println("Cuenta Corriente creada con exito.");
                    }
                    cantidadCuentas++;
                    break;

                case 3: // Depositar
                    if (cantidadCuentas == 0) {
                        System.out.println("No hay cuentas disponibles. Cree una cuenta primero.");
                        break;
                    }

                    System.out.println("--- 3. Realizar un Deposito ---");
                    System.out.println("Seleccione la cuenta:");

                    // Bucle para mostrar las cuentas disponibles
                    for (int i = 0; i < cantidadCuentas; i++) {
                        Cuenta cuenta = cuentas[i];
                        System.out.println("[" + (i + 1) + "] " + cuenta.getTitular().nomYApe());
                    }

                    System.out.print("Ingresar numero de cuenta deseada: ");
                    int nCuenta = teclado.nextInt() - 1;
                    teclado.nextLine();

                    if (nCuenta < 0 || nCuenta >= cantidadCuentas) {
                        System.out.println("Error: Cuenta invalida.");
                        break;
                    }

                    // deposito
                    System.out.println("Cuenta seleccionada: " + cuentas[nCuenta].getTitular().nomYApe());
                    System.out.print("Ingresar monto a depositar (0 para cancelar): ");
                    double deposito = teclado.nextDouble();
                    teclado.nextLine();

                    if (deposito <= 0) {
                        System.out.println("Deposito cancelado.");
                        break;
                    }

                    cuentas[nCuenta].depositar(deposito);
                    System.out.println("Deposito exitoso.");
                    System.out.println("Nuevo Saldo: " + cuentas[nCuenta].getSaldo());
                    break;

                case 4: // Extraer
                    if (cantidadCuentas == 0) {
                        System.out.println("No hay cuentas disponibles. Cree una cuenta primero.");
                        break;
                    }

                    System.out.println("--- 4. Realizar una Extraccion ---");
                    System.out.println("Seleccione la cuenta:");

                    for (int i = 0; i < cantidadCuentas; i++) {
                        Cuenta cuenta = cuentas[i];
                        System.out.println("[" + (i + 1) + "] " + cuenta.getTitular().nomYApe());
                    }

                    System.out.print("Ingresar numero de cuenta deseada: ");
                    nCuenta = teclado.nextInt() - 1;
                    teclado.nextLine();

                    if (nCuenta < 0 || nCuenta >= cantidadCuentas) {
                        System.out.println("Error: Cuenta invalida.");
                        break;
                    }

                    // extraccion
                    System.out.println("Cuenta seleccionada:" + cuentas[nCuenta].getTitular().nomYApe());
                    System.out.print("Ingresar monto a extraer (0 para cancelar): ");
                    double extraccion = teclado.nextDouble();
                    teclado.nextLine();

                    if (extraccion <= 0) {
                        System.out.println("Extraccion cancelada.");
                        break;
                    }

                    cuentas[nCuenta].extraer(extraccion);

                    System.out.println("Extraccion procesada.");
                    System.out.println("Nuevo Saldo: " + cuentas[nCuenta].getSaldo());
                    break;

                case 5: // Mostrar una cuenta
                    System.out.print("Seleccione cuenta (1 a " + cantidadCuentas + "): ");
                    nCuenta = teclado.nextInt() - 1;
                    teclado.nextLine();


                    if (nCuenta < 0 || nCuenta >= cantidadCuentas) {
                        System.out.println("Error: Cuenta invalida.");
                        break;
                    }

                    cuentas[nCuenta].mostrar();
                    break;

                case 6: // Mostrar todas
                    System.out.println("--- Todas las cuentas ---");
                    for (int i = 0; i < cantidadCuentas; i++) {
                        cuentas[i].mostrar();
                        System.out.println("--------------------");
                    }
                    break;

                case 0:
                    salir = true;
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opcion invalida.");
                    break;
            }
        }
        teclado.close();
    }
}