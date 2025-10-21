import java.util.Scanner;
import java.util.ArrayList;

/**
 * TP 5 - Act 8
 * Clase ejecutable para simular consultas de creditos en un Comercio.
 *
 * @author Matias Solis Schneeberger
 * @version 1.0.0
 */
public class Comercio {

    /**
     * Metodo principal que inicia el menu del comercio.
     *
     * @param p_args Argumentos de linea de comandos (no se utilizan).
     */
    public static void main(String[] p_args) {

        Scanner scanner = new Scanner(System.in);

        // 1. Creamos la lista de artefactos que ofrece el comercio
        ArrayList<ArtefactoHogar> inventario = new ArrayList<>();

        // 2. Creamos los artefactos de ejemplo del PDF
        inventario.add(new Cocina(4, 2000, "80*60*60cm", "Volcan", 600.0f, 15));
        inventario.add(new Heladera(4, 2, true, "Gafa", 1200.0f, 8));
        inventario.add(new Lavarropas(5, 6.0f, false, "Drean", 750.0f, 10));

        System.out.println("Sistema de Simulacion de Creditos del Comercio.");

        int opcion;
        do {
            System.out.println("\n--- Menu Principal ---");
            System.out.println("1. Simular Consulta de Credito");
            System.out.println("2. Ver todos los Artefactos en Inventario");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            // Si el usuario ingresa texto, el programa fallara.
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {

                // --- OPCION 1: SIMULAR CONSULTA ---
                case 1:
                    System.out.println("\n--- 1. Simular Consulta de Credito ---");
                    if (inventario.isEmpty()) {
                        System.out.println("No hay artefactos en el inventario.");
                        break;
                    }

                    System.out.println("Seleccione el artefacto a simular:");
                    for (int i = 0; i < inventario.size(); i++) {
                        System.out.println("  [" + (i + 1) + "] " +
                                inventario.get(i).getMarca() +
                                " (Precio: $" + inventario.get(i).getPrecio() + ")");
                    }

                    System.out.print("Numero de artefacto: ");
                    int numArtefacto = Integer.parseInt(scanner.nextLine());

                    if (numArtefacto <= 0 || numArtefacto > inventario.size()) {
                        System.out.println("Error: Numero no válido.");
                        break;
                    }

                    ArtefactoHogar arte = inventario.get(numArtefacto - 1);

                    System.out.print("Ingrese la cantidad de cuotas: ");
                    int cuotas = Integer.parseInt(scanner.nextLine());
                    System.out.print("Ingrese el interes (ej: 2.53): ");
                    float interes = Float.parseFloat(scanner.nextLine());

                    System.out.println("\n--- Resultado de la Simulacion ---");
                    arte.imprimir();

                    // Se calculan los valores (usando el metodo corregido)
                    float valorCuota = arte.cuotaCredito(cuotas, interes);
                    float valorAdicional = arte.creditoConAdicional(cuotas, interes);

                    System.out.println("Cuotas: " + cuotas + " - Interes: " + interes + "%");
                    System.out.println("Valor Cuota: " + valorCuota);
                    System.out.println("Valor Cuota Con Adicionales: " + valorAdicional);
                    break;

                // --- OPCION 2: LISTAR TODO EL INVENTARIO ---
                case 2:
                    System.out.println("\n--- 2. Inventario Completo ---");
                    if (inventario.isEmpty()) {
                        System.out.println("No hay artefactos en el inventario.");
                    } else {
                        for (ArtefactoHogar item : inventario) {
                            item.imprimir();
                            System.out.println("---------------------------------");
                        }
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }

        } while (opcion != 0);

        scanner.close();
    }
}