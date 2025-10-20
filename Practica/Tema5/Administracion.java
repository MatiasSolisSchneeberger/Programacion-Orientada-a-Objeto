import java.util.Scanner;

/**
 * TP 5 - Act 7
 * Clase ejecutable para el Ejercicio 7.
 * Permite crear un Jardin, agregarle figuras geometricas
 * y calcular el presupuesto de pintura.
 *
 * @author Matias Solis Schneeberger
 * @version 1.0.0
 */
public class Administracion {
    public static void main(String[] p_args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("--- Administracion del Jardin (Ejercicio 7) ---");

        // 1. Crear el Jardin
        System.out.print("Ingrese el nombre del Jardin (para el presupuesto): ");
        String nombreJardin = teclado.nextLine();

        Jardin miJardin = new Jardin(nombreJardin);
        System.out.println("Jardin '" + miJardin.getNombre() + "' creado.");

        int opcion = -1; // Inicializamos la opcion

        // 2. Iniciar Menu
        do {
            System.out.println("\n--- Menu Jardin: " + miJardin.getNombre() + " ---");
            System.out.println("1. Agregar Figura");
            System.out.println("2. Eliminar Figura");
            System.out.println("3. Mostrar Presupuesto Detallado");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = Integer.parseInt(teclado.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("\n--- 1. Agregar Figura ---");
                    System.out.println("¿Que tipo de figura desea agregar?");
                    System.out.println("  1. Triángulo");
                    System.out.println("  2. Rectángulo");
                    System.out.println("  3. Cuadrado");
                    System.out.println("  4. Elipse");
                    System.out.println("  5. Círculo");
                    System.out.print("Tipo: ");

                    int tipoFigura = Integer.parseInt(teclado.nextLine());

                    System.out.println("Ingrese el Punto de Origen (centro/esquina):");
                    System.out.print("  Coordenada X: ");
                    double x = Double.parseDouble(teclado.nextLine());
                    System.out.print("  Coordenada Y: ");
                    double y = Double.parseDouble(teclado.nextLine());
                    Punto origen = new Punto(x, y);

                    switch (tipoFigura) {
                        case 1: // Triangulo
                            System.out.print("Ingrese la Base: ");
                            double base = Double.parseDouble(teclado.nextLine());
                            System.out.print("Ingrese la Altura: ");
                            double altura = Double.parseDouble(teclado.nextLine());
                            miJardin.agregarFigura(new Triangulo(base, altura, origen));
                            System.out.println("Triángulo agregado.");
                            break;

                        case 2: // Rectangulo
                            System.out.print("Ingrese el Ancho: ");
                            double ancho = Double.parseDouble(teclado.nextLine());
                            System.out.print("Ingrese el Alto: ");
                            double alto = Double.parseDouble(teclado.nextLine());
                            miJardin.agregarFigura(new Rectangulo(origen, ancho, alto));
                            System.out.println("Rectángulo agregado.");
                            break;

                        case 3: // Cuadrado
                            System.out.print("Ingrese el Lado: ");
                            double lado = Double.parseDouble(teclado.nextLine());
                            miJardin.agregarFigura(new Cuadrado(lado, origen));
                            System.out.println("Cuadrado agregado.");
                            break;

                        case 4: // Elipse
                            System.out.print("Ingrese el Semieje Mayor: ");
                            double ejeMayor = Double.parseDouble(teclado.nextLine());
                            System.out.print("Ingrese el Semieje Menor: ");
                            double ejeMenor = Double.parseDouble(teclado.nextLine());
                            miJardin.agregarFigura(new Elipse(ejeMayor, ejeMenor, origen));
                            System.out.println("Elipse agregada.");
                            break;

                        case 5: // Circulo
                            System.out.print("Ingrese el Radio: ");
                            double radio = Double.parseDouble(teclado.nextLine());
                            miJardin.agregarFigura(new Circulo(radio, origen));
                            System.out.println("Círculo agregado.");
                            break;

                        default:
                            System.out.println("Tipo de figura no válido.");
                            break;
                    }
                    break; // Fin Case 1

                case 2:
                    System.out.println("\n--- 2. Eliminar Figura ---");
                    if (miJardin.getFiguras().isEmpty()) {
                        System.out.println("No hay figuras para eliminar.");
                        break;
                    }

                    System.out.println("Seleccione la figura a eliminar:");
                    int index = 1;
                    for (FiguraGeometrica fig : miJardin.getFiguras()) {
                        System.out.println("  [" + index + "] "
                                + fig.nombreFigura() +
                                " (Superficie: " + fig.superficie() + ")");
                        index++;
                    }
                    System.out.print("Numero a eliminar: ");
                    int numEliminar = Integer.parseInt(teclado.nextLine());

                    if (numEliminar > 0 && numEliminar <= miJardin.getFiguras().size()) {
                        FiguraGeometrica figEliminada = miJardin.getFiguras().get(numEliminar - 1);
                        miJardin.eliminarFigura(figEliminada);
                        System.out.println(figEliminada.nombreFigura() + " eliminado.");
                    } else {
                        System.out.println("Numero fuera de rango.");
                    }
                    break; // Fin Case 2

                case 3:
                    System.out.println("\n--- 3. Presupuesto Detallado ---");
                    miJardin.detalleFiguras();
                    break; // Fin Case 3

                case 0:
                    System.out.println("Saliendo de la administracion del jardin...");
                    break; // Fin Case 0

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }

        } while (opcion != 0);

        teclado.close();
    }
}